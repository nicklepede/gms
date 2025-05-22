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
import defpackage.ajwt;
import defpackage.akik;
import defpackage.akil;
import defpackage.akio;
import defpackage.aklw;
import defpackage.akwr;
import defpackage.akws;
import defpackage.akwu;
import defpackage.akwv;
import defpackage.akww;
import defpackage.akwx;
import defpackage.akxa;
import defpackage.akxb;
import defpackage.akxc;
import defpackage.akxd;
import defpackage.akxg;
import defpackage.akxh;
import defpackage.akxi;
import defpackage.aumo;
import defpackage.bp;
import defpackage.bzje;
import defpackage.carl;
import defpackage.carm;
import defpackage.dg;
import defpackage.efrl;
import defpackage.eftf;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.fkck;
import defpackage.focl;
import defpackage.fohd;
import defpackage.fohv;
import defpackage.ind;
import defpackage.iri;
import defpackage.ryt;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class D2dSourceChimeraActivity extends ryt implements akwu, akxa, akxg, akwr {
    public static final ajwt j = new ajwt("D2dSourceChimeraActivity");
    static final elgo k;
    static final elgo l;
    public aklw m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public akik r;
    private boolean v = true;
    public fkck s = null;
    public fkck t = fkck.CONNECTION_TYPE_UNSPECIFIED;
    private final akio w = new akio(this);
    private final ekww x = ekxd.a(new ekww() { // from class: akii
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(akfi.h());
        }
    });
    public final ekww u = ekxd.a(new ekww() { // from class: akij
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(focl.p());
        }
    });

    static {
        elgo n = elgo.n("android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.READ_SMS");
        k = n;
        elgj elgjVar = new elgj();
        elgjVar.k(n);
        elgjVar.i("android.permission.ACCESS_MEDIA_LOCATION");
        l = elgjVar.g();
        elgo.q("android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_CONTACTS", "android.permission.READ_SMS", "android.permission.ACCESS_MEDIA_LOCATION");
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
        return usbAccessory != null && Objects.equals(usbAccessory.getSerial(), focl.a.lK().S());
    }

    private final void v() {
        if (((Boolean) this.u.lK()).booleanValue()) {
            if (B()) {
                this.t = fkck.WIFI;
                return;
            }
            if (!r()) {
                j.m("Activity is launched by a general intent, flow type is set to unspecified.", new Object[0]);
                this.t = fkck.CONNECTION_TYPE_UNSPECIFIED;
            } else if (u((UsbAccessory) getIntent().getParcelableExtra("accessory"))) {
                this.t = fkck.WIFI;
            } else {
                this.t = fkck.USB;
            }
        }
    }

    private final void w(dg dgVar) {
        Bundle bundle = new Bundle();
        bundle.putString("target_device_model", this.o);
        dgVar.setArguments(bundle);
    }

    private final void x() {
        ajwt ajwtVar = j;
        ajwtVar.j("Starting the service and binding to it.", new Object[0]);
        if (this.n != null) {
            ajwtVar.m("uuidForServiceCallbacksRegister is not null. The service resources might have not been freed correctly!", new Object[0]);
        }
        this.n = UUID.randomUUID().toString();
        Intent putExtra = s() ? D2dSourceChimeraService.a(this).putExtra("is_wifi_d2d", true) : D2dSourceChimeraService.a(this);
        startService(putExtra);
        aumo.a().d(this, putExtra, this.w, 1);
        this.p = true;
    }

    private final void y() {
        if (!fohd.a.lK().b()) {
            x();
            return;
        }
        HashSet hashSet = new HashSet();
        elgo elgoVar = Build.VERSION.SDK_INT >= 30 ? l : k;
        for (int i = 0; i < ((elpg) elgoVar).c; i++) {
            String str = (String) elgoVar.get(i);
            if (bzje.b(this, str) != 0) {
                hashSet.add(str);
            }
        }
        if (hashSet.isEmpty()) {
            j.d("All required permissions granted, proceeding.", new Object[0]);
            x();
        } else {
            j.d("%s permissions not granted, requesting permissions.", hashSet);
            ind.h(getContainerActivity(), (String[]) hashSet.toArray(new String[hashSet.size()]), 0);
        }
    }

    private final void z() {
        j.d("Unbinding service", new Object[0]);
        try {
            aumo.a().b(this, this.w);
        } catch (IllegalArgumentException | IllegalStateException e) {
            j.l(e);
        }
    }

    public final dg a(akik akikVar) {
        dg akwxVar;
        dg h = getSupportFragmentManager().h(akikVar.name());
        if (h != null) {
            j.j("%s already exists, reusing.", akikVar);
            return h;
        }
        switch (akikVar) {
            case CONNECTING_FRAGMENT:
                akwxVar = new akwx();
                break;
            case CONNECTED_FRAGMENT:
                akwxVar = new akww();
                w(akwxVar);
                break;
            case LOCKSCREEN_FRAGMENT:
                akwxVar = new akwv();
                break;
            case COPY_CONFIRMATION_FRAGMENT:
                akwxVar = new akxb();
                w(akwxVar);
                break;
            case WAITING_FRAGMENT:
                boolean s = s();
                akwxVar = new akxi();
                Bundle bundle = new Bundle();
                bundle.putBoolean("isWifiD2d", s);
                akwxVar.setArguments(bundle);
                w(akwxVar);
                break;
            case COPYING_FRAGMENT:
                boolean s2 = s();
                boolean y = fohv.a.lK().y();
                String str = this.o;
                akxc akxcVar = new akxc();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("isWifiD2d", s2);
                bundle2.putBoolean("shouldUseNewSubText", y);
                bundle2.putString("target_device_model", str);
                akxcVar.setArguments(bundle2);
                akwxVar = akxcVar;
                break;
            case SUCCESS_FRAGMENT:
                boolean s3 = s();
                akwxVar = new akxh();
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("isWifiD2d", s3);
                akwxVar.setArguments(bundle3);
                w(akwxVar);
                break;
            case DISCONNECTED_FRAGMENT:
                boolean s4 = s();
                akwxVar = new akxd();
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("isWifiD2d", s4);
                akwxVar.setArguments(bundle4);
                w(akwxVar);
                break;
            default:
                throw new RuntimeException("Unknown fragment tag.");
        }
        j.j("Created new %s", akikVar);
        return akwxVar;
    }

    public final void b() {
        n(new akil() { // from class: akih
            @Override // defpackage.akil
            public final void a() {
                D2dSourceChimeraActivity.this.m.e();
            }
        });
    }

    @Override // defpackage.akwr
    public final void c() {
        n(new akil() { // from class: akif
            @Override // defpackage.akil
            public final void a() {
                D2dSourceChimeraActivity.this.m.b();
            }
        });
        p();
    }

    @Override // defpackage.akxa
    public final void f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_transferring", false);
        akws akwsVar = new akws();
        akwsVar.setArguments(bundle);
        akwsVar.show(getSupportFragmentManager(), "DIALOG");
    }

    @Override // defpackage.akxa
    public final void g() {
        o(akik.WAITING_FRAGMENT);
        n(new akil() { // from class: akig
            @Override // defpackage.akil
            public final void a() {
                D2dSourceChimeraActivity.this.m.d();
            }
        });
    }

    @Override // defpackage.akwu
    public final void k() {
        j.f("The screen lock failed", new Object[0]);
    }

    @Override // defpackage.akwu
    public final void l() {
        if (this.m != null) {
            b();
        } else {
            j.j("onScreenUnlocked() was called before the service is bound,saving the unlocked state.", new Object[0]);
            this.q = true;
        }
    }

    @Override // defpackage.akxg
    public final void m() {
        p();
    }

    public final void n(akil akilVar) {
        try {
        } catch (RemoteException e) {
            j.g("Unexpected remote exception; aborting migration: ", e, new Object[0]);
        }
        if (this.m != null) {
            akilVar.a();
            return;
        }
        j.f("Unable to call method because boundServiceInterface is null. Raise a bug.", new Object[0]);
        j.f("Unable to call service; killing activity.", new Object[0]);
        p();
    }

    public final void o(akik akikVar) {
        this.r = akikVar;
        dg a = a(akikVar);
        if (a.isVisible()) {
            j.d(String.valueOf(String.valueOf(akikVar)).concat(" is already visible, reusing."), new Object[0]);
            return;
        }
        if (this.v) {
            j.m("Activity is paused; ignoring fragment change.", new Object[0]);
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.source_main_container, a, akikVar.name());
        bpVar.a();
        j.j("Changing the visible fragment to %s", akikVar);
    }

    @Override // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        int i2 = efwn.a;
        if (efrl.v(this) && efrl.z(this)) {
            j.d("Setting sucUsePartnerResource theme attribute to true.", new Object[0]);
            theme.applyStyle(R.style.BcStyleThemeOverlay, true);
        } else {
            j.d("Setting sucUsePartnerResource theme attribute to false.", new Object[0]);
            theme.applyStyle(R.style.HeavyThemeOverlay, true);
        }
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        int i = efwn.a;
        boolean v = efrl.v(this);
        efwo d = efwo.d();
        int i2 = d.a;
        String str = d.b;
        boolean z = d.c;
        setTheme(new efwo(efwn.b(this), v).c(getIntent().getStringExtra("theme"), !v));
        if (efrl.w(this)) {
            setTheme(efwn.a(this));
        }
        ajwt ajwtVar = j;
        ajwtVar.j("onCreate", new Object[0]);
        super.onCreate(bundle);
        v();
        if (B() && !fohv.d()) {
            ajwtVar.h("Launched for wifi d2d but feature is disabled by flag. Finishing.", new Object[0]);
            finish();
            return;
        }
        int i3 = iri.a;
        if (bzje.b(this, "android.permission.NFC") == 0) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
            if (defaultAdapter != null) {
                ajwtVar.d("Disabling NFC for d2d source device", new Object[0]);
                try {
                    carm.b(NfcAdapter.class, "setNdefPushMessage", defaultAdapter, new carl(NdefMessage.class, null), new carl(Activity.class, getContainerActivity()), new carl(Activity[].class, new Activity[0]));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    j.d("Unable to disable NFC for d2d source device ".concat(String.valueOf(e.toString())), new Object[0]);
                }
            }
        } else {
            ajwtVar.d("Unable to disable NFC for d2d source device because NFC permission is not granted.", new Object[0]);
        }
        setContentView(getLayoutInflater().inflate(R.layout.source_activity, (ViewGroup) null));
        focl foclVar = focl.a;
        if (!foclVar.lK().aa()) {
            setRequestedOrientation(1);
        }
        eftf.f(getWindow(), false);
        getWindow().addFlags(128);
        this.o = getString(R.string.source_default_target_device_name);
        if (bundle != null) {
            this.r = (akik) Enum.valueOf(akik.class, bundle.getString("current_fragment", akik.CONNECTED_FRAGMENT.name()));
            if (bundle.isEmpty()) {
                j.h("Activity is restored with an empty savedInstanceState bundle.", new Object[0]);
            }
        } else {
            this.r = s() ? akik.WAITING_FRAGMENT : akik.CONNECTED_FRAGMENT;
        }
        if (bundle != null) {
            j.j("Activity is restored with non empty saved instance state.", new Object[0]);
            this.s = (fkck) bundle.getSerializable("connection_type");
        } else if ((getIntent().getFlags() & 1048576) != 0) {
            j.j("Activity is launched from history, not starting the protocol.", new Object[0]);
            this.s = null;
        } else if (r()) {
            if (((Boolean) this.x.lK()).booleanValue()) {
                j.j("Activity is created via adb for e2e testing. Not Starting protocol yet.", new Object[0]);
                this.s = null;
            } else {
                j.h("Activity is created by attaching the cable.", new Object[0]);
                this.s = fkck.USB;
            }
        } else if (B()) {
            if (getIntent().getBooleanExtra("com.google.android.gms.backup.LAUNCHED_FROM_NOTIFICATION", false)) {
                j.h("Activity is created by wifi d2d intent from notification", new Object[0]);
            } else {
                j.h("Activity is created by wifi d2d intent.", new Object[0]);
            }
            this.s = fkck.WIFI;
        } else {
            j.h("Activity is launched by a general intent, not starting the protocol.", new Object[0]);
            this.s = null;
        }
        if (!foclVar.lK().aQ() || this.r == akik.SUCCESS_FRAGMENT) {
            return;
        }
        y();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        j.j("onDestroy", new Object[0]);
        super.onDestroy();
        q();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        j.j("onNewIntent. Action=%s", intent.getAction());
        q();
        super.onNewIntent(intent);
        setIntent(intent);
        v();
        if (B()) {
            this.s = fkck.WIFI;
        } else if (r()) {
            this.s = fkck.USB;
        }
        y();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        j.j("onPause", new Object[0]);
        this.v = true;
        super.onPause();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        j.j("onResume", new Object[0]);
        this.v = false;
        super.onResume();
        o(this.r);
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
        if (!focl.a.lK().W()) {
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
        return ((Boolean) this.x.lK()).booleanValue() && !Objects.equals(this.t, fkck.WIFI);
    }

    public final boolean s() {
        return !((Boolean) this.u.lK()).booleanValue() ? B() : this.t == fkck.WIFI;
    }

    @Override // defpackage.akwu
    public final void h() {
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
    }
}
