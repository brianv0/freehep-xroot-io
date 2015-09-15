package hep.io.root.daemon.xrootd;

public class XrootdProtocol
{
   public final static short defaultPort = 1094;
   
   public final static short kXR_DataServer = 1;
   public final static short kXR_LBalServer = 0;
   public final static short kXR_maxReqRetry = 10;
   
   public final static short  kXR_auth    =  3000;
   public final static short  kXR_query   =  3001;
   public final static short  kXR_chmod   =  3002;
   public final static short  kXR_close   =  3003;
   public final static short  kXR_dirlist =  3004;
   public final static short  kXR_getfile =  3005;
   public final static short  kXR_protocol=  3006;
   public final static short  kXR_login   =  3007;
   public final static short  kXR_mkdir   =  3008;
   public final static short  kXR_mv      =  3009;
   public final static short  kXR_open    =  3010;
   public final static short  kXR_ping    =  3011;
   public final static short  kXR_putfile =  3012;
   public final static short  kXR_read    =  3013;
   public final static short  kXR_rm      =  3014;
   public final static short  kXR_rmdir   =  3015;
   public final static short  kXR_sync    =  3016;
   public final static short  kXR_stat    =  3017;
   public final static short  kXR_set     =  3018;
   public final static short  kXR_write   =  3019;
   public final static short  kXR_admin   =  3020;
   public final static short  kXR_prepare =  3021;
   public final static short  kXR_statx   =  3022;
   public final static short  kXR_endsess =  3023;
   public final static short  kXR_bind    =  3024;
   public final static short  kXR_readv   =  3025;
   public final static short  kXR_verifyw =  3026;
   public final static short  kXR_locate  =  3027;
   public final static short  kXR_truncate=  3028;

   
   public final static short  kXR_ok       = 0;
   public final static short  kXR_oksofar  = 4000;
   public final static short  kXR_attn     = 4001;
   public final static short  kXR_authmore = 4002;
   public final static short  kXR_error    = 4003;
   public final static short  kXR_redirect = 4004;
   public final static short  kXR_wait     = 4005;
   public final static short  kXR_waitresp = 4006;
   

   public final static short kXR_asyncab   = 5000;
   public final static short kXR_asyndi    = 5001;
   public final static short kXR_asyncms   = 5002;
   public final static short kXR_asyncrd   = 5003;
   public final static short kXR_asyncwt   = 5004;
   public final static short kXR_asyncav   = 5005;
   public final static short kXR_asynunav  = 5006;
   public final static short kXR_asynresp  = 5008;
   
   public final static short kXR_ur = 0x100;
   public final static short kXR_uw = 0x080;
   public final static short kXR_ux = 0x040;
   public final static short kXR_gr = 0x020;
   public final static short kXR_gw = 0x010;
   public final static short kXR_gx = 0x008;
   public final static short kXR_or = 0x004;
   public final static short kXR_ow = 0x002;
   public final static short kXR_ox = 0x001;
   
   public final static short kXR_file = 0;
   public final static short kXR_xset = 1;
   public final static short kXR_isDir = 2;
   public final static short kXR_other = 4;
   public final static short kXR_offline = 8;
   public final static short kXR_readable = 16;
   public final static short kXR_writable = 32;
   
   public final static short kXR_compress = 1;
   public final static short kXR_delete   = 2;
   public final static short kXR_force    = 4;
   public final static short kXR_new      = 8;
   public final static short kXR_open_read= 16;
   public final static short kXR_open_updt= 32;
   public final static short kXR_async    = 64;
   public final static short kXR_refresh  = 128;
   public final static short kXR_mkpath   = 256;
   public final static short kXR_open_apnd= 512;
   public final static short kXR_retstat  = 1024;
   public final static short kXR_replica  = 2048;
   public final static short kXR_ulterior = 4096;
   public final static short kXR_nowait   = 8192;
   
   public final static short kXR_cancel = 1;
   public final static short kXR_notify = 2;
   public final static short kXR_noerrs = 4;
   public final static short kXR_stage  = 8;
   public final static short kXR_wmode  = 16;
   
   public final static short kXR_useruser = 0;
   public final static short kXR_useradmin = 1;
   
   public final static short kXR_QStats = 1;
   public final static short kXR_QPrep = 2; 
   public final static short kXR_Qcksum = 3; 
   public final static short kXR_Qxattr = 4;
   public final static short kXR_Qspace = 5;
   public final static short kXR_Qckscan= 6;
   public final static short kXR_Qconfig= 7;
   public final static short kXR_Qvisa  = 8;
   
   public final static short kXR_asyncap = 128;
   
   public final static short XRD_CLIENT_CURRENTVER = 2; //???
}
