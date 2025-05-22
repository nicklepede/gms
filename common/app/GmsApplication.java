package com.google.android.gms.common.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.SystemClock;
import android.os.UserManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.common.app.GmsApplication;
import defpackage.aqbz;
import defpackage.atfu;
import defpackage.atho;
import defpackage.athr;
import defpackage.atiw;
import defpackage.aujo;
import defpackage.aury;
import defpackage.auub;
import defpackage.auvc;
import defpackage.bjlz;
import defpackage.bjmq;
import defpackage.btdr;
import defpackage.btdt;
import defpackage.dpya;
import defpackage.dxji;
import defpackage.dxpr;
import defpackage.dxxr;
import defpackage.dxxs;
import defpackage.dxxt;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.fphq;
import defpackage.fpjb;
import defpackage.fpwt;
import defpackage.rhz;
import defpackage.ril;
import defpackage.rim;
import defpackage.rjq;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsApplication extends Application implements ComponentCallbacks, atiw, dxxs {
    static final AtomicBoolean a;
    public static final /* synthetic */ int c = 0;
    private static final long d;
    public final athr b;
    private bjmq e;
    private volatile aujo i;
    private Context f = null;
    private boolean g = false;
    private boolean h = false;
    private ClassLoader j = null;
    private boolean k = false;

    static {
        btdt.a = true;
        dxpr dxprVar = dxpr.a;
        if (dxprVar.b == null) {
            dxprVar.b = dxji.b();
        }
        d = SystemClock.elapsedRealtime();
        a = new AtomicBoolean(false);
    }

    public GmsApplication() {
        if (a.getAndSet(true)) {
            throw new atho();
        }
        try {
            Os.prctl(OsConstants.PR_SET_DUMPABLE, 1L, 0L, 0L, 0L);
        } catch (Exception e) {
            Log.e("GmsApplication", "Failed to enable native stack dump capture", e);
        }
        this.b = new athr();
    }

    private final synchronized Context e() {
        Context context = this.f;
        if (context != null) {
            return context;
        }
        Context createAttributionContext = createAttributionContext("app_network");
        this.f = createAttributionContext;
        return createAttributionContext;
    }

    private final aujo f() {
        aujo aujoVar;
        aujo aujoVar2 = this.i;
        if (aujoVar2 != null) {
            return aujoVar2;
        }
        synchronized (this) {
            aujoVar = this.i;
            if (aujoVar == null) {
                aujoVar = new aujo(this, super.getResources());
                this.i = aujoVar;
            }
        }
        return aujoVar;
    }

    private final bjmq g() {
        if (fpwt.a.lK().w() && this.e == null) {
            this.e = new bjmq(getClass(), 24, "container");
        }
        return this.e;
    }

    private final void h() {
        String m = auvc.m();
        if (m.isEmpty() || !m.equals(auvc.n())) {
            Log.i("GmsApplication", "Staging modules and/or updating config");
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(dpya.b(this).getCacheDir(), ".stage_update.lock"), "rw");
                try {
                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).lock();
                    try {
                        if (new rim(this, rhz.b()).i(ril.f().j().g(0))) {
                            Log.i("GmsApplication", "Staging modules and/or updating config already complete");
                            randomAccessFile.close();
                            return;
                        }
                    } catch (PackageManager.NameNotFoundException | InvalidConfigException | IndexOutOfBoundsException unused) {
                    }
                    if (!fpjb.o() && Build.VERSION.SDK_INT >= fpjb.b()) {
                        Log.i("GmsApplication", "Staging modules");
                        rjq.e().p();
                        Log.i("GmsApplication", "Staging modules completed");
                    }
                    Log.i("GmsApplication", "Updating config");
                    aqbz.i(false, true);
                    Log.i("GmsApplication", "Updating config completed");
                    randomAccessFile.close();
                } finally {
                }
            } catch (IOException e) {
                Log.w("GmsApplication", "Staging modules and/or updating config failed", e);
            }
        }
    }

    private final void i() {
        if (auub.e() && !aury.o() && fphq.a.lK().j()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = d;
            long j2 = elapsedRealtime - j;
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            UserManager userManager = (UserManager) getSystemService("user");
            Log.i("GmsApplication", String.format("[gms_startup_benchmark] Static start time (ms): %d, Startup latency (ms): %d, Is system user: %b", valueOf, valueOf2, Boolean.valueOf(userManager == null ? true : userManager.isSystemUser())));
        }
    }

    public final /* synthetic */ ComponentName a(Intent intent) {
        return super.startService(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125 A[Catch: all -> 0x059a, TryCatch #23 {all -> 0x059a, blocks: (B:15:0x002e, B:16:0x0041, B:22:0x0058, B:24:0x0070, B:25:0x0078, B:27:0x0081, B:30:0x0092, B:32:0x009b, B:34:0x00b5, B:35:0x00c2, B:37:0x00c9, B:39:0x00d9, B:41:0x00e1, B:43:0x00eb, B:45:0x00f2, B:48:0x0110, B:50:0x0125, B:52:0x0133, B:55:0x0148, B:57:0x0152, B:58:0x0158, B:59:0x015a, B:79:0x01a6, B:81:0x01b0, B:82:0x01bd, B:84:0x01c3, B:86:0x01cf, B:88:0x01d6, B:91:0x01e0, B:99:0x01ec, B:103:0x0106, B:105:0x01ed, B:107:0x01f3, B:108:0x01f9, B:111:0x0201, B:113:0x0204, B:115:0x020e, B:117:0x0214, B:119:0x0221, B:121:0x0227, B:124:0x022e, B:125:0x0235, B:126:0x0236, B:128:0x0255, B:131:0x025c, B:132:0x0263, B:134:0x026e, B:136:0x0274, B:138:0x027d, B:140:0x0290, B:142:0x0294, B:144:0x0296, B:147:0x02a2, B:149:0x029b, B:152:0x02a5, B:154:0x02af, B:155:0x02b7, B:157:0x02bd, B:159:0x02c3, B:163:0x02cb, B:166:0x02d9, B:168:0x02d2, B:172:0x02dd, B:174:0x0267, B:175:0x021d, B:177:0x02e6, B:179:0x02ef, B:180:0x02f2, B:182:0x02f8, B:184:0x0303, B:185:0x030b, B:186:0x031a, B:315:0x0320, B:188:0x033b, B:190:0x0341, B:192:0x034f, B:194:0x0355, B:196:0x0367, B:197:0x0370, B:202:0x0397, B:200:0x03a2, B:204:0x039b, B:205:0x03ee, B:207:0x042a, B:208:0x0434, B:216:0x043d, B:217:0x043e, B:218:0x0458, B:232:0x0484, B:234:0x048a, B:236:0x0490, B:238:0x0498, B:239:0x04b2, B:243:0x04c3, B:246:0x04dc, B:249:0x04e7, B:252:0x04f0, B:241:0x04f7, B:255:0x04d3, B:258:0x04b9, B:260:0x04fe, B:262:0x050a, B:263:0x0512, B:265:0x0518, B:267:0x051e, B:269:0x0529, B:270:0x052e, B:272:0x0534, B:274:0x053e, B:275:0x0540, B:293:0x0565, B:296:0x056f, B:297:0x0570, B:299:0x0576, B:300:0x0579, B:302:0x057f, B:313:0x0596, B:318:0x0334, B:321:0x004b, B:324:0x0599, B:61:0x015b, B:63:0x015f, B:64:0x0168, B:74:0x0185, B:75:0x0186, B:93:0x018a, B:77:0x01a3, B:96:0x019a, B:66:0x0169, B:68:0x0175, B:69:0x0181, B:277:0x0541, B:279:0x0545, B:281:0x0549, B:282:0x0553, B:290:0x0561, B:291:0x0562, B:292:0x0564, B:284:0x0554, B:285:0x055d, B:210:0x0435, B:211:0x0439, B:220:0x0459, B:221:0x045b, B:231:0x0483, B:310:0x0593, B:223:0x045c, B:225:0x0460, B:226:0x046c, B:228:0x0472, B:230:0x0482, B:306:0x058b, B:307:0x0590, B:18:0x0042, B:20:0x0046, B:319:0x0048, B:320:0x004a), top: B:14:0x002e, inners: #0, #3, #5, #7, #8, #9, #11, #12, #13, #15, #18, #19, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133 A[Catch: all -> 0x059a, TryCatch #23 {all -> 0x059a, blocks: (B:15:0x002e, B:16:0x0041, B:22:0x0058, B:24:0x0070, B:25:0x0078, B:27:0x0081, B:30:0x0092, B:32:0x009b, B:34:0x00b5, B:35:0x00c2, B:37:0x00c9, B:39:0x00d9, B:41:0x00e1, B:43:0x00eb, B:45:0x00f2, B:48:0x0110, B:50:0x0125, B:52:0x0133, B:55:0x0148, B:57:0x0152, B:58:0x0158, B:59:0x015a, B:79:0x01a6, B:81:0x01b0, B:82:0x01bd, B:84:0x01c3, B:86:0x01cf, B:88:0x01d6, B:91:0x01e0, B:99:0x01ec, B:103:0x0106, B:105:0x01ed, B:107:0x01f3, B:108:0x01f9, B:111:0x0201, B:113:0x0204, B:115:0x020e, B:117:0x0214, B:119:0x0221, B:121:0x0227, B:124:0x022e, B:125:0x0235, B:126:0x0236, B:128:0x0255, B:131:0x025c, B:132:0x0263, B:134:0x026e, B:136:0x0274, B:138:0x027d, B:140:0x0290, B:142:0x0294, B:144:0x0296, B:147:0x02a2, B:149:0x029b, B:152:0x02a5, B:154:0x02af, B:155:0x02b7, B:157:0x02bd, B:159:0x02c3, B:163:0x02cb, B:166:0x02d9, B:168:0x02d2, B:172:0x02dd, B:174:0x0267, B:175:0x021d, B:177:0x02e6, B:179:0x02ef, B:180:0x02f2, B:182:0x02f8, B:184:0x0303, B:185:0x030b, B:186:0x031a, B:315:0x0320, B:188:0x033b, B:190:0x0341, B:192:0x034f, B:194:0x0355, B:196:0x0367, B:197:0x0370, B:202:0x0397, B:200:0x03a2, B:204:0x039b, B:205:0x03ee, B:207:0x042a, B:208:0x0434, B:216:0x043d, B:217:0x043e, B:218:0x0458, B:232:0x0484, B:234:0x048a, B:236:0x0490, B:238:0x0498, B:239:0x04b2, B:243:0x04c3, B:246:0x04dc, B:249:0x04e7, B:252:0x04f0, B:241:0x04f7, B:255:0x04d3, B:258:0x04b9, B:260:0x04fe, B:262:0x050a, B:263:0x0512, B:265:0x0518, B:267:0x051e, B:269:0x0529, B:270:0x052e, B:272:0x0534, B:274:0x053e, B:275:0x0540, B:293:0x0565, B:296:0x056f, B:297:0x0570, B:299:0x0576, B:300:0x0579, B:302:0x057f, B:313:0x0596, B:318:0x0334, B:321:0x004b, B:324:0x0599, B:61:0x015b, B:63:0x015f, B:64:0x0168, B:74:0x0185, B:75:0x0186, B:93:0x018a, B:77:0x01a3, B:96:0x019a, B:66:0x0169, B:68:0x0175, B:69:0x0181, B:277:0x0541, B:279:0x0545, B:281:0x0549, B:282:0x0553, B:290:0x0561, B:291:0x0562, B:292:0x0564, B:284:0x0554, B:285:0x055d, B:210:0x0435, B:211:0x0439, B:220:0x0459, B:221:0x045b, B:231:0x0483, B:310:0x0593, B:223:0x045c, B:225:0x0460, B:226:0x046c, B:228:0x0472, B:230:0x0482, B:306:0x058b, B:307:0x0590, B:18:0x0042, B:20:0x0046, B:319:0x0048, B:320:0x004a), top: B:14:0x002e, inners: #0, #3, #5, #7, #8, #9, #11, #12, #13, #15, #18, #19, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void attachBaseContext(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.GmsApplication.attachBaseContext(android.content.Context):void");
    }

    @Override // defpackage.atiw
    public final Resources b() {
        return super.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createAttributionContext(String str) {
        return new atfu(this, super.createAttributionContext(str));
    }

    public final Context createCredentialProtectedStorageContext() {
        return new atfu(this, super.createCredentialProtectedStorageContext());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDeviceProtectedStorageContext() {
        return new atfu(this, super.createDeviceProtectedStorageContext());
    }

    @Override // defpackage.dxxs
    public final ekvi d() {
        ekww ekwwVar = dxxt.a;
        dxxr dxxrVar = new dxxr();
        dxxrVar.a = this;
        dxxrVar.c = new ekww() { // from class: atha
            @Override // defpackage.ekww
            public final Object lK() {
                return ektg.a;
            }
        };
        dxxrVar.d = new ekww() { // from class: athg
            @Override // defpackage.ekww
            public final Object lK() {
                return ekvi.j(GmsApplication.this.getApplicationInfo());
            }
        };
        dxxrVar.b = ekxd.a(new ekww() { // from class: athh
            @Override // defpackage.ekww
            public final Object lK() {
                return eqgv.b(GmsApplication.this.b.getPhenotypeBaseExecutor());
            }
        });
        return ekvi.j(dxxrVar.a());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getAttributionTag() {
        return "app";
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        ClassLoader classLoader = this.j;
        return classLoader != null ? classLoader : super.getClassLoader();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return f().getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        return btdr.a(this, str, i, this.k);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return !auub.g() ? super.getSystemService(str) : (str.hashCode() == 3649301 && str.equals("wifi")) ? e().getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return f().getTheme();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        f().a(configuration);
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0485 A[Catch: all -> 0x05a9, TryCatch #5 {all -> 0x05a9, blocks: (B:18:0x0050, B:49:0x00bf, B:51:0x00e2, B:53:0x00fe, B:55:0x014d, B:57:0x015e, B:59:0x0168, B:61:0x0179, B:63:0x020e, B:64:0x0215, B:66:0x0221, B:69:0x022d, B:73:0x023d, B:76:0x0252, B:78:0x0280, B:92:0x038d, B:94:0x03ba, B:95:0x03c7, B:97:0x03cd, B:99:0x03d3, B:100:0x03d9, B:102:0x03e5, B:103:0x03eb, B:105:0x0439, B:106:0x045a, B:107:0x0473, B:109:0x0485, B:111:0x04aa, B:112:0x04ad, B:114:0x04b3, B:115:0x04b9, B:117:0x04ca, B:119:0x04d7, B:121:0x0501, B:122:0x0522, B:124:0x0513, B:126:0x0527, B:127:0x052f, B:129:0x0537, B:131:0x054e, B:132:0x0559, B:134:0x055f, B:156:0x05a3, B:157:0x05a8, B:158:0x044b, B:159:0x03c1, B:160:0x02dc, B:161:0x02ef, B:162:0x02f5, B:163:0x02fb, B:164:0x0302, B:168:0x033e, B:169:0x0341, B:171:0x0349, B:173:0x034f, B:174:0x0357, B:176:0x035d, B:177:0x0363, B:179:0x036b, B:183:0x037a, B:185:0x0382, B:186:0x0387, B:187:0x0376, B:201:0x045e, B:202:0x0465, B:204:0x046b, B:210:0x0212, B:211:0x016e, B:212:0x0153, B:213:0x00e8), top: B:17:0x0050, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0537 A[Catch: all -> 0x05a9, TRY_LEAVE, TryCatch #5 {all -> 0x05a9, blocks: (B:18:0x0050, B:49:0x00bf, B:51:0x00e2, B:53:0x00fe, B:55:0x014d, B:57:0x015e, B:59:0x0168, B:61:0x0179, B:63:0x020e, B:64:0x0215, B:66:0x0221, B:69:0x022d, B:73:0x023d, B:76:0x0252, B:78:0x0280, B:92:0x038d, B:94:0x03ba, B:95:0x03c7, B:97:0x03cd, B:99:0x03d3, B:100:0x03d9, B:102:0x03e5, B:103:0x03eb, B:105:0x0439, B:106:0x045a, B:107:0x0473, B:109:0x0485, B:111:0x04aa, B:112:0x04ad, B:114:0x04b3, B:115:0x04b9, B:117:0x04ca, B:119:0x04d7, B:121:0x0501, B:122:0x0522, B:124:0x0513, B:126:0x0527, B:127:0x052f, B:129:0x0537, B:131:0x054e, B:132:0x0559, B:134:0x055f, B:156:0x05a3, B:157:0x05a8, B:158:0x044b, B:159:0x03c1, B:160:0x02dc, B:161:0x02ef, B:162:0x02f5, B:163:0x02fb, B:164:0x0302, B:168:0x033e, B:169:0x0341, B:171:0x0349, B:173:0x034f, B:174:0x0357, B:176:0x035d, B:177:0x0363, B:179:0x036b, B:183:0x037a, B:185:0x0382, B:186:0x0387, B:187:0x0376, B:201:0x045e, B:202:0x0465, B:204:0x046b, B:210:0x0212, B:211:0x016e, B:212:0x0153, B:213:0x00e8), top: B:17:0x0050, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x055f A[Catch: all -> 0x05a9, TRY_LEAVE, TryCatch #5 {all -> 0x05a9, blocks: (B:18:0x0050, B:49:0x00bf, B:51:0x00e2, B:53:0x00fe, B:55:0x014d, B:57:0x015e, B:59:0x0168, B:61:0x0179, B:63:0x020e, B:64:0x0215, B:66:0x0221, B:69:0x022d, B:73:0x023d, B:76:0x0252, B:78:0x0280, B:92:0x038d, B:94:0x03ba, B:95:0x03c7, B:97:0x03cd, B:99:0x03d3, B:100:0x03d9, B:102:0x03e5, B:103:0x03eb, B:105:0x0439, B:106:0x045a, B:107:0x0473, B:109:0x0485, B:111:0x04aa, B:112:0x04ad, B:114:0x04b3, B:115:0x04b9, B:117:0x04ca, B:119:0x04d7, B:121:0x0501, B:122:0x0522, B:124:0x0513, B:126:0x0527, B:127:0x052f, B:129:0x0537, B:131:0x054e, B:132:0x0559, B:134:0x055f, B:156:0x05a3, B:157:0x05a8, B:158:0x044b, B:159:0x03c1, B:160:0x02dc, B:161:0x02ef, B:162:0x02f5, B:163:0x02fb, B:164:0x0302, B:168:0x033e, B:169:0x0341, B:171:0x0349, B:173:0x034f, B:174:0x0357, B:176:0x035d, B:177:0x0363, B:179:0x036b, B:183:0x037a, B:185:0x0382, B:186:0x0387, B:187:0x0376, B:201:0x045e, B:202:0x0465, B:204:0x046b, B:210:0x0212, B:211:0x016e, B:212:0x0153, B:213:0x00e8), top: B:17:0x0050, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x059a A[Catch: all -> 0x063b, TryCatch #8 {all -> 0x063b, blocks: (B:139:0x057c, B:141:0x0582, B:143:0x0588, B:144:0x0594, B:146:0x059a, B:152:0x059e, B:228:0x060d, B:230:0x0613, B:232:0x0619, B:233:0x0625, B:235:0x062b, B:240:0x062f, B:247:0x05ce, B:249:0x05d4, B:251:0x05da, B:252:0x05e6, B:254:0x05ec, B:255:0x05f0, B:12:0x0023, B:14:0x002b, B:16:0x002f, B:20:0x007b, B:135:0x0569, B:222:0x05b3, B:221:0x05b0, B:223:0x004b, B:243:0x05b7), top: B:10:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x059e A[Catch: all -> 0x063b, TRY_LEAVE, TryCatch #8 {all -> 0x063b, blocks: (B:139:0x057c, B:141:0x0582, B:143:0x0588, B:144:0x0594, B:146:0x059a, B:152:0x059e, B:228:0x060d, B:230:0x0613, B:232:0x0619, B:233:0x0625, B:235:0x062b, B:240:0x062f, B:247:0x05ce, B:249:0x05d4, B:251:0x05da, B:252:0x05e6, B:254:0x05ec, B:255:0x05f0, B:12:0x0023, B:14:0x002b, B:16:0x002f, B:20:0x007b, B:135:0x0569, B:222:0x05b3, B:221:0x05b0, B:223:0x004b, B:243:0x05b7), top: B:10:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0382 A[Catch: Exception -> 0x0466, all -> 0x05a9, TryCatch #5 {all -> 0x05a9, blocks: (B:18:0x0050, B:49:0x00bf, B:51:0x00e2, B:53:0x00fe, B:55:0x014d, B:57:0x015e, B:59:0x0168, B:61:0x0179, B:63:0x020e, B:64:0x0215, B:66:0x0221, B:69:0x022d, B:73:0x023d, B:76:0x0252, B:78:0x0280, B:92:0x038d, B:94:0x03ba, B:95:0x03c7, B:97:0x03cd, B:99:0x03d3, B:100:0x03d9, B:102:0x03e5, B:103:0x03eb, B:105:0x0439, B:106:0x045a, B:107:0x0473, B:109:0x0485, B:111:0x04aa, B:112:0x04ad, B:114:0x04b3, B:115:0x04b9, B:117:0x04ca, B:119:0x04d7, B:121:0x0501, B:122:0x0522, B:124:0x0513, B:126:0x0527, B:127:0x052f, B:129:0x0537, B:131:0x054e, B:132:0x0559, B:134:0x055f, B:156:0x05a3, B:157:0x05a8, B:158:0x044b, B:159:0x03c1, B:160:0x02dc, B:161:0x02ef, B:162:0x02f5, B:163:0x02fb, B:164:0x0302, B:168:0x033e, B:169:0x0341, B:171:0x0349, B:173:0x034f, B:174:0x0357, B:176:0x035d, B:177:0x0363, B:179:0x036b, B:183:0x037a, B:185:0x0382, B:186:0x0387, B:187:0x0376, B:201:0x045e, B:202:0x0465, B:204:0x046b, B:210:0x0212, B:211:0x016e, B:212:0x0153, B:213:0x00e8), top: B:17:0x0050, inners: #0, #6 }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eixs] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.GmsApplication.onCreate():void");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i >= 5) {
            SQLiteDatabase.releaseMemory();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        f().setTheme(i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startService(Intent intent) {
        return bjlz.a(this, intent, new ekut() { // from class: athl
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return GmsApplication.this.a((Intent) obj);
            }
        });
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }
}
