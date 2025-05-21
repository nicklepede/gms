package com.google.android.gms.smartdevice.setup.ui;

import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import com.google.android.gms.smartdevice.setup.ui.DiscoveryChimeraActivity;
import defpackage.a;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.aqyd;
import defpackage.arjz;
import defpackage.arkc;
import defpackage.arxo;
import defpackage.azob;
import defpackage.bp;
import defpackage.bziq;
import defpackage.dcxh;
import defpackage.ddng;
import defpackage.ddnt;
import defpackage.ddot;
import defpackage.ddqa;
import defpackage.deiq;
import defpackage.deis;
import defpackage.deit;
import defpackage.dekv;
import defpackage.dekw;
import defpackage.demq;
import defpackage.demz;
import defpackage.denq;
import defpackage.denx;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dg;
import defpackage.eiig;
import defpackage.elsg;
import defpackage.ew;
import defpackage.fkhl;
import defpackage.fsec;
import defpackage.fsfb;
import defpackage.fsfh;
import defpackage.fsfk;
import defpackage.fsgq;
import defpackage.qex;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DiscoveryChimeraActivity extends qex implements dekv, deiq, ddnt {
    public static final arxo h = new denq(new String[]{"DiscoveryChimeraActivity"});
    SourceLogManager i;
    private boolean j;
    private boolean k;
    private deit l;
    private WifiManager m;
    private boolean n;
    private aqxo o;

    private final dg n() {
        String string = getString(R.string.smartdevice_choose_device);
        deis deisVar = new deis();
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.title", string);
        deisVar.setArguments(bundle);
        return deisVar;
    }

    private final void o() {
        WifiManager wifiManager;
        this.j = true;
        this.i.d();
        if (!fsgq.c() && (wifiManager = this.m) != null && !wifiManager.isWifiEnabled()) {
            h.d("Enabling wifi", new Object[0]);
            this.m.setWifiEnabled(true);
            this.k = true;
        }
        if (demz.a(this)) {
            p(n(), true);
        } else {
            demz.b(this.o, new dfak() { // from class: deii
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    DiscoveryChimeraActivity.h.d("location is enabled", new Object[0]);
                }
            }, new dfah() { // from class: deij
                @Override // defpackage.dfah
                public final void gm(Exception exc) {
                    DiscoveryChimeraActivity.this.j(exc);
                }
            });
        }
    }

    private final void p(dg dgVar, boolean z) {
        ew gI = gI();
        bp bpVar = new bp(gI);
        if (gI.g(R.id.fragment_container) != null) {
            bpVar.A(R.anim.slide_next_in, R.anim.slide_next_out, R.anim.slide_back_in, R.anim.slide_back_out);
        }
        if (z) {
            bpVar.w(null);
        }
        bpVar.F(R.id.fragment_container, dgVar);
        bpVar.b();
        Bundle arguments = dgVar.getArguments();
        if (arguments != null) {
            demq.a(getContainerActivity(), arguments.getString("smartdevice.title"));
        }
    }

    @Override // defpackage.dekv
    public final void G(int i) {
        if (i == 0) {
            o();
        } else {
            h.f(a.j(i, "Unknown text fragment id: "), new Object[0]);
        }
    }

    @Override // defpackage.ddnt
    public final void c(int i, Bundle bundle) {
        if (i != 1) {
            finish();
            return;
        }
        if (!this.l.a()) {
            onBackPressed();
            return;
        }
        deit deitVar = this.l;
        ConnectionRequest connectionRequest = deitVar.b;
        if (connectionRequest != null) {
            startActivityForResult(D2DSetupChimeraActivity.n(connectionRequest, deitVar.c, this.i, deitVar.d), 6);
        }
    }

    public final void j(Exception exc) {
        if (!(exc instanceof aqyd)) {
            h.n("Unresolvable exception", exc, new Object[0]);
            return;
        }
        try {
            ((aqyd) exc).c(getContainerActivity(), 4);
        } catch (IntentSender.SendIntentException e) {
            h.l(e);
        }
    }

    @Override // defpackage.deiq
    public final void k() {
        this.i.i(-1, (byte) 0, false, 1);
    }

    @Override // defpackage.deiq
    public final void l(D2DDevice d2DDevice, int i, boolean z) {
        this.i.i(i, d2DDevice.e, z, elsg.a(d2DDevice.b));
        this.n = true;
        startActivityForResult(D2DSetupChimeraActivity.q(this, d2DDevice, this.l.c, null, this.i), 6);
    }

    @Override // defpackage.deiq
    public final void m() {
        this.i.e();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        deit deitVar;
        SourceLogManager sourceLogManager;
        super.onActivityResult(i, i2, intent);
        this.n = false;
        arxo arxoVar = h;
        arxoVar.j("onActivityResult requestCode: %d resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (intent != null && (sourceLogManager = (SourceLogManager) intent.getParcelableExtra("smartdevice.sourceLogManager")) != null) {
            this.i = sourceLogManager;
            sourceLogManager.e = this;
        }
        if (i == 4) {
            if (i2 == -1) {
                o();
                return;
            }
            i = 4;
        }
        if (i != 6) {
            arxoVar.m(a.j(i, "Unhandled activity result for request code "), new Object[0]);
            return;
        }
        if (i2 != 3) {
            if (i2 != 6 || (deitVar = this.l) == null || deitVar.c != 7) {
                finish();
                return;
            }
            ddot ddotVar = new ddot();
            ddotVar.a = 2131233570;
            ddotVar.e(getString(R.string.smartdevice_alert_quit_button), 2);
            ddotVar.b = getString(R.string.common_connect_fail);
            ddotVar.c = getString(R.string.smartdevice_web_deeplink_failed_description);
            p(ddotVar.a(), true);
            return;
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            int i3 = extras != null ? extras.getInt("restart_code", 0) : 0;
            if (i3 == 0) {
                return;
            }
            ddot ddotVar2 = new ddot();
            ddotVar2.a = 2131233570;
            ddotVar2.b = getString(R.string.smartdevice_problem_copying_title);
            ddotVar2.c = getString(R.string.smartdevice_problem_copying);
            ddotVar2.e(getString(R.string.common_try_again), 1);
            ddotVar2.f(getString(R.string.smartdevice_alert_quit_button), 2);
            if (i3 == 1) {
                ddotVar2.b = getString(R.string.common_connect_fail);
                ddotVar2.c = getString(R.string.smartdevice_connection_error);
            } else if (i3 == 2) {
                ddotVar2.b = getString(R.string.smartdevice_alert_disconnected_title);
                ddotVar2.c = getString(R.string.smartdevice_connection_error);
            }
            p(ddotVar2.a(), true);
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        super.onBackPressed();
        if (this.l.a()) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        int i;
        String str;
        float[][] fArr;
        int i2;
        int i3;
        ConnectionRequest connectionRequest;
        dcxh a;
        String lastPathSegment;
        dekw x;
        int i4;
        Object obj;
        Uri data;
        super.onCreate(bundle);
        if (fkhl.c()) {
            arjz.a(this);
        }
        arkc.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        arxo arxoVar = deit.a;
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra == null) {
            if (!intent.hasExtra("com.google.android.gms.nearby.messages.ble.EXTRA_BLE_RECORD_BYTES")) {
                Uri data2 = intent.getData();
                if (data2 != null) {
                    String host = data2.getHost();
                    if (TextUtils.equals(host, "qr")) {
                        i = 8;
                    } else if (TextUtils.equals(host, "pair")) {
                        i = 7;
                    }
                }
                i = 0;
            }
            i = 5;
        } else if (stringExtra.startsWith("android-app://com.google.android.googlequicksearchbox")) {
            i = 2;
        } else if (stringExtra.startsWith("gcore-settings")) {
            i = 3;
        } else {
            if (!stringExtra.startsWith("fastpair")) {
                if (stringExtra.startsWith("agsa")) {
                    i = 6;
                }
                i = 0;
            }
            i = 5;
        }
        arxo arxoVar2 = deit.a;
        arxoVar2.d("TriggerType = %d", Integer.valueOf(i));
        if (i != 5) {
            if (i == 6) {
                i4 = i;
                str = "deeplink";
                i3 = 1;
                fArr = null;
                Uri uri = (Uri) intent.getParcelableExtra(str);
                if (uri != null) {
                    arxoVar2.d("Uri: (%s)", uri);
                    String lastPathSegment2 = uri.getLastPathSegment();
                    String queryParameter = uri.getQueryParameter("key");
                    if (TextUtils.isEmpty(lastPathSegment2)) {
                        i2 = i4;
                        connectionRequest = fArr;
                    } else {
                        if (lastPathSegment2.length() == 5) {
                            lastPathSegment2 = lastPathSegment2.substring(1, 5);
                        }
                        i2 = i4;
                        connectionRequest = new ConnectionRequest(null, null, lastPathSegment2, null, queryParameter, i4, false, false, false, 0, 0);
                    }
                }
                obj = fArr;
            } else if ((i == 7 || i == 8) && (data = intent.getData()) != null) {
                arxoVar2.d("Uri: (%s)", data);
                String lastPathSegment3 = data.getLastPathSegment();
                String stringExtra2 = intent.getStringExtra("key");
                if (TextUtils.isEmpty(lastPathSegment3)) {
                    i4 = i;
                    str = "deeplink";
                    i3 = 1;
                    fArr = null;
                    obj = fArr;
                } else {
                    i4 = i;
                    str = "deeplink";
                    i3 = 1;
                    fArr = null;
                    obj = new ConnectionRequest(null, null, lastPathSegment3, null, stringExtra2, i4, false, false, false, 0, 0);
                }
            } else {
                str = "deeplink";
                fArr = null;
                connectionRequest = 0;
                i2 = i;
                i3 = 1;
            }
            i2 = i4;
            connectionRequest = obj;
        } else {
            str = "deeplink";
            fArr = null;
            i2 = i;
            i3 = 1;
            byte[] b = deit.b(intent);
            if (b != null && b.length > 0) {
                arxoVar2.d("Fastpair code: (%s)", Arrays.toString(b));
                connectionRequest = new ConnectionRequest(null, null, null, b, null, 5, false, false, false, 0, 0);
            }
            connectionRequest = fArr;
        }
        if (intent.hasExtra("device_type")) {
            a = dcxh.a(intent.getStringExtra("device_type"));
        } else {
            Uri uri2 = (Uri) intent.getParcelableExtra(str);
            a = (uri2 != null && fsfk.a.a().a() && (lastPathSegment = uri2.getLastPathSegment()) != null && lastPathSegment.length() == 5 && Integer.parseInt(lastPathSegment.substring(0, i3)) == 7) ? dcxh.a(ddng.AUTO.name()) : dcxh.UNKNOWN;
        }
        deit deitVar = new deit(i2, connectionRequest, a);
        this.l = deitVar;
        arxo arxoVar3 = h;
        Object[] objArr = new Object[i3];
        objArr[0] = deitVar;
        arxoVar3.d("entryPointInfo: %s", objArr);
        if (!fsec.d()) {
            arxoVar3.d("Start preparing esim transfer data for unknown or allow-listed devices.", new Object[0]);
            new azob(this).a();
        }
        this.m = (WifiManager) getApplicationContext().getSystemService("wifi");
        aqxd aqxdVar = bziq.a;
        this.o = new aqxo(this, fArr);
        int i5 = this.l.c;
        if (bundle == null) {
            SourceLogManager sourceLogManager = new SourceLogManager(this);
            this.i = sourceLogManager;
            sourceLogManager.h(i5, ddqa.a(this));
        } else {
            this.n = bundle.getBoolean("isWaitingForResult");
            this.j = bundle.getBoolean("smartdevice.discoveryActivity.consentConfirmed");
            this.k = bundle.getBoolean("smartdevice.discoveryActivity.enabledWifi");
            SourceLogManager sourceLogManager2 = (SourceLogManager) bundle.getParcelable("smartdevice.sourceLogManager");
            eiig.x(sourceLogManager2);
            this.i = sourceLogManager2;
            sourceLogManager2.e = this;
        }
        denx a2 = denx.a(this);
        int i6 = (a2 != null && a2.d() && fsgq.c() && fsfh.a.a().L()) ? i3 : 0;
        ConnectionRequest connectionRequest2 = this.l.b;
        if (connectionRequest2 != null) {
            this.i.e();
            this.i.i(0, this.l.d.i, false, 3);
            startActivityForResult(D2DSetupChimeraActivity.n(connectionRequest2, i5, this.i, this.l.d), 6);
        } else {
            if (i6 != 0) {
                p(n(), false);
                return;
            }
            if (this.j) {
                return;
            }
            if (intent == null || dcxh.a(intent.getStringExtra("device_type")) != dcxh.AUTO) {
                x = dekw.x(getString(R.string.smartdevice_setup_intro_title), fsfb.a.a().f() ? getString(R.string.smartdevice_intro_text_with_location) : fsgq.c() ? getString(R.string.smartdevice_intro_text_bt_only) : getString(R.string.smartdevice_setup_intro_text), getString(R.string.common_next));
            } else {
                x = dekw.y(getString(R.string.smartdevice_intro_title_auto), getString(R.string.smartdevice_intro_text_auto), getString(R.string.common_connect), 2131232977);
            }
            p(x, false);
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        if (isFinishing()) {
            if (this.m != null && this.k) {
                h.j("Resetting wifi to disabled state", new Object[0]);
                this.m.setWifiEnabled(false);
                this.k = false;
            }
            if (!this.n) {
                this.i.a();
            }
        }
        super.onDestroy();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        h.d("onNewIntent().", new Object[0]);
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            stringExtra.equals("fastpair");
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("smartdevice.discoveryActivity.consentConfirmed", this.j);
        bundle.putBoolean("smartdevice.discoveryActivity.enabledWifi", this.k);
        bundle.putParcelable("smartdevice.sourceLogManager", this.i);
        bundle.putBoolean("isWaitingForResult", this.n);
    }
}
