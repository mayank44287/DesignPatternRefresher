package Structural.Proxy;

interface Downloader{
    void download(String url);
}
class FileDownloaderImpl implements Downloader {
    @Override
    public void download(String url){
        // implementation
    }
}

// Proxy with access control and logging
class DownloadingProxy implements Downloader{
    private FileDownloaderImpl downloader;
    private String user;

    public DownloadingProxy(FileDownloaderImpl downloader, String user){
        this.downloader = downloader;
        this.user = user;
    }

    @Override
    public void download(String url){
        if ( isUserAthorized(user)){
           downloader.download(url);
           logDownload(user, url);
        } else {
            throw new UnauthorizedDownloadException();
        }
    }
    private boolean isUserAuthorized(String user) {
        // ... implementation for checking user permissions

    }

    private void logDownload(String user, String url) {
        // ... implementation for logging download activity
    }
}

/***
 * DownloadingProxy implements the Downloader interface and acts as the Proxy.
 * It controls access by checking user permissions before delegating the download to FileDownloaderImpl.
 * It adds logging functionality to record download activity.
 * The Client interacts with the proxy, unaware of the underlying implementation.
 */

class Client{
    public static void main(String[] args) {
        FileDownloaderImpl downloader = new FileDownloaderImpl();
        DownloadingProxy proxy = new DownloadingProxy(downloader, "admin");
        proxy.download("file.txt");
    }
}
