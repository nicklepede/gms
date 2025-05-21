package com.google.android.gms.carsetup.frx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import defpackage.akyr;
import defpackage.aluf;
import defpackage.alur;
import defpackage.alus;
import defpackage.aluv;
import defpackage.alvc;
import defpackage.alve;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.alvp;
import defpackage.alvt;
import defpackage.dg;
import defpackage.eiig;
import defpackage.ejhh;
import defpackage.elxv;
import defpackage.elxw;
import defpackage.elxx;
import defpackage.fecj;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @alvh(a = SetupFsm$InstallingAppsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$InstallingAppsState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$InstallingAppsState.class, c = SetupFsm$StartCarService.class, d = "EVENT_APPLICATIONS_UP_TO_DATE"), @alvh(a = SetupFsm$InstallingAppsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_APPLICATION_INSTALLATION_FAILED")})
/* loaded from: classes3.dex */
public class SetupFsm$InstallingAppsState extends alvg {
    public int a;
    private boolean d;
    private boolean e;
    private BroadcastReceiver f;
    private BroadcastReceiver g;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState$2, reason: invalid class name */
    public class AnonymousClass2 extends TracingBroadcastReceiver {
        public AnonymousClass2() {
            super("car_setup");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            ejhh ejhhVar = alus.a;
            if ("com.google.android.projection.gearhead".equals(intent.getData().getSchemeSpecificPart())) {
                ExecutorService b = akyr.b(1);
                b.execute(new alur(this));
                b.shutdown();
            }
        }
    }

    public static void f(InputStream inputStream, byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            int read = inputStream.read(bArr, i, length - i);
            if (read <= 0) {
                break;
            } else {
                i += read;
            }
        }
        if (i < length) {
            throw new IOException("Manifest underflow");
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private final boolean i() {
        Intent z = ((aluv) this.c.k).z();
        if (z != null) {
            int i = alvt.a;
            String stringExtra = z.getStringExtra("full_docid");
            eiig.x(stringExtra);
            if (stringExtra.equals("com.google.android.projection.gearhead") && !this.e) {
                this.e = true;
                this.f = new TracingBroadcastReceiver() { // from class: com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState.1
                    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                    public final void jz(Context context, Intent intent) {
                        ejhh ejhhVar = alus.a;
                        SetupFsm$InstallingAppsState setupFsm$InstallingAppsState = SetupFsm$InstallingAppsState.this;
                        if (setupFsm$InstallingAppsState.e() >= setupFsm$InstallingAppsState.a) {
                            setupFsm$InstallingAppsState.g();
                        }
                    }
                };
                this.g = new AnonymousClass2();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED");
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter2.addDataScheme("package");
                this.b.registerReceiver(this.f, intentFilter);
                this.b.registerReceiver(this.g, intentFilter2);
            }
            if (z.resolveActivity(this.b.getPackageManager()) == null) {
                this.c.d("EVENT_ERROR");
                return false;
            }
            this.c.i(z);
        }
        return true;
    }

    @Override // defpackage.alvg
    public final int a() {
        return 7;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        if ("EVENT_APPLICATION_INSTALLATION_UPDATE".equals(str) || "EVENT_APPLICATION_INSTALLED".equals(str)) {
            alve alveVar = this.c.i;
            dg a = alveVar != null ? alveVar.a() : null;
            if (a != null && (a instanceof aluf)) {
                ((aluf) a).x();
            }
        } else if ("EVENT_ACTIVITY_RESULT".equals(str)) {
            if (obj != null && ((ActivityResult) obj).a == 0) {
                Bundle bundle = new Bundle();
                bundle.putString("errorTitle", this.b.getString(R.string.common_something_went_wrong));
                alvp A = ((aluv) this.c.k).A();
                Context context = this.b;
                bundle.putString("errorMessage", context.getString(R.string.car_frx_apps_installation_aborted_message, alvt.c(context, A)));
                this.c.e("EVENT_APPLICATION_INSTALLATION_FAILED", bundle);
                alvc alvcVar = this.c;
                fecj v = elxx.a.v();
                int i = elxw.FRX_INSTALL_APPS.gA;
                if (!v.b.L()) {
                    v.U();
                }
                elxx elxxVar = (elxx) v.b;
                elxxVar.b |= 1;
                elxxVar.d = i;
                int a2 = elxv.bP.a();
                if (!v.b.L()) {
                    v.U();
                }
                elxx elxxVar2 = (elxx) v.b;
                elxxVar2.b |= 2;
                elxxVar2.e = a2;
                alvcVar.f((elxx) v.Q());
            }
            return true;
        }
        if (!"EVENT_APPLICATION_INSTALLED".equals(str)) {
            if ("EVENT_APPLICATIONS_UP_TO_DATE".equals(str)) {
                if (!((aluv) this.c.k).O()) {
                    alus.a.j().ah(2835).x("Got event that applications are updated, but failed verification");
                }
                if (this.e) {
                    this.d = true;
                    return true;
                }
            }
            if (!"EVENT_CAR_STARTED_MOVING".equals(str)) {
                g();
            }
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_APPLICATIONS_UP_TO_DATE".equals(str) || "EVENT_APPLICATION_INSTALLATION_FAILED".equals(str)) ? false : true;
        }
        i();
        alvc alvcVar2 = this.c;
        fecj v2 = elxx.a.v();
        int i2 = elxw.FRX_INSTALL_APPS.gA;
        if (!v2.b.L()) {
            v2.U();
        }
        elxx elxxVar3 = (elxx) v2.b;
        elxxVar3.b |= 1;
        elxxVar3.d = i2;
        int a3 = elxv.bR.a();
        if (!v2.b.L()) {
            v2.U();
        }
        elxx elxxVar4 = (elxx) v2.b;
        elxxVar4.b |= 2;
        elxxVar4.e = a3;
        alvcVar2.f((elxx) v2.Q());
        return true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        aluv aluvVar = (aluv) this.c.k;
        if ("EVENT_CAR_PARKED".equals(str)) {
            if (aluvVar.O()) {
                this.c.d("EVENT_APPLICATIONS_UP_TO_DATE");
                return;
            } else {
                if (i()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("installation_allowed", true);
                    this.c.k(aluf.class, bundle, true);
                    return;
                }
                return;
            }
        }
        if (aluvVar.T()) {
            aluvVar.D();
            if (i()) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("installation_allowed", true);
                this.c.k(aluf.class, bundle2, true);
                return;
            }
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("errorTitle", this.b.getString(R.string.car_frx_no_connection_title));
        bundle3.putString("errorMessage", this.b.getString(R.string.car_frx_no_connection_message));
        this.c.e("EVENT_APPLICATION_INSTALLATION_FAILED", bundle3);
        alvc alvcVar = this.c;
        fecj v = elxx.a.v();
        int i = elxw.FRX_INSTALL_APPS.gA;
        if (!v.b.L()) {
            v.U();
        }
        elxx elxxVar = (elxx) v.b;
        elxxVar.b = 1 | elxxVar.b;
        elxxVar.d = i;
        int a = elxv.bO.a();
        if (!v.b.L()) {
            v.U();
        }
        elxx elxxVar2 = (elxx) v.b;
        elxxVar2.b |= 2;
        elxxVar2.e = a;
        alvcVar.f((elxx) v.Q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r2 = r3.moduleVersion;
        r0 = defpackage.akyf.a.h().ah(2152);
        r3 = r3.moduleApk;
        r0.N("Module APK info: %s %d", r3.apkPackageName, r3.apkVersionCode);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.b
            ejhh r1 = defpackage.akyf.a
            java.lang.String r1 = "com.google.android.gms.car"
            r2 = 2147483647(0x7fffffff, float:NaN)
            com.google.android.chimera.config.ModuleManager r0 = com.google.android.chimera.config.ModuleManager.get(r0)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.util.Collection r0 = r0.getAllModules()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
        L15:
            boolean r3 = r0.hasNext()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            if (r3 == 0) goto L42
            java.lang.Object r3 = r0.next()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            com.google.android.chimera.config.ModuleManager$ModuleInfo r3 = (com.google.android.chimera.config.ModuleManager.ModuleInfo) r3     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.lang.String r4 = r3.moduleId     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            boolean r4 = r1.equals(r4)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            if (r4 == 0) goto L15
            int r2 = r3.moduleVersion     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            ejhh r0 = defpackage.akyf.a     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            ejgq r0 = r0.h()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            r1 = 2152(0x868, float:3.016E-42)
            ejgq r0 = r0.ah(r1)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.lang.String r1 = "Module APK info: %s %d"
            com.google.android.chimera.config.ModuleManager$ModuleApkInfo r3 = r3.moduleApk     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.lang.String r4 = r3.apkPackageName     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            int r3 = r3.apkVersionCode     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            r0.N(r1, r4, r3)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
        L42:
            ejhh r0 = defpackage.akyf.a
            ejgq r0 = r0.h()
            r1 = 2151(0x867, float:3.014E-42)
            ejgq r0 = r0.ah(r1)
            java.lang.String r1 = "Current module version %d"
            r0.z(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState.e():int");
    }

    public final void g() {
        if (this.e) {
            this.b.unregisterReceiver(this.f);
            this.b.unregisterReceiver(this.g);
            this.e = false;
            if (this.d) {
                this.c.d("EVENT_APPLICATIONS_UP_TO_DATE");
            }
        }
    }
}
