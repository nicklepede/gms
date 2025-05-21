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
import defpackage.aoah;
import defpackage.ardf;
import defpackage.arez;
import defpackage.arfc;
import defpackage.argh;
import defpackage.asfu;
import defpackage.asoe;
import defpackage.asqh;
import defpackage.asri;
import defpackage.bhhk;
import defpackage.bhib;
import defpackage.bqwa;
import defpackage.bqwc;
import defpackage.dnnr;
import defpackage.duyl;
import defpackage.dves;
import defpackage.dvmq;
import defpackage.dvmr;
import defpackage.dvms;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.fmps;
import defpackage.fmrd;
import defpackage.fneu;
import defpackage.pov;
import defpackage.pph;
import defpackage.ppi;
import defpackage.pqm;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsApplication extends Application implements ComponentCallbacks, argh, dvmr {
    static final AtomicBoolean a;
    public static final /* synthetic */ int c = 0;
    private static final long d;
    public final arfc b;
    private bhib e;
    private volatile asfu i;
    private Context f = null;
    private boolean g = false;
    private boolean h = false;
    private ClassLoader j = null;
    private boolean k = false;

    static {
        bqwc.a = true;
        dves dvesVar = dves.a;
        if (dvesVar.b == null) {
            dvesVar.b = duyl.b();
        }
        d = SystemClock.elapsedRealtime();
        a = new AtomicBoolean(false);
    }

    public GmsApplication() {
        if (a.getAndSet(true)) {
            throw new arez();
        }
        try {
            Os.prctl(OsConstants.PR_SET_DUMPABLE, 1L, 0L, 0L, 0L);
        } catch (Exception e) {
            Log.e("GmsApplication", "Failed to enable native stack dump capture", e);
        }
        this.b = new arfc();
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

    private final asfu f() {
        asfu asfuVar;
        asfu asfuVar2 = this.i;
        if (asfuVar2 != null) {
            return asfuVar2;
        }
        synchronized (this) {
            asfuVar = this.i;
            if (asfuVar == null) {
                asfuVar = new asfu(this, super.getResources());
                this.i = asfuVar;
            }
        }
        return asfuVar;
    }

    private final bhib g() {
        if (fneu.a.a().w() && this.e == null) {
            this.e = new bhib(getClass(), 24, "container");
        }
        return this.e;
    }

    private final void h() {
        String m = asri.m();
        if (m.isEmpty() || !m.equals(asri.n())) {
            Log.i("GmsApplication", "Staging modules and/or updating config");
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(dnnr.b(this).getCacheDir(), ".stage_update.lock"), "rw");
                try {
                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).lock();
                    try {
                        if (new ppi(this, pov.b()).i(pph.f().j().g(0))) {
                            Log.i("GmsApplication", "Staging modules and/or updating config already complete");
                            randomAccessFile.close();
                            return;
                        }
                    } catch (PackageManager.NameNotFoundException | InvalidConfigException | IndexOutOfBoundsException unused) {
                    }
                    if (!fmrd.o() && Build.VERSION.SDK_INT >= fmrd.b()) {
                        Log.i("GmsApplication", "Staging modules");
                        pqm.e().p();
                        Log.i("GmsApplication", "Staging modules completed");
                    }
                    Log.i("GmsApplication", "Updating config");
                    aoah.i(false, true);
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
        if (asqh.e() && !asoe.o() && fmps.a.a().j()) {
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127 A[Catch: all -> 0x059c, TryCatch #25 {all -> 0x059c, blocks: (B:15:0x002e, B:16:0x0041, B:22:0x0058, B:24:0x0070, B:25:0x0078, B:27:0x0081, B:30:0x0092, B:32:0x009b, B:34:0x00b5, B:35:0x00c2, B:37:0x00c9, B:39:0x00d9, B:41:0x00e1, B:43:0x00ed, B:45:0x00f4, B:48:0x0112, B:50:0x0127, B:52:0x0135, B:55:0x014a, B:57:0x0154, B:58:0x015a, B:59:0x015c, B:79:0x01a8, B:81:0x01b2, B:82:0x01bf, B:84:0x01c5, B:86:0x01d1, B:88:0x01d8, B:91:0x01e2, B:99:0x01ee, B:103:0x0108, B:105:0x01ef, B:107:0x01f5, B:108:0x01fb, B:111:0x0203, B:113:0x0206, B:115:0x0210, B:117:0x0216, B:119:0x0223, B:121:0x0229, B:124:0x0230, B:125:0x0237, B:126:0x0238, B:128:0x0257, B:131:0x025e, B:132:0x0265, B:134:0x0270, B:136:0x0276, B:138:0x027f, B:140:0x0292, B:142:0x0296, B:144:0x0298, B:147:0x02a4, B:149:0x029d, B:152:0x02a7, B:154:0x02b1, B:155:0x02b9, B:157:0x02bf, B:159:0x02c5, B:163:0x02cd, B:166:0x02db, B:168:0x02d4, B:172:0x02df, B:174:0x0269, B:175:0x021f, B:177:0x02e8, B:179:0x02f1, B:180:0x02f4, B:182:0x02fa, B:184:0x0305, B:185:0x030d, B:186:0x031c, B:315:0x0322, B:188:0x033d, B:190:0x0343, B:192:0x0351, B:194:0x0357, B:196:0x0369, B:197:0x0372, B:202:0x0399, B:200:0x03a4, B:204:0x039d, B:205:0x03f0, B:207:0x042c, B:208:0x0436, B:216:0x043f, B:217:0x0440, B:218:0x045a, B:232:0x0486, B:234:0x048c, B:236:0x0492, B:238:0x049a, B:239:0x04b4, B:243:0x04c5, B:246:0x04de, B:249:0x04e9, B:252:0x04f2, B:241:0x04f9, B:255:0x04d5, B:258:0x04bb, B:260:0x0500, B:262:0x050c, B:263:0x0514, B:265:0x051a, B:267:0x0520, B:269:0x052b, B:270:0x0530, B:272:0x0536, B:274:0x0540, B:275:0x0542, B:293:0x0567, B:296:0x0571, B:297:0x0572, B:299:0x0578, B:300:0x057b, B:302:0x0581, B:313:0x0598, B:318:0x0336, B:321:0x004b, B:324:0x059b, B:61:0x015d, B:63:0x0161, B:64:0x016a, B:74:0x0187, B:75:0x0188, B:93:0x018c, B:77:0x01a5, B:96:0x019c, B:66:0x016b, B:68:0x0177, B:69:0x0183, B:277:0x0543, B:279:0x0547, B:281:0x054b, B:282:0x0555, B:290:0x0563, B:291:0x0564, B:292:0x0566, B:284:0x0556, B:285:0x055f, B:210:0x0437, B:211:0x043b, B:220:0x045b, B:221:0x045d, B:231:0x0485, B:310:0x0595, B:223:0x045e, B:225:0x0462, B:226:0x046e, B:228:0x0474, B:230:0x0484, B:306:0x058d, B:307:0x0592, B:18:0x0042, B:20:0x0046, B:319:0x0048, B:320:0x004a), top: B:14:0x002e, inners: #4, #6, #8, #9, #10, #11, #12, #13, #16, #20, #22, #23, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[Catch: all -> 0x059c, TryCatch #25 {all -> 0x059c, blocks: (B:15:0x002e, B:16:0x0041, B:22:0x0058, B:24:0x0070, B:25:0x0078, B:27:0x0081, B:30:0x0092, B:32:0x009b, B:34:0x00b5, B:35:0x00c2, B:37:0x00c9, B:39:0x00d9, B:41:0x00e1, B:43:0x00ed, B:45:0x00f4, B:48:0x0112, B:50:0x0127, B:52:0x0135, B:55:0x014a, B:57:0x0154, B:58:0x015a, B:59:0x015c, B:79:0x01a8, B:81:0x01b2, B:82:0x01bf, B:84:0x01c5, B:86:0x01d1, B:88:0x01d8, B:91:0x01e2, B:99:0x01ee, B:103:0x0108, B:105:0x01ef, B:107:0x01f5, B:108:0x01fb, B:111:0x0203, B:113:0x0206, B:115:0x0210, B:117:0x0216, B:119:0x0223, B:121:0x0229, B:124:0x0230, B:125:0x0237, B:126:0x0238, B:128:0x0257, B:131:0x025e, B:132:0x0265, B:134:0x0270, B:136:0x0276, B:138:0x027f, B:140:0x0292, B:142:0x0296, B:144:0x0298, B:147:0x02a4, B:149:0x029d, B:152:0x02a7, B:154:0x02b1, B:155:0x02b9, B:157:0x02bf, B:159:0x02c5, B:163:0x02cd, B:166:0x02db, B:168:0x02d4, B:172:0x02df, B:174:0x0269, B:175:0x021f, B:177:0x02e8, B:179:0x02f1, B:180:0x02f4, B:182:0x02fa, B:184:0x0305, B:185:0x030d, B:186:0x031c, B:315:0x0322, B:188:0x033d, B:190:0x0343, B:192:0x0351, B:194:0x0357, B:196:0x0369, B:197:0x0372, B:202:0x0399, B:200:0x03a4, B:204:0x039d, B:205:0x03f0, B:207:0x042c, B:208:0x0436, B:216:0x043f, B:217:0x0440, B:218:0x045a, B:232:0x0486, B:234:0x048c, B:236:0x0492, B:238:0x049a, B:239:0x04b4, B:243:0x04c5, B:246:0x04de, B:249:0x04e9, B:252:0x04f2, B:241:0x04f9, B:255:0x04d5, B:258:0x04bb, B:260:0x0500, B:262:0x050c, B:263:0x0514, B:265:0x051a, B:267:0x0520, B:269:0x052b, B:270:0x0530, B:272:0x0536, B:274:0x0540, B:275:0x0542, B:293:0x0567, B:296:0x0571, B:297:0x0572, B:299:0x0578, B:300:0x057b, B:302:0x0581, B:313:0x0598, B:318:0x0336, B:321:0x004b, B:324:0x059b, B:61:0x015d, B:63:0x0161, B:64:0x016a, B:74:0x0187, B:75:0x0188, B:93:0x018c, B:77:0x01a5, B:96:0x019c, B:66:0x016b, B:68:0x0177, B:69:0x0183, B:277:0x0543, B:279:0x0547, B:281:0x054b, B:282:0x0555, B:290:0x0563, B:291:0x0564, B:292:0x0566, B:284:0x0556, B:285:0x055f, B:210:0x0437, B:211:0x043b, B:220:0x045b, B:221:0x045d, B:231:0x0485, B:310:0x0595, B:223:0x045e, B:225:0x0462, B:226:0x046e, B:228:0x0474, B:230:0x0484, B:306:0x058d, B:307:0x0592, B:18:0x0042, B:20:0x0046, B:319:0x0048, B:320:0x004a), top: B:14:0x002e, inners: #4, #6, #8, #9, #10, #11, #12, #13, #16, #20, #22, #23, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void attachBaseContext(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.GmsApplication.attachBaseContext(android.content.Context):void");
    }

    @Override // defpackage.argh
    public final Resources b() {
        return super.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createAttributionContext(String str) {
        return new ardf(this, super.createAttributionContext(str));
    }

    public final Context createCredentialProtectedStorageContext() {
        return new ardf(this, super.createCredentialProtectedStorageContext());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDeviceProtectedStorageContext() {
        return new ardf(this, super.createDeviceProtectedStorageContext());
    }

    @Override // defpackage.dvmr
    public final eiid d() {
        eijr eijrVar = dvms.a;
        dvmq dvmqVar = new dvmq();
        dvmqVar.a = this;
        dvmqVar.c = new eijr() { // from class: arel
            @Override // defpackage.eijr
            public final Object a() {
                return eigb.a;
            }
        };
        dvmqVar.d = new eijr() { // from class: arer
            @Override // defpackage.eijr
            public final Object a() {
                return eiid.j(GmsApplication.this.getApplicationInfo());
            }
        };
        dvmqVar.b = eijy.a(new eijr() { // from class: ares
            @Override // defpackage.eijr
            public final Object a() {
                return entc.b(GmsApplication.this.b.getPhenotypeBaseExecutor());
            }
        });
        return eiid.j(dvmqVar.a());
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
        return bqwa.a(this, str, i, this.k);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return !asqh.g() ? super.getSystemService(str) : (str.hashCode() == 3649301 && str.equals("wifi")) ? e().getSystemService(str) : super.getSystemService(str);
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
    /* JADX WARN: Removed duplicated region for block: B:127:0x0373 A[Catch: Exception -> 0x0457, all -> 0x0559, TryCatch #6 {Exception -> 0x0457, blocks: (B:68:0x022b, B:70:0x026c, B:85:0x037e, B:87:0x03ab, B:88:0x03b8, B:90:0x03be, B:92:0x03c4, B:93:0x03ca, B:95:0x03d6, B:96:0x03dc, B:98:0x042a, B:99:0x044b, B:100:0x043c, B:101:0x03b2, B:102:0x02cb, B:103:0x02de, B:104:0x02e4, B:105:0x02ea, B:106:0x02f1, B:110:0x032f, B:111:0x0332, B:113:0x033a, B:115:0x0340, B:116:0x0348, B:118:0x034e, B:119:0x0354, B:121:0x035c, B:125:0x036b, B:127:0x0373, B:128:0x0378, B:129:0x0367, B:143:0x044f, B:144:0x0456), top: B:67:0x022b, outer: #7 }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [egkp] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 1530
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
        return bhhk.a(this, intent, new eiho() { // from class: arew
            @Override // defpackage.eiho
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
