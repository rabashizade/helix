package com.linkedin.clustermanager;

import com.linkedin.clustermanager.agent.zk.ZkClient;

public class CMConnector {
	
	ClusterManager _manager;
	
	public CMConnector(final String clusterName, final String instanceName, final String zkAddr) throws Exception //, final ZkClient zkClient) throws Exception
	{
		 _manager = null;
		 _manager = ClusterManagerFactory
		            .getZKBasedManagerForParticipant(clusterName, instanceName, zkAddr); //, zkClient);
	}
	
	public ClusterManager getManager() {
		return _manager;
	}
}
