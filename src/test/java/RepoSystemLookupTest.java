import org.codehaus.plexus.PlexusTestCase;
import org.eclipse.aether.RepositorySystem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RepoSystemLookupTest extends PlexusTestCase
{
    @Before
    public void setUp() throws Exception
    {
        super.setUp();
        super.setupContainer();
    }

    @Test
    public void test() throws Exception
    {
        RepositorySystem repositorySystem = (RepositorySystem) super.getContainer().
                lookup(org.eclipse.aether.RepositorySystem.class);
        assertNotNull( repositorySystem );
    }
}
