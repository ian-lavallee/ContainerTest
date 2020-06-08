package com.google.cloud.maven.example;

import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.impl.VersionResolver;
import org.eclipse.aether.resolution.VersionRequest;
import org.eclipse.aether.resolution.VersionResolutionException;
import org.eclipse.aether.resolution.VersionResult;

public class StubVersionResolver implements VersionResolver {

	public VersionResult resolveVersion(RepositorySystemSession session, VersionRequest request)
			throws VersionResolutionException {
		// TODO Auto-generated method stub
		return null;
	}

}
