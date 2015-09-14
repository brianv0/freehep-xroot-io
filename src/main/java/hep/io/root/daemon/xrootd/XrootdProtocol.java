package hep.io.root.daemon.xrootd;

public class XrootdProtocol
{
   public final static int defaultPort = 1094;
   
   public final static int kXR_DataServer = 1;
   public final static int kXR_LBalServer = 0;
   public final static int kXR_maxReqRetry = 10;
   
   public final static int  kXR_auth    =  3000;
   public final static int  kXR_query   =  3001;
   public final static int  kXR_chmod   =  3002;
   public final static int  kXR_close   =  3003;
   public final static int  kXR_dirlist =  3004;
   public final static int  kXR_getfile =  3005;
   public final static int  kXR_protocol=  3006;
   public final static int  kXR_login   =  3007;
   public final static int  kXR_mkdir   =  3008;
   public final static int  kXR_mv      =  3009;
   public final static int  kXR_open    =  3010;
   public final static int  kXR_ping    =  3011;
   public final static int  kXR_putfile =  3012;
   public final static int  kXR_read    =  3013;
   public final static int  kXR_rm      =  3014;
   public final static int  kXR_rmdir   =  3015;
   public final static int  kXR_sync    =  3016;
   public final static int  kXR_stat    =  3017;
   public final static int  kXR_set     =  3018;
   public final static int  kXR_write   =  3019;
   public final static int  kXR_admin   =  3020;
   public final static int  kXR_prepare =  3021;
   public final static int  kXR_statx   =  3022;
   public final static int  kXR_endsess =  3023;
   public final static int  kXR_bind    =  3024;
   public final static int  kXR_readv   =  3025;
   public final static int  kXR_verifyw =  3026;
   public final static int  kXR_locate  =  3027;
   public final static int  kXR_truncate=  3028;

   
   public final static int  kXR_ok       = 0;
   public final static int  kXR_oksofar  = 4000;
   public final static int  kXR_attn     = 4001;
   public final static int  kXR_authmore = 4002;
   public final static int  kXR_error    = 4003;
   public final static int  kXR_redirect = 4004;
   public final static int  kXR_wait     = 4005;
   public final static int  kXR_waitresp = 4006;
   

   public final static int kXR_asyncab   = 5000;
   public final static int kXR_asyndi    = 5001;
   public final static int kXR_asyncms   = 5002;
   public final static int kXR_asyncrd   = 5003;
   public final static int kXR_asyncwt   = 5004;
   public final static int kXR_asyncav   = 5005;
   public final static int kXR_asynunav  = 5006;
   public final static int kXR_asynresp  = 5008;
   
   public final static int kXR_ur = 0x100;
   public final static int kXR_uw = 0x080;
   public final static int kXR_ux = 0x040;
   public final static int kXR_gr = 0x020;
   public final static int kXR_gw = 0x010;
   public final static int kXR_gx = 0x008;
   public final static int kXR_or = 0x004;
   public final static int kXR_ow = 0x002;
   public final static int kXR_ox = 0x001;
   
   public final static int kXR_file = 0;
   public final static int kXR_xset = 1;
   public final static int kXR_isDir = 2;
   public final static int kXR_other = 4;
   public final static int kXR_offline = 8;
   public final static int kXR_readable = 16;
   public final static int kXR_writable = 32;
   
   public final static int kXR_compress = 1;
   public final static int kXR_delete   = 2;
   public final static int kXR_force    = 4;
   public final static int kXR_new      = 8;
   public final static int kXR_open_read= 16;
   public final static int kXR_open_updt= 32;
   public final static int kXR_async    = 64;
   public final static int kXR_refresh  = 128;
   public final static int kXR_mkpath   = 256;
   public final static int kXR_open_apnd= 512;
   public final static int kXR_retstat  = 1024;
   public final static int kXR_replica  = 2048;
   public final static int kXR_ulterior = 4096;
   public final static int kXR_nowait   = 8192;
   
   public final static int kXR_cancel = 1;
   public final static int kXR_notify = 2;
   public final static int kXR_noerrs = 4;
   public final static int kXR_stage  = 8;
   public final static int kXR_wmode  = 16;
   
   public final static int kXR_useruser = 0;
   public final static int kXR_useradmin = 1;
   
   public final static int kXR_QStats = 1;
   public final static int kXR_QPrep = 2; 
   public final static int kXR_Qcksum = 3; 
   public final static int kXR_Qxattr = 4;
   public final static int kXR_Qspace = 5;
   public final static int kXR_Qckscan= 6;
   public final static int kXR_Qconfig= 7;
   public final static int kXR_Qvisa  = 8;
   
   public final static int kXR_asyncap = 128;
   
   public final static int XRD_CLIENT_CURRENTVER = 2; //???
}
