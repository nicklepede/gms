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
import defpackage.aqxo;
import defpackage.aqxt;
import defpackage.arco;
import defpackage.arcy;
import defpackage.byhr;
import defpackage.cewk;
import defpackage.cewl;
import defpackage.cfcs;
import defpackage.clxh;
import defpackage.clxk;
import defpackage.clzi;
import defpackage.clzm;
import defpackage.cmaz;
import defpackage.cmbu;
import defpackage.cmeu;
import defpackage.cmfe;
import defpackage.cmfx;
import defpackage.cmfy;
import defpackage.cnad;
import defpackage.cnau;
import defpackage.coih;
import defpackage.coik;
import defpackage.coil;
import defpackage.coim;
import defpackage.crmi;
import defpackage.crno;
import defpackage.crnv;
import defpackage.croc;
import defpackage.deov;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.eihn;
import defpackage.fiwo;
import defpackage.fqmf;
import defpackage.fqmn;
import defpackage.fvnf;
import defpackage.fvnv;
import defpackage.fvnw;
import defpackage.fvqn;
import defpackage.fvqq;
import defpackage.iln;
import defpackage.jnz;
import defpackage.job;
import defpackage.jol;
import defpackage.jon;
import defpackage.jqn;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ReceiveSurfaceChimeraService extends clxk implements jon {
    public cmaz a;
    public Context b;
    public clzm c;
    public boolean d;
    public Intent e;
    public fiwo g;
    private clxh h;
    private BroadcastReceiver i;
    private BroadcastReceiver j;
    private BroadcastReceiver k;
    private BroadcastReceiver l;
    private BroadcastReceiver m;
    private BroadcastReceiver n;
    private BroadcastReceiver o;
    private DisplayManager.DisplayListener p;
    private cmfx q;
    final Handler f = new byhr();
    private final jqn r = new jqn(this);

    public final void b(Intent intent) {
        Context applicationContext = getApplicationContext();
        this.h.b.e("nearby_sharing", 5);
        if (intent.getStringExtra("android.intent.extra.TEXT") != null) {
            crnv.c(applicationContext, intent);
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
        crmi.m(applicationContext, arrayList, intent.getBooleanExtra("android.content.extra.IS_SENSITIVE", false), intent.getBooleanExtra("copy_paste_extra_need_toast", true), intent.getBooleanExtra("android.content.extra.IS_REMOTE_DEVICE", false), intent.getStringExtra("android.content.extra.REMOTE_DEVICE_NAME"));
    }

    public final void c(Context context) {
        cmfx a = cmfy.a(context);
        if (eihn.a(this.q, a)) {
            return;
        }
        this.q = a;
        this.a.M(this.c);
        if (cmfy.b(this).e()) {
            cmfx cmfxVar = this.q;
            if (cmfxVar != null) {
                cmbu cmbuVar = new cmbu(cmfxVar.b);
                int i = cewl.a;
                this.a = new cnad(this, cmbuVar);
            } else {
                cmbu cmbuVar2 = new cmbu((int) fqmf.q());
                int i2 = cewl.a;
                this.a = new cnad(this, cmbuVar2);
            }
        } else {
            cmbu cmbuVar3 = new cmbu(0);
            int i3 = cewl.a;
            this.a = new cnad(this, cmbuVar3);
        }
        Handler handler = this.f;
        clxh clxhVar = this.h;
        cmaz cmazVar = this.a;
        clzm clzmVar = new clzm(context, handler, clxhVar, cmazVar);
        this.c = clzmVar;
        cmazVar.I(clzmVar);
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
        new byhr(Looper.getMainLooper()).post(new Runnable() { // from class: clzh
            @Override // java.lang.Runnable
            public final void run() {
                Context context = ReceiveSurfaceChimeraService.this.b;
                Toast.makeText(context, context.getString(i2, strArr), i).show();
            }
        });
    }

    @Override // defpackage.jon
    public final job getLifecycle() {
        return this.r.a;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        this.r.a();
        return null;
    }

    @Override // defpackage.clxk, com.google.android.chimera.Service
    public final void onCreate() {
        cmaz cmazVar;
        this.r.b();
        super.onCreate();
        this.q = cmfy.a(this);
        if (this.h == null) {
            this.h = clxh.d(this.b);
        }
        if (cmfy.b(this).e() && this.a == null) {
            cmfx cmfxVar = this.q;
            if (cmfxVar != null) {
                cmbu cmbuVar = new cmbu(cmfxVar.b);
                int i = cewl.a;
                cmazVar = new cnad(this, cmbuVar);
            } else {
                cmbu cmbuVar2 = new cmbu((int) fqmf.q());
                int i2 = cewl.a;
                cmazVar = new cnad(this, cmbuVar2);
            }
        } else {
            if (this.a == null) {
                this.a = cewl.e(this);
            }
            cmazVar = this.a;
        }
        this.a = cmazVar;
        Context context = this.b;
        Handler handler = this.f;
        clxh clxhVar = this.h;
        cmaz cmazVar2 = this.a;
        clzm clzmVar = new clzm(context, handler, clxhVar, cmazVar2);
        this.c = clzmVar;
        cmazVar2.I(clzmVar);
        TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.3
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context2, Intent intent) {
                ReceiveSurfaceChimeraService receiveSurfaceChimeraService = ReceiveSurfaceChimeraService.this;
                if (receiveSurfaceChimeraService.d) {
                    receiveSurfaceChimeraService.b(intent);
                } else {
                    receiveSurfaceChimeraService.e = intent;
                    cmfe.a.b().p("Waiting unlock and copy to clipboard, due to screen locked.", new Object[0]);
                }
            }
        };
        this.i = tracingBroadcastReceiver;
        cfcs.b(this.b, tracingBroadcastReceiver, new IntentFilter("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD"));
        if (fqmn.a.a().aa()) {
            coim coimVar = (coim) this.g.a();
            fvnv.d(fvnw.b(new fvqq(new fvnf(new coik(new fvqn(new coih(fvnw.a(cmeu.a(coimVar.a, "WifiReceiver", new IntentFilter("com.google.android.gms.nearby.sharing.CONNECT_WIFI"))))), null, coimVar)), new coil(coimVar, null)), coimVar.c), jol.a(getLifecycle()));
        } else {
            TracingBroadcastReceiver tracingBroadcastReceiver2 = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.4
                @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                public final void jz(Context context2, Intent intent) {
                    dfaq a;
                    WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) intent.getParcelableExtra("wifi_credentials_attachment");
                    if (wifiCredentialsAttachment == null) {
                        return;
                    }
                    final ReceiveSurfaceChimeraService receiveSurfaceChimeraService = ReceiveSurfaceChimeraService.this;
                    final String str = wifiCredentialsAttachment.a;
                    receiveSurfaceChimeraService.f(1, R.string.sharing_toast_wifi_connecting, str);
                    if (croc.d(receiveSurfaceChimeraService.b, str)) {
                        cmfe.a.b().h("Already connected to ssid %s.", str);
                        receiveSurfaceChimeraService.f(0, R.string.sharing_toast_wifi_connection_succeeded, str);
                    } else {
                        int i3 = wifiCredentialsAttachment.b;
                        String str2 = wifiCredentialsAttachment.d;
                        Context context3 = receiveSurfaceChimeraService.b;
                        boolean z = wifiCredentialsAttachment.e;
                        deov deovVar = new deov(context3.getApplicationContext());
                        String str3 = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? null : "SAE" : "WEP" : "PSK" : "Open";
                        if (str3 == null) {
                            a = dfbl.c(new IllegalArgumentException(String.format(Locale.getDefault(), "connectToWifi failed to connect to ssid %s because an unknown securityType (%s) was given.", str, Integer.valueOf(i3))));
                        } else {
                            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = new ConnectToWifiNetworkRequest();
                            if (str2 != null) {
                                connectToWifiNetworkRequest.c = str2;
                            }
                            connectToWifiNetworkRequest.a = str;
                            connectToWifiNetworkRequest.b = str3;
                            connectToWifiNetworkRequest.d = z;
                            a = deovVar.a(connectToWifiNetworkRequest);
                        }
                        a.z(new dfak() { // from class: clzf
                            @Override // defpackage.dfak
                            public final void gn(Object obj) {
                                ReceiveSurfaceChimeraService.this.f(0, R.string.sharing_toast_wifi_connection_succeeded, str);
                            }
                        });
                        a.y(new dfah() { // from class: clzg
                            @Override // defpackage.dfah
                            public final void gm(Exception exc) {
                                String str4 = str;
                                ReceiveSurfaceChimeraService.this.f(0, R.string.sharing_toast_wifi_connection_failed, str4);
                                cmfe.a.e().f(exc).h("WifiUtils#connectToWifi failed to connect to %s", str4);
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
            cfcs.b(this.b, tracingBroadcastReceiver2, new IntentFilter("com.google.android.gms.nearby.sharing.CONNECT_WIFI"));
        }
        TracingBroadcastReceiver tracingBroadcastReceiver3 = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.5
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context2, Intent intent) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("share_target_bytes");
                final long longExtra = intent.getLongExtra("attachment_id", -1L);
                if (byteArrayExtra == null) {
                    cmfe.a.b().p("Failed to get share target from intent.", new Object[0]);
                    return;
                }
                final ShareTarget shareTarget = (ShareTarget) cnau.b(byteArrayExtra, ShareTarget.CREATOR);
                aqxt aqxtVar = ReceiveSurfaceChimeraService.this.a;
                arcy arcyVar = new arcy();
                arcyVar.a = new arco() { // from class: cmyg
                    @Override // defpackage.arco
                    public final void d(Object obj, Object obj2) {
                        int i3 = cnad.a;
                        cmwv cmwvVar = (cmwv) ((cnbx) obj).H();
                        InstallParams installParams = new InstallParams();
                        installParams.a = ShareTarget.this;
                        installParams.b = longExtra;
                        installParams.c = new cmzu((dfau) obj2);
                        cmwvVar.x(installParams);
                    }
                };
                arcyVar.c = new Feature[]{cewk.e};
                arcyVar.d = 1282;
                ((aqxo) aqxtVar).iT(arcyVar.a());
            }
        };
        this.k = tracingBroadcastReceiver3;
        cfcs.b(this.b, tracingBroadcastReceiver3, new IntentFilter("com.google.android.gms.nearby.sharing.INSTALL_APP"));
        TracingBroadcastReceiver tracingBroadcastReceiver4 = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.7
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context2, Intent intent) {
                clzm clzmVar2;
                if (intent.getIntExtra("register_receive_surface_state", -1) != 1 || (clzmVar2 = ReceiveSurfaceChimeraService.this.c) == null) {
                    return;
                }
                clzmVar2.d = false;
                clzmVar2.c = null;
                clzmVar2.b.removeCallbacks(clzmVar2.e);
            }
        };
        this.l = tracingBroadcastReceiver4;
        cfcs.b(this.b, tracingBroadcastReceiver4, new IntentFilter("com.google.android.gms.nearby.sharing.ACTION_RECEIVE_SURFACE_REGISTER"));
        this.m = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.8
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context2, Intent intent) {
                ReceiveSurfaceChimeraService receiveSurfaceChimeraService = ReceiveSurfaceChimeraService.this;
                receiveSurfaceChimeraService.d(crno.j(receiveSurfaceChimeraService.getApplicationContext()));
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        iln.b(this, this.m, intentFilter, 2);
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        clzi clziVar = new clzi(this);
        this.p = clziVar;
        displayManager.registerDisplayListener(clziVar, new byhr(Looper.getMainLooper()));
        d(crno.j(getApplicationContext()));
        this.n = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context2, Intent intent) {
                ReceiveSurfaceChimeraService.this.c(context2);
            }
        };
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter2.addDataScheme("package");
        iln.b(this, this.n, intentFilter2, 4);
        this.o = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService.2
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context2, Intent intent) {
                ReceiveSurfaceChimeraService.this.c(context2);
            }
        };
        iln.b(this, this.o, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"), 4);
        cmfe.a.b().h("ReceiveSurfaceService created with vendorMetadata %s", this.q);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.r.c();
        this.h.e();
        BroadcastReceiver broadcastReceiver = this.i;
        if (broadcastReceiver != null) {
            cfcs.f(this.b, broadcastReceiver);
        }
        BroadcastReceiver broadcastReceiver2 = this.j;
        if (broadcastReceiver2 != null) {
            cfcs.f(this.b, broadcastReceiver2);
        }
        BroadcastReceiver broadcastReceiver3 = this.k;
        if (broadcastReceiver3 != null) {
            cfcs.f(this.b, broadcastReceiver3);
        }
        BroadcastReceiver broadcastReceiver4 = this.l;
        if (broadcastReceiver4 != null) {
            cfcs.f(this.b, broadcastReceiver4);
        }
        BroadcastReceiver broadcastReceiver5 = this.m;
        if (broadcastReceiver5 != null) {
            cfcs.f(this.b, broadcastReceiver5);
        }
        if (this.p != null) {
            ((DisplayManager) getSystemService(DisplayManager.class)).unregisterDisplayListener(this.p);
            this.p = null;
        }
        BroadcastReceiver broadcastReceiver6 = this.n;
        if (broadcastReceiver6 != null) {
            cfcs.f(this.b, broadcastReceiver6);
        }
        this.a.M(this.c);
        cmfe.a.b().p("ReceiveSurfaceService destroyed", new Object[0]);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.r.d(jnz.ON_START);
        cmfe.a.b().p("ReceiveSurfaceService started", new Object[0]);
        return 1;
    }
}
