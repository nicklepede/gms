package com.google.android.gms.backup.d2d.component;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.usb.UsbAccessory;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;
import defpackage.a;
import defpackage.ahwd;
import defpackage.aihu;
import defpackage.aihv;
import defpackage.aihy;
import defpackage.ailg;
import defpackage.aiwb;
import defpackage.aiwc;
import defpackage.aiwe;
import defpackage.aiwf;
import defpackage.aiwg;
import defpackage.aiwh;
import defpackage.aiwk;
import defpackage.aiwl;
import defpackage.aiwm;
import defpackage.aiwn;
import defpackage.aiwq;
import defpackage.aiwr;
import defpackage.aiws;
import defpackage.asiu;
import defpackage.bp;
import defpackage.bxao;
import defpackage.byit;
import defpackage.byiu;
import defpackage.dg;
import defpackage.edeq;
import defpackage.edgk;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.fhmn;
import defpackage.fllb;
import defpackage.flpt;
import defpackage.flql;
import defpackage.iln;
import defpackage.ips;
import defpackage.qfp;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class D2dSourceChimeraActivity extends qfp implements aiwe, aiwk, aiwq, aiwb {
    public static final ahwd j = new ahwd("D2dSourceChimeraActivity");
    static final eitj k;
    static final eitj l;
    public ailg m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public aihu r;
    private boolean v = true;
    public fhmn s = null;
    public fhmn t = fhmn.CONNECTION_TYPE_UNSPECIFIED;
    private final aihy w = new aihy(this);
    private final eijr x = eijy.a(new eijr() { // from class: aihs
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(aies.h());
        }
    });
    public final eijr u = eijy.a(new eijr() { // from class: aiht
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(fllb.p());
        }
    });

    static {
        eitj n = eitj.n("android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.READ_SMS");
        k = n;
        eite eiteVar = new eite();
        eiteVar.k(n);
        eiteVar.i("android.permission.ACCESS_MEDIA_LOCATION");
        l = eiteVar.g();
        eitj.q("android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_CONTACTS", "android.permission.READ_SMS", "android.permission.ACCESS_MEDIA_LOCATION");
    }

    private final void A() {
        try {
            j.j("Calling unregister callbacks.", new Object[0]);
            this.m.m(this.n);
            this.n = null;
        } catch (RemoteException unused) {
            j.j("Remote exception while trying to unregister; ignoring.", new Object[0]);
        }
    }

    private final boolean B() {
        return Objects.equals(getIntent().getAction(), "com.google.android.gms.backup.ACTION_WIFI_D2D");
    }

    public static final boolean u(UsbAccessory usbAccessory) {
        return usbAccessory != null && Objects.equals(usbAccessory.getSerial(), fllb.a.a().S());
    }

    private final void v() {
        if (((Boolean) this.u.a()).booleanValue()) {
            if (B()) {
                this.t = fhmn.WIFI;
                return;
            }
            if (!r()) {
                j.m("Activity is launched by a general intent, flow type is set to unspecified.", new Object[0]);
                this.t = fhmn.CONNECTION_TYPE_UNSPECIFIED;
            } else if (u((UsbAccessory) getIntent().getParcelableExtra("accessory"))) {
                this.t = fhmn.WIFI;
            } else {
                this.t = fhmn.USB;
            }
        }
    }

    private final void w(dg dgVar) {
        Bundle bundle = new Bundle();
        bundle.putString("target_device_model", this.o);
        dgVar.setArguments(bundle);
    }

    private final void x() {
        ahwd ahwdVar = j;
        ahwdVar.j("Starting the service and binding to it.", new Object[0]);
        if (this.n != null) {
            ahwdVar.m("uuidForServiceCallbacksRegister is not null. The service resources might have not been freed correctly!", new Object[0]);
        }
        this.n = UUID.randomUUID().toString();
        Intent putExtra = s() ? D2dSourceChimeraService.a(this).putExtra("is_wifi_d2d", true) : D2dSourceChimeraService.a(this);
        startService(putExtra);
        asiu.a().d(this, putExtra, this.w, 1);
        this.p = true;
    }

    private final void y() {
        if (!flpt.a.a().b()) {
            x();
            return;
        }
        HashSet hashSet = new HashSet();
        eitj eitjVar = Build.VERSION.SDK_INT >= 30 ? l : k;
        for (int i = 0; i < ((ejcb) eitjVar).c; i++) {
            String str = (String) eitjVar.get(i);
            if (bxao.b(this, str) != 0) {
                hashSet.add(str);
            }
        }
        if (hashSet.isEmpty()) {
            j.d("All required permissions granted, proceeding.", new Object[0]);
            x();
        } else {
            j.d("%s permissions not granted, requesting permissions.", hashSet);
            iln.h(getContainerActivity(), (String[]) hashSet.toArray(new String[hashSet.size()]), 0);
        }
    }

    private final void z() {
        j.d("Unbinding service", new Object[0]);
        try {
            asiu.a().b(this, this.w);
        } catch (IllegalArgumentException | IllegalStateException e) {
            j.l(e);
        }
    }

    public final dg a(aihu aihuVar) {
        dg aiwhVar;
        dg h = getSupportFragmentManager().h(aihuVar.name());
        if (h != null) {
            j.j("%s already exists, reusing.", aihuVar);
            return h;
        }
        switch (aihuVar) {
            case CONNECTING_FRAGMENT:
                aiwhVar = new aiwh();
                break;
            case CONNECTED_FRAGMENT:
                aiwhVar = new aiwg();
                w(aiwhVar);
                break;
            case LOCKSCREEN_FRAGMENT:
                aiwhVar = new aiwf();
                break;
            case COPY_CONFIRMATION_FRAGMENT:
                aiwhVar = new aiwl();
                w(aiwhVar);
                break;
            case WAITING_FRAGMENT:
                boolean s = s();
                aiwhVar = new aiws();
                Bundle bundle = new Bundle();
                bundle.putBoolean("isWifiD2d", s);
                aiwhVar.setArguments(bundle);
                w(aiwhVar);
                break;
            case COPYING_FRAGMENT:
                boolean s2 = s();
                boolean y = flql.a.a().y();
                String str = this.o;
                aiwm aiwmVar = new aiwm();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("isWifiD2d", s2);
                bundle2.putBoolean("shouldUseNewSubText", y);
                bundle2.putString("target_device_model", str);
                aiwmVar.setArguments(bundle2);
                aiwhVar = aiwmVar;
                break;
            case SUCCESS_FRAGMENT:
                boolean s3 = s();
                aiwhVar = new aiwr();
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("isWifiD2d", s3);
                aiwhVar.setArguments(bundle3);
                w(aiwhVar);
                break;
            case DISCONNECTED_FRAGMENT:
                boolean s4 = s();
                aiwhVar = new aiwn();
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("isWifiD2d", s4);
                aiwhVar.setArguments(bundle4);
                w(aiwhVar);
                break;
            default:
                throw new RuntimeException("Unknown fragment tag.");
        }
        j.j("Created new %s", aihuVar);
        return aiwhVar;
    }

    public final void b() {
        n(new aihv() { // from class: aihr
            @Override // defpackage.aihv
            public final void a() {
                D2dSourceChimeraActivity.this.m.e();
            }
        });
    }

    @Override // defpackage.aiwb
    public final void c() {
        n(new aihv() { // from class: aihp
            @Override // defpackage.aihv
            public final void a() {
                D2dSourceChimeraActivity.this.m.b();
            }
        });
        p();
    }

    @Override // defpackage.aiwk
    public final void f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_transferring", false);
        aiwc aiwcVar = new aiwc();
        aiwcVar.setArguments(bundle);
        aiwcVar.show(getSupportFragmentManager(), "DIALOG");
    }

    @Override // defpackage.aiwk
    public final void g() {
        o(aihu.WAITING_FRAGMENT);
        n(new aihv() { // from class: aihq
            @Override // defpackage.aihv
            public final void a() {
                D2dSourceChimeraActivity.this.m.d();
            }
        });
    }

    @Override // defpackage.aiwe
    public final void k() {
        j.f("The screen lock failed", new Object[0]);
    }

    @Override // defpackage.aiwe
    public final void l() {
        if (this.m != null) {
            b();
        } else {
            j.j("onScreenUnlocked() was called before the service is bound,saving the unlocked state.", new Object[0]);
            this.q = true;
        }
    }

    @Override // defpackage.aiwq
    public final void m() {
        p();
    }

    public final void n(aihv aihvVar) {
        try {
        } catch (RemoteException e) {
            j.g("Unexpected remote exception; aborting migration: ", e, new Object[0]);
        }
        if (this.m != null) {
            aihvVar.a();
            return;
        }
        j.f("Unable to call method because boundServiceInterface is null. Raise a bug.", new Object[0]);
        j.f("Unable to call service; killing activity.", new Object[0]);
        p();
    }

    public final void o(aihu aihuVar) {
        this.r = aihuVar;
        dg a = a(aihuVar);
        if (a.isVisible()) {
            j.d(String.valueOf(String.valueOf(aihuVar)).concat(" is already visible, reusing."), new Object[0]);
            return;
        }
        if (this.v) {
            j.m("Activity is paused; ignoring fragment change.", new Object[0]);
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.source_main_container, a, aihuVar.name());
        bpVar.a();
        j.j("Changing the visible fragment to %s", aihuVar);
    }

    @Override // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        int i2 = edjs.a;
        if (edeq.v(this) && edeq.z(this)) {
            j.d("Setting sucUsePartnerResource theme attribute to true.", new Object[0]);
            theme.applyStyle(R.style.BcStyleThemeOverlay, true);
        } else {
            j.d("Setting sucUsePartnerResource theme attribute to false.", new Object[0]);
            theme.applyStyle(R.style.HeavyThemeOverlay, true);
        }
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        int i = edjs.a;
        boolean v = edeq.v(this);
        edjt d = edjt.d();
        int i2 = d.a;
        String str = d.b;
        boolean z = d.c;
        setTheme(new edjt(edjs.b(this), v).c(getIntent().getStringExtra("theme"), !v));
        if (edeq.w(this)) {
            setTheme(edjs.a(this));
        }
        ahwd ahwdVar = j;
        ahwdVar.j("onCreate", new Object[0]);
        super.onCreate(bundle);
        v();
        if (B() && !flql.d()) {
            ahwdVar.h("Launched for wifi d2d but feature is disabled by flag. Finishing.", new Object[0]);
            finish();
            return;
        }
        int i3 = ips.a;
        if (bxao.b(this, "android.permission.NFC") == 0) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
            if (defaultAdapter != null) {
                ahwdVar.d("Disabling NFC for d2d source device", new Object[0]);
                try {
                    byiu.b(NfcAdapter.class, "setNdefPushMessage", defaultAdapter, new byit(NdefMessage.class, null), new byit(Activity.class, getContainerActivity()), new byit(Activity[].class, new Activity[0]));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    j.d("Unable to disable NFC for d2d source device ".concat(String.valueOf(e.toString())), new Object[0]);
                }
            }
        } else {
            ahwdVar.d("Unable to disable NFC for d2d source device because NFC permission is not granted.", new Object[0]);
        }
        setContentView(getLayoutInflater().inflate(R.layout.source_activity, (ViewGroup) null));
        if (!fllb.a.a().aa()) {
            setRequestedOrientation(1);
        }
        edgk.f(getWindow(), false);
        getWindow().addFlags(128);
        this.o = getString(R.string.source_default_target_device_name);
        if (bundle != null) {
            this.r = (aihu) Enum.valueOf(aihu.class, bundle.getString("current_fragment", aihu.CONNECTED_FRAGMENT.name()));
            if (bundle.isEmpty()) {
                j.h("Activity is restored with an empty savedInstanceState bundle.", new Object[0]);
            }
        } else {
            this.r = s() ? aihu.WAITING_FRAGMENT : aihu.CONNECTED_FRAGMENT;
        }
        if (bundle != null) {
            j.j("Activity is restored with non empty saved instance state.", new Object[0]);
            this.s = (fhmn) bundle.getSerializable("connection_type");
        } else if ((getIntent().getFlags() & 1048576) != 0) {
            j.j("Activity is launched from history, not starting the protocol.", new Object[0]);
            this.s = null;
        } else if (r()) {
            if (((Boolean) this.x.a()).booleanValue()) {
                j.j("Activity is created via adb for e2e testing. Not Starting protocol yet.", new Object[0]);
                this.s = null;
            } else {
                j.h("Activity is created by attaching the cable.", new Object[0]);
                this.s = fhmn.USB;
            }
        } else if (B()) {
            if (getIntent().getBooleanExtra("com.google.android.gms.backup.LAUNCHED_FROM_NOTIFICATION", false)) {
                j.h("Activity is created by wifi d2d intent from notification", new Object[0]);
            } else {
                j.h("Activity is created by wifi d2d intent.", new Object[0]);
            }
            this.s = fhmn.WIFI;
        } else {
            j.h("Activity is launched by a general intent, not starting the protocol.", new Object[0]);
            this.s = null;
        }
        if (!fllb.a.a().aQ() || this.r == aihu.SUCCESS_FRAGMENT) {
            return;
        }
        y();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        j.j("onDestroy", new Object[0]);
        super.onDestroy();
        q();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        j.j("onNewIntent. Action=%s", intent.getAction());
        q();
        super.onNewIntent(intent);
        setIntent(intent);
        v();
        if (B()) {
            this.s = fhmn.WIFI;
        } else if (r()) {
            this.s = fhmn.USB;
        }
        y();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        j.j("onPause", new Object[0]);
        this.v = true;
        super.onPause();
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 0) {
            j.m(a.j(i, "unhandled onRequestPermissionsResult() "), new Object[0]);
            return;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (iArr[i2] == 0) {
                j.d("onRequestPermissionsResult() Permission granted: %s", strArr[i2]);
            } else {
                j.d("onRequestPermissionsResult() Permission denied: %s", strArr[i2]);
            }
        }
        x();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        j.j("onResume", new Object[0]);
        this.v = false;
        super.onResume();
        o(this.r);
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("connection_type", this.s);
        bundle.putString("current_fragment", this.r.name());
        super.onSaveInstanceState(bundle);
    }

    public final void p() {
        j.h("Stopping service.", new Object[0]);
        Intent a = D2dSourceChimeraService.a(this);
        a.putExtra("stop_service", true);
        startService(a);
        finishAndRemoveTask();
    }

    public final void q() {
        if (!fllb.a.a().W()) {
            if (this.m == null) {
                j.d("mBoundServiceInterface already null; not unbinding.", new Object[0]);
                return;
            } else {
                A();
                z();
                return;
            }
        }
        if (this.m != null && this.p) {
            A();
        }
        if (this.p) {
            z();
        }
        this.p = false;
    }

    public final boolean r() {
        if (Objects.equals(getIntent().getAction(), "android.hardware.usb.action.USB_ACCESSORY_ATTACHED") && getIntent().hasExtra("accessory")) {
            return true;
        }
        return ((Boolean) this.x.a()).booleanValue() && !Objects.equals(this.t, fhmn.WIFI);
    }

    public final boolean s() {
        return !((Boolean) this.u.a()).booleanValue() ? B() : this.t == fhmn.WIFI;
    }

    @Override // defpackage.aiwe
    public final void h() {
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
    }
}
