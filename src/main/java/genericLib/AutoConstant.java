package genericLib;

public interface AutoConstant {
	String getOperation = "/repos/{owner}/{repo}";
	String postOperation = "/user/repos";
	String patchOperation = "/repos/{owner}/{repo}";
	String deleteOperation = "/repos/{owner}/{repo}";
	String propertyFilePath = "./src/test/resources/data.properties";
}
