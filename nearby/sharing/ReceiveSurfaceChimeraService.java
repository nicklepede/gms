package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.InstallParams;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import defpackage.atad;
import defpackage.atai;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.caqj;
import defpackage.chdv;
import defpackage.chdw;
import defpackage.chke;
import defpackage.cofp;
import defpackage.cofs;
import defpackage.cohq;
import defpackage.cohu;
import defpackage.cojh;
import defpackage.cokc;
import defpackage.conc;
import defpackage.conm;
import defpackage.coof;
import defpackage.coog;
import defpackage.cpil;
import defpackage.cpjc;
import defpackage.cqrc;
import defpackage.cqrf;
import defpackage.cqrg;
import defpackage.cqrh;
import defpackage.ctvn;
import defpackage.ctwt;
import defpackage.ctxa;
import defpackage.ctxh;
import defpackage.dgzy;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.ekus;
import defpackage.flml;
import defpackage.ftga;
import defpackage.ftgi;
import defpackage.fyjd;
import defpackage.fyjt;
import defpackage.fyju;
import defpackage.fyml;
import defpackage.fymo;
import defpackage.ind;
import defpackage.juo;
import defpackage.juq;
import defpackage.jva;
import defpackage.jvc;
import defpackage.jxc;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ReceiveSurfaceChimeraService extends cofs implements jvc {
    public cojh a;
    public Context b;
    public cohu c;
    public boolean d;
    public Intent e;
    public flml g;
    private cofp h;
    private BroadcastReceiver i;
    private BroadcastReceiver j;
    private BroadcastReceiver k;
    private BroadcastReceiver l;
    private BroadcastReceiver m;
    private BroadcastReceiver n;
    private BroadcastReceiver o;
    private DisplayManager.DisplayListener p;
    private coof q;
    final Handler f = new caqj();
    private final jxc r = new jxc(this);

    public final void b(Intent intent) {
        Context applicationContext = getApplicationContext();
        this.h.b.e("nearby_sharing", 5);
        if (intent.getStringExtra("android.intent.extra.TEXT") != null) {
            ctxa.c(applicationContext, intent);
            return;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.android.gms.nearby.sharing.KEY_COPY_IMAGE_URI");
        ArrayList arrayList = new ArrayList();
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            return;
        }
        int size = stringArrayListExtra.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Uri.parse(stringArrayListExtra.get(i)));
        }
        ctvn.m(applicationContext, arrayList, intent.getBooleanExtra("android.content.extra.IS_SENSITIVE", false), intent.getBooleanExtra("copy_paste_extra_need_toast", true), intent.getBooleanExtra("android.content.extra.IS_REMOTE_DEVICE", false), intent.getStringExtra("android.content.extra.REMOTE_DEVICE_NAME"));
    }

    public final void c(Context context) {
        coof a = coog.a(context);
        if (ekus.a(this.q, a)) {
            return;
        }
        this.q = a;
        this.a.M(this.c);
        if (coog.b(this).e()) {
            coof coofVar = this.q;
            if (coofVar != null) {
                cokc cokcVar = new cokc(coofVar.b);
                int i = chdw.a;
                this.a = new cpil(this, cokcVar);
            } else {
                cokc cokcVar2 = new cokc((int) ftga.q());
                int i2 = chdw.a;
                this.a = new cpil(this, cokcVar2);
            }
        } else {
            cokc cokcVar3 = new cokc(0);
            int i3 = chdw.a;
            this.a = new cpil(this, cokcVar3);
        }
        Handler handler = this.f;
        cofp cofpVar = this.h;
        cojh cojhVar = this.a;
        cohu cohuVar = new cohu(context, handler, cofpVar, cojhVar);
        this.c = cohuVar;
        cojhVar.I(cohuVar);
    }

    public final void d(boolean z) {
        Intent intent;
        this.d = z;
        if (!z || (intent = this.e) == null) {
            return;
        }
        b(intent);
        this.e = null;
    }

    public final void f(final int i, final int i2, final String... strArr) {
        new caqj(Looper.getMainLooper()).post(new Runnable() { // from class: cohp
            @Override // java.lang.Runnable
            public final void run() {
                Context context = ReceiveSurfaceChimeraService.this.b;
                Toast.makeText(context, context.getString(i2, strArr), i).show();
            }
        });
    }

    @Override // defpackage.jvc
    public final juq getLifecycle() {
        return this.r.a;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        this.r.a();
        return null;
    }

    @Override // defpackage.cofs, com.google.android.chimera.Service
    public final void onCreate() {
        cojh cojhVar;
        this.r.b();
        super.onCreate();
        this.q = coog.a(this);
        if (this.h == null) {
            this.h = cofp.d(this.b);
        }
        if (coog.b(this).e() && this.a == null) {
            coof coofVar = this.q;
            if (coofVar != null) {
                cokc cokcVar = new cokc(coofVar.b);
                int i = chdw.a;
                cojhVar = new cpil(this, cokcVar);
            } else {
                cokc cokcVar2 = new cokc((int) ftga.q());
                int i2 = chdw.a;
                cojhVar = new cpil(this, cokcVar2);
            }
        } else {
            if (this.a == null) {
                this.a = chdw.e(this);
            }
            cojhVar = this.a;
        }
        this.a = cojhVar;
        Context context = this.b;
        Handler handler = this.f;
        cofp cofpVar = this.h;
        cojh cojhVar2 = this.a;
        cohu cohuVar = new cohu(context, handler, cofpVar, cojhVar2);
        this.c = cohuVar;
        cojhVar2.I(cohuVar);
        TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.3
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context2, Intent intent) {
                ReceiveSurfaceChimeraService receiveSurfaceChimeraService = ReceiveSurfaceChimeraService.this;
                if (receiveSurfaceChimeraService.d) {
                    receiveSurfaceChimeraService.b(intent);
                } else {
                    receiveSurfaceChimeraService.e = intent;
                    conm.a.b().p("Waiting unlock and copy to clipboard, due to screen locked.", new Object[0]);
                }
            }
        };
        this.i = tracingBroadcastReceiver;
        chke.b(this.b, tracingBroadcastReceiver, new IntentFilter("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD"));
        if (ftgi.a.lK().ad()) {
            cqrh cqrhVar = (cqrh) this.g.a();
            fyjt.d(fyju.b(new fymo(new fyjd(new cqrf(new fyml(new cqrc(fyju.a(conc.a(cqrhVar.a, "WifiReceiver", new IntentFilter("com.google.android.gms.nearby.sharing.CONNECT_WIFI"))))), null, cqrhVar)), new cqrg(cqrhVar, null)), cqrhVar.c), jva.a(getLifecycle()));
        } else {
            TracingBroadcastReceiver tracingBroadcastReceiver2 = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.4
                @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                public final void jP(Context context2, Intent intent) {
                    dhlw a;
                    WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) intent.getParcelableExtra("wifi_credentials_attachment");
                    if (wifiCredentialsAttachment == null) {
                        return;
                    }
                    final ReceiveSurfaceChimeraService receiveSurfaceChimeraService = ReceiveSurfaceChimeraService.this;
                    final String str = wifiCredentialsAttachment.a;
                    receiveSurfaceChimeraService.f(1, R.string.sharing_toast_wifi_connecting, str);
                    if (ctxh.d(receiveSurfaceChimeraService.b, str)) {
                        conm.a.b().h("Already connected to ssid %s.", str);
                        receiveSurfaceChimeraService.f(0, R.string.sharing_toast_wifi_connection_succeeded, str);
                    } else {
                        int i3 = wifiCredentialsAttachment.b;
                        String str2 = wifiCredentialsAttachment.d;
                        Context context3 = receiveSurfaceChimeraService.b;
                        boolean z = wifiCredentialsAttachment.e;
                        dgzy dgzyVar = new dgzy(context3.getApplicationContext());
                        String str3 = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? null : "SAE" : "WEP" : "PSK" : "Open";
                        if (str3 == null) {
                            a = dhmr.c(new IllegalArgumentException(String.format(Locale.getDefault(), "connectToWifi failed to connect to ssid %s because an unknown securityType (%s) was given.", str, Integer.valueOf(i3))));
                        } else {
                            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = new ConnectToWifiNetworkRequest();
                            if (str2 != null) {
                                connectToWifiNetworkRequest.c = str2;
                            }
                            connectToWifiNetworkRequest.a = str;
                            connectToWifiNetworkRequest.b = str3;
                            connectToWifiNetworkRequest.d = z;
                            a = dgzyVar.a(connectToWifiNetworkRequest);
                        }
                        a.z(new dhlq() { // from class: cohn
                            @Override // defpackage.dhlq
                            public final void gC(Object obj) {
                                ReceiveSurfaceChimeraService.this.f(0, R.string.sharing_toast_wifi_connection_succeeded, str);
                            }
                        });
                        a.y(new dhln() { // from class: coho
                            @Override // defpackage.dhln
                            public final void gB(Exception exc) {
                                String str4 = str;
                                ReceiveSurfaceChimeraService.this.f(0, R.string.sharing_toast_wifi_connection_failed, str4);
                                conm.a.e().f(exc).h("WifiUtils#connectToWifi failed to connect to %s", str4);
                            }
                        });
                    }
                    Intent intent2 = new Intent("android.settings.WIFI_SETTINGS");
                    intent2.addFlags(268435456);
                    intent2.addFlags(32768);
                    receiveSurfaceChimeraService.startActivity(intent2);
                }
            };
            this.j = tracingBroadcastReceiver2;
            chke.b(this.b, tracingBroadcastReceiver2, new IntentFilter("com.google.android.gms.nearby.sharing.CONNECT_WIFI"));
        }
        TracingBroadcastReceiver tracingBroadcastReceiver3 = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.5
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context2, Intent intent) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("share_target_bytes");
                final long longExtra = intent.getLongExtra("attachment_id", -1L);
                if (byteArrayExtra == null) {
                    conm.a.b().p("Failed to get share target from intent.", new Object[0]);
                    return;
                }
                final ShareTarget shareTarget = (ShareTarget) cpjc.b(byteArrayExtra, ShareTarget.CREATOR);
                atai ataiVar = ReceiveSurfaceChimeraService.this.a;
                atfn atfnVar = new atfn();
                atfnVar.a = new atfd() { // from class: cpgo
                    @Override // defpackage.atfd
                    public final void d(Object obj, Object obj2) {
                        int i3 = cpil.a;
                        cpfd cpfdVar = (cpfd) ((cpkf) obj).H();
                        InstallParams installParams = new InstallParams();
                        installParams.a = ShareTarget.this;
                        installParams.b = longExtra;
                        installParams.c = new cpic((dhma) obj2);
                        cpfdVar.x(installParams);
                    }
                };
                atfnVar.c = new Feature[]{chdv.e};
                atfnVar.d = 1282;
                ((atad) ataiVar).ji(atfnVar.a());
            }
        };
        this.k = tracingBroadcastReceiver3;
        chke.b(this.b, tracingBroadcastReceiver3, new IntentFilter("com.google.android.gms.nearby.sharing.INSTALL_APP"));
        TracingBroadcastReceiver tracingBroadcastReceiver4 = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.7
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context2, Intent intent) {
                cohu cohuVar2;
                if (intent.getIntExtra("register_receive_surface_state", -1) != 1 || (cohuVar2 = ReceiveSurfaceChimeraService.this.c) == null) {
                    return;
                }
                cohuVar2.d = false;
                cohuVar2.c = null;
                cohuVar2.b.removeCallbacks(cohuVar2.e);
            }
        };
        this.l = tracingBroadcastReceiver4;
        chke.b(this.b, tracingBroadcastReceiver4, new IntentFilter("com.google.android.gms.nearby.sharing.ACTION_RECEIVE_SURFACE_REGISTER"));
        this.m = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.8
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context2, Intent intent) {
                ReceiveSurfaceChimeraService receiveSurfaceChimeraService = ReceiveSurfaceChimeraService.this;
                receiveSurfaceChimeraService.d(ctwt.j(receiveSurfaceChimeraService.getApplicationContext()));
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        ind.b(this, this.m, intentFilter, 2);
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        cohq cohqVar = new cohq(this);
        this.p = cohqVar;
        displayManager.registerDisplayListener(cohqVar, new caqj(Looper.getMainLooper()));
        d(ctwt.j(getApplicationContext()));
        this.n = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context2, Intent intent) {
                ReceiveSurfaceChimeraService.this.c(context2);
            }
        };
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter2.addDataScheme("package");
        ind.b(this, this.n, intentFilter2, 4);
        this.o = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.2
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context2, Intent intent) {
                ReceiveSurfaceChimeraService.this.c(context2);
            }
        };
        ind.b(this, this.o, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"), 4);
        conm.a.b().h("ReceiveSurfaceService created with vendorMetadata %s", this.q);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.r.c();
        this.h.e();
        BroadcastReceiver broadcastReceiver = this.i;
        if (broadcastReceiver != null) {
            chke.f(this.b, broadcastReceiver);
        }
        BroadcastReceiver broadcastReceiver2 = this.j;
        if (broadcastReceiver2 != null) {
            chke.f(this.b, broadcastReceiver2);
        }
        BroadcastReceiver broadcastReceiver3 = this.k;
        if (broadcastReceiver3 != null) {
            chke.f(this.b, broadcastReceiver3);
        }
        BroadcastReceiver broadcastReceiver4 = this.l;
        if (broadcastReceiver4 != null) {
            chke.f(this.b, broadcastReceiver4);
        }
        BroadcastReceiver broadcastReceiver5 = this.m;
        if (broadcastReceiver5 != null) {
            chke.f(this.b, broadcastReceiver5);
        }
        if (this.p != null) {
            ((DisplayManager) getSystemService(DisplayManager.class)).unregisterDisplayListener(this.p);
            this.p = null;
        }
        BroadcastReceiver broadcastReceiver6 = this.n;
        if (broadcastReceiver6 != null) {
            chke.f(this.b, broadcastReceiver6);
        }
        this.a.M(this.c);
        conm.a.b().p("ReceiveSurfaceService destroyed", new Object[0]);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.r.d(juo.ON_START);
        conm.a.b().p("ReceiveSurfaceService started", new Object[0]);
        return 1;
    }
}
