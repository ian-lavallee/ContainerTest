package com.google.cloud.maven.example;

import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.impl.VersionRangeResolver;
import org.eclipse.aether.resolution.VersionRangeRequest;
import org.eclipse.aether.resolution.VersionRangeResolutionException;
import org.eclipse.aether.resolution.VersionRangeResult;

public class StubVersionRangeResolver implements VersionRangeResolver {

	public VersionRangeResult resolveVersionRange(RepositorySystemSession session, VersionRangeRequest request)
			throws VersionRangeResolutionException {
		// TODO Auto-generated method stub
		return null;
	}

}
