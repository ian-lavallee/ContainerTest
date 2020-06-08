package com.google.cloud.maven.example;

import java.util.Collections;
import java.util.Set;

import org.codehaus.plexus.PlexusTestCase;
import org.eclipse.aether.RepositorySystem;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.eclipse.aether.impl.ArtifactDescriptorReader;
import org.eclipse.aether.impl.MetadataGeneratorFactory;
import org.eclipse.aether.impl.VersionRangeResolver;
import org.eclipse.aether.impl.VersionResolver;
import org.eclipse.aether.impl.guice.AetherModule;
import org.eclipse.aether.spi.connector.RepositoryConnectorFactory;
import org.eclipse.aether.spi.connector.transport.TransporterFactory;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;

public class RepoSystemLookupTest extends PlexusTestCase
{
    public class SystemModule extends AbstractModule {

    	@Override
		public void configure() {
            install( new AetherModule() );
            bind( ArtifactDescriptorReader.class ).to( StubArtifactDescriptorReader.class );
            bind( VersionRangeResolver.class ).to( StubVersionRangeResolver.class );
            bind( VersionResolver.class ).to( StubVersionResolver.class );
		}
    	
        @Provides
        public Set<MetadataGeneratorFactory> metadataGeneratorFactories()
        {
            return Collections.emptySet();
        }

        @Provides
        public Set<RepositoryConnectorFactory> repositoryConnectorFactories()
        {
            return Collections.emptySet();
        }

        @Provides
        public Set<TransporterFactory> transporterFactories()
        {
            return Collections.emptySet();
        }


	}

	@Before
    public void setUp() throws Exception
    {
        super.setUp();
        super.setupContainer();
        
       
    }

    @Test
    public void test() throws Exception
    {
        Injector injector = Guice.createInjector( new SystemModule() );
        RepositorySystem repositorySystem =  injector.getInstance( RepositorySystem.class );
        		//(RepositorySystem) super.getContainer().
                // lookup(org.eclipse.aether.RepositorySystem.class);
        Assert.assertNotNull( repositorySystem );
    }
}
