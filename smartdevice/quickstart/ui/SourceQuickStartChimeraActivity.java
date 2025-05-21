package com.google.android.gms.smartdevice.quickstart.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.quickstart.AccountSelectionData;
import com.google.android.gms.smartdevice.quickstart.SourceQuickStartChimeraService;
import com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartChimeraActivity;
import defpackage.abv;
import defpackage.aqto;
import defpackage.aqxo;
import defpackage.aqyd;
import defpackage.arkc;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.asiu;
import defpackage.asoe;
import defpackage.bp;
import defpackage.cq;
import defpackage.ddne;
import defpackage.ddnr;
import defpackage.ddnt;
import defpackage.ddot;
import defpackage.ddpk;
import defpackage.ddtw;
import defpackage.ddvb;
import defpackage.ddve;
import defpackage.ddvy;
import defpackage.ddwd;
import defpackage.ddzc;
import defpackage.ddzd;
import defpackage.deag;
import defpackage.deal;
import defpackage.deam;
import defpackage.deav;
import defpackage.debx;
import defpackage.deby;
import defpackage.decc;
import defpackage.degp;
import defpackage.degq;
import defpackage.degt;
import defpackage.degu;
import defpackage.deiw;
import defpackage.deix;
import defpackage.dekl;
import defpackage.dekm;
import defpackage.dekq;
import defpackage.delx;
import defpackage.demq;
import defpackage.demz;
import defpackage.denq;
import defpackage.denx;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dg;
import defpackage.edjy;
import defpackage.eiid;
import defpackage.eixf;
import defpackage.eloy;
import defpackage.elpa;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fsdd;
import defpackage.fsfn;
import defpackage.qex;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SourceQuickStartChimeraActivity extends qex implements ddnt, deiw, edjy, dekl, debx, dekq, ddpk, degp, degt {
    public static final denq h = new denq(new String[]{"SourceQuickStartChimeraActivity"});
    public ddve i;
    public ddvb j;
    public ddzc k;
    public eiid l;
    public int m;
    public PostTransferAction o;
    public VerificationInfo p;
    dekm s;
    private ServiceConnection u;
    private abv v;
    private elpa w;
    private denx x;
    private WifiManager y;
    private aqxo z;
    public String n = null;
    public boolean q = false;
    public int r = 0;
    public int t = 101;

    private final dg M(boolean z, boolean z2, boolean z3) {
        deal dealVar = new deal();
        dealVar.d = z;
        dealVar.e = z2;
        dealVar.f = z3;
        dealVar.g = this.r;
        dealVar.d(getString(R.string.common_continue), 6004);
        dealVar.e(getString(R.string.quick_start_permissions_secondary_button), 6005);
        return dealVar.f();
    }

    private final dg N(boolean z) {
        if (!z) {
            ddot ddotVar = new ddot();
            ddotVar.b = getString(R.string.smartdevice_quick_start_continue_on_new_device);
            ddotVar.c = getString(R.string.smartdevice_quick_start_continue_on_new_device_description);
            ddotVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
            return ddotVar.a();
        }
        if (!J()) {
            ddnr ddnrVar = new ddnr(null);
            ddnrVar.b = getString(R.string.common_connecting);
            ddnrVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
            ddnrVar.c = getString(R.string.smartdevice_atv_transition_description);
            return ddnrVar.b();
        }
        ddot ddotVar2 = new ddot();
        ddotVar2.b = getString(R.string.common_connecting);
        ddotVar2.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
        ddotVar2.e = true;
        ddotVar2.c = getString(R.string.smartdevice_atv_transition_description);
        return ddotVar2.a();
    }

    private final void O() {
        h.d("disconnect()", new Object[0]);
        try {
            this.i.e();
        } catch (RemoteException e) {
            h.g("Failed to disconnect", e, new Object[0]);
        }
    }

    private final void P(int i, AccountSelectionData accountSelectionData) {
        try {
            h.h("Account selection result: %d", Integer.valueOf(i));
            this.i.f(i, accountSelectionData);
        } catch (RemoteException e) {
            h.g("Failed to send account selection results", e, new Object[0]);
            G();
        }
    }

    static int k(Uri uri) {
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter("t")) == null) {
            return 0;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException e) {
            h.l(e);
            return 0;
        }
    }

    @Override // defpackage.degt
    public final void A(List list) {
        try {
            ddve ddveVar = this.i;
            ddwd ddwdVar = new ddwd();
            ddwdVar.a = 10;
            ddwdVar.b(list);
            ddveVar.r(ddwdVar.a());
            if (fsfn.r() && list.isEmpty()) {
                h.d("User skipped fallback challenge, closing activity", new Object[0]);
                this.k.g(10905, null);
                finishAndRemoveTask();
            }
        } catch (RemoteException e) {
            h.g("Failed to send fallback challenge results", e, new Object[0]);
            G();
        }
    }

    @Override // defpackage.dekq
    public final void B() {
        this.k.e(eloy.PIN_NOT_MATCH);
        v();
    }

    @Override // defpackage.dekq
    public final void C() {
        try {
            this.i.d();
        } catch (RemoteException e) {
            h.l(e);
        }
    }

    @Override // defpackage.debx
    public final void D(int i) {
        if (i == 0) {
            this.k.e(eloy.USER_VERIFIED);
        } else if (i == 2) {
            this.k.e(eloy.USER_VERIFICATION_UNAVAILABLE);
        } else {
            this.k.e(eloy.USER_VERIFICATION_SKIPPED);
        }
        if (this.t == 203) {
            this.t = 202;
        } else {
            this.t = 200;
        }
        try {
            this.i.h(i);
            if (i == 1 && this.t == 200) {
                v();
            }
            if (this.r != 3) {
                F(N(false));
            }
        } catch (RemoteException e) {
            G();
            h.l(e);
        }
    }

    public final void E() {
        this.t = 103;
        F(l(103));
    }

    public final void F(dg dgVar) {
        bp bpVar = new bp(gI());
        if (!demq.b(this)) {
            if (dgVar instanceof deag) {
                bpVar.G(android.R.anim.fade_in, android.R.anim.fade_out);
            } else {
                bpVar.A(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
            }
        }
        bpVar.F(R.id.fragment_container, dgVar);
        bpVar.b();
    }

    public final void G() {
        cq x = deix.x(1, getString(R.string.common_something_went_wrong), getString(R.string.smartdevice_connection_error), getString(R.string.common_ok), null, false);
        bp bpVar = new bp(gI());
        bpVar.v(x, "smartdevice.dialogfragment");
        bpVar.b();
        if (fsfn.a.a().V()) {
            this.k.e(eloy.SOMETHING_WENT_WRONG);
        }
    }

    public final void H() {
        if (!deby.z(this)) {
            D(2);
            return;
        }
        try {
            this.i.g();
        } catch (RemoteException e) {
            h.n("Failed to send await user verification message", e, new Object[0]);
        }
        this.k.e(eloy.SHOW_USER_VERIFICATION_PROMPT);
        ddnr ddnrVar = new ddnr(null);
        ddnrVar.b = getString(R.string.smartdevice_user_verification_loading_title);
        ddnrVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
        F(ddnrVar.c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if ((r3 / defpackage.fsfn.f()) >= (r2.f / defpackage.fsfn.f())) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(com.google.android.gms.smartdevice.d2d.BootstrapOptions r10) {
        /*
            r9 = this;
            denq r0 = com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartChimeraActivity.h
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "startPostTransferAction()"
            r0.h(r3, r2)
            com.google.android.gms.smartdevice.d2d.PostTransferAction r2 = r10.u
            r9.o = r2
            if (r2 == 0) goto Lba
            java.lang.String r3 = r2.e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lb6
            java.lang.String r3 = r2.e
            defpackage.arwm.s(r3)
            long r4 = r2.f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r3
            r3 = 1
            r5[r3] = r4
            java.lang.String r4 = "Target package version of %s is %d"
            r0.d(r4, r5)
            android.content.pm.PackageManager r4 = r9.getPackageManager()
            java.lang.String r5 = r2.e
            defpackage.arwm.s(r5)
            boolean r5 = defpackage.dene.c(r5, r4)
            if (r5 != 0) goto L4f
            long r4 = r2.f
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r10
            java.lang.String r10 = "%s is not installed on source"
            r0.d(r10, r3)
            goto L70
        L4f:
            java.lang.String r3 = r2.e
            defpackage.arwm.s(r3)
            long r3 = defpackage.dene.a(r3, r4)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "%s is installed with version %d, target version is %d"
            r0.d(r6, r5)
            long r5 = defpackage.fsfn.f()
            long r3 = r3 / r5
            long r5 = r2.f
            long r7 = defpackage.fsfn.f()
            long r5 = r5 / r7
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L70
            goto Lb6
        L70:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r3 = "Launching OEM app install activity"
            r0.h(r3, r10)
            ddzc r10 = r9.k     // Catch: java.lang.IllegalStateException -> La8
            r0 = 3
            r10.n(r0)     // Catch: java.lang.IllegalStateException -> La8
            abv r10 = r9.v     // Catch: java.lang.IllegalStateException -> La8
            java.lang.String r0 = r2.e     // Catch: java.lang.IllegalStateException -> La8
            defpackage.arwm.s(r0)     // Catch: java.lang.IllegalStateException -> La8
            r2 = 2132089858(0x7f151c02, float:1.982004E38)
            java.lang.String r2 = r9.getString(r2)     // Catch: java.lang.IllegalStateException -> La8
            java.lang.String r3 = "Package display name cannot be null"
            defpackage.arwm.t(r2, r3)     // Catch: java.lang.IllegalStateException -> La8
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.IllegalStateException -> La8
            r3.<init>()     // Catch: java.lang.IllegalStateException -> La8
            java.lang.String r4 = "com.google.android.gms.quickstart.oem.OemAppInstallActivity"
            r3.setClassName(r9, r4)     // Catch: java.lang.IllegalStateException -> La8
            java.lang.String r4 = "package-name"
            r3.putExtra(r4, r0)     // Catch: java.lang.IllegalStateException -> La8
            java.lang.String r0 = "display-package-name"
            r3.putExtra(r0, r2)     // Catch: java.lang.IllegalStateException -> La8
            r10.b(r3)     // Catch: java.lang.IllegalStateException -> La8
            return
        La8:
            r10 = move-exception
            denq r0 = com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartChimeraActivity.h
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed to launch OEM App Installer."
            r0.n(r2, r10, r1)
            com.google.android.gms.smartdevice.quickstart.SourceQuickStartChimeraService.e(r9)
            return
        Lb6:
            r9.y(r2)
            goto Lc1
        Lba:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Post transfer action is null"
            r0.m(r3, r2)
        Lc1:
            dcyb r10 = r10.p()
            r2 = 19
            boolean r10 = r10.b(r2)
            if (r10 == 0) goto Ld8
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "Keep the connection with multiplex, finish activity only."
            r0.d(r1, r10)
            r9.finishAndRemoveTask()
            return
        Ld8:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "Finishes both activity and service."
            r0.d(r1, r10)
            r9.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartChimeraActivity.I(com.google.android.gms.smartdevice.d2d.BootstrapOptions):void");
    }

    public final boolean J() {
        return fsdd.g() && asoe.l(this) && arkc.k(this);
    }

    public final boolean K() {
        return this.t >= 200;
    }

    @Override // defpackage.dekl
    public final void L(delx delxVar, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("wifi_ssid", delxVar.a);
        bundle.putString("wifi_pre_shared_key", delxVar.e);
        bundle.putString("wifi_security_type", delxVar.c);
        bundle.putBoolean("wifi_hidden_ssid", false);
        try {
            this.i.m(bundle);
        } catch (RemoteException e) {
            h.g("Failed to send WiFi selection results", e, new Object[0]);
            G();
        }
    }

    @Override // defpackage.ddnt
    public final void c(int i, Bundle bundle) {
        switch (i) {
            case 6000:
                demz.b(this.z, new dfak() { // from class: deat
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        SourceQuickStartChimeraActivity.h.d("location is enabled", new Object[0]);
                    }
                }, new dfah() { // from class: deau
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        SourceQuickStartChimeraActivity.this.w(exc);
                    }
                });
                break;
            case 6001:
                this.k.e(eloy.LOCATION_PROMPT_DENIED);
                h.j("Location permission denied on Pre S device, finishing activity", new Object[0]);
                v();
                break;
            case 6002:
                h.d("Update required, user chose to update GmsCore", new Object[0]);
                this.k.l(2);
                arxo arxoVar = ddvy.a;
                Intent k = aqto.a.k(this, 2, null);
                arwm.s(k);
                startActivity(k);
                finishAndRemoveTask();
                break;
            case 6003:
                h.d("Update required, but user chose to cancel", new Object[0]);
                this.k.l(3);
                finishAndRemoveTask();
                break;
            case 6004:
                this.t = 101;
                this.k.e(eloy.PERMISSIONS_PROMPT_CONFIRMED);
                F(N(this.l.h()));
                n();
                break;
            case 6005:
                this.k.e(eloy.PERMISSIONS_PROMPT_DENIED);
                v();
                break;
            case 6006:
                try {
                    this.i.p();
                    break;
                } catch (RemoteException e) {
                    h.g("Failed to retry WiFi", e, new Object[0]);
                    G();
                    return;
                }
        }
    }

    @Override // defpackage.edjy
    public final void gs() {
        onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dg l(int r11) {
        /*
            r10 = this;
            r0 = 301(0x12d, float:4.22E-43)
            if (r11 == r0) goto Lbe
            r0 = 302(0x12e, float:4.23E-43)
            if (r11 == r0) goto Lbe
            r0 = 1
            switch(r11) {
                case 100: goto L85;
                case 101: goto L7a;
                case 102: goto L7a;
                case 103: goto L5d;
                case 104: goto Lbe;
                case 105: goto L44;
                case 106: goto L36;
                case 107: goto L1b;
                default: goto Lc;
            }
        Lc:
            switch(r11) {
                case 200: goto Lbe;
                case 201: goto Lbe;
                case 202: goto Lbe;
                case 203: goto L44;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unexpected state "
            java.lang.String r11 = defpackage.a.j(r11, r1)
            r0.<init>(r11)
            throw r0
        L1b:
            boolean r11 = defpackage.demz.a(r10)
            r11 = r11 ^ r0
            denx r1 = r10.x
            defpackage.arwm.s(r1)
            boolean r1 = r1.d()
            r1 = r1 ^ r0
            android.net.wifi.WifiManager r2 = r10.y
            boolean r2 = r2.isWifiEnabled()
            r0 = r0 ^ r2
            dg r11 = r10.M(r11, r1, r0)
            return r11
        L36:
            r11 = 2132091268(0x7f152184, float:1.98229E38)
            java.lang.String r11 = r10.getString(r11)
            dekm r11 = defpackage.dekm.D(r11, r0)
            r10.s = r11
            return r11
        L44:
            ddnr r11 = new ddnr
            r0 = 0
            r11.<init>(r0)
            r0 = 2132091414(0x7f152216, float:1.9823196E38)
            java.lang.String r0 = r10.getString(r0)
            r11.b = r0
            r0 = 2131232963(0x7f0808c3, float:1.808205E38)
            r11.a = r0
            deby r11 = r11.c()
            return r11
        L5d:
            com.google.android.gms.smartdevice.d2d.VerificationInfo r11 = r10.p
            int r0 = r11.b
            elta r1 = defpackage.elta.b(r0)
            java.lang.String r2 = r11.a
            r8 = 2132091370(0x7f1521ea, float:1.9823106E38)
            dcxh r9 = defpackage.dcxh.PHONE
            r3 = 1
            r4 = 1
            r5 = 2132091372(0x7f1521ec, float:1.982311E38)
            r7 = 2132091371(0x7f1521eb, float:1.9823108E38)
            r6 = r5
            dekr r11 = defpackage.dekr.z(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L7a:
            eiid r11 = r10.l
            boolean r11 = r11.h()
            dg r11 = r10.N(r11)
            return r11
        L85:
            ddot r11 = new ddot
            r11.<init>()
            r0 = 2131231941(0x7f0804c5, float:1.8079977E38)
            r11.a = r0
            r0 = 2132091365(0x7f1521e5, float:1.9823096E38)
            java.lang.String r0 = r10.getString(r0)
            r11.b = r0
            r0 = 2132091364(0x7f1521e4, float:1.9823094E38)
            java.lang.String r0 = r10.getString(r0)
            r11.c = r0
            r0 = 2132084623(0x7f15078f, float:1.9809422E38)
            java.lang.String r0 = r10.getString(r0)
            r1 = 6000(0x1770, float:8.408E-42)
            r11.e(r0, r1)
            r0 = 2132089753(0x7f151b99, float:1.9819827E38)
            java.lang.String r0 = r10.getString(r0)
            r1 = 6001(0x1771, float:8.409E-42)
            r11.f(r0, r1)
            ddou r11 = r11.a()
            return r11
        Lbe:
            r11 = 0
            dg r11 = r10.N(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartChimeraActivity.l(int):dg");
    }

    public final String m() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_NAME");
            if (!TextUtils.isEmpty(stringExtra)) {
                return stringExtra;
            }
        }
        return decc.c(this, this.r);
    }

    protected final void n() {
        h.d("bindToServiceAndConnect()", new Object[0]);
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.smartdevice.quickstart.SourceQuickStartService");
        startService(intent);
        this.u = new deav(this);
        asiu.a().d(this, intent, this.u, 1);
    }

    @Override // defpackage.degp
    public final void o(int i) {
        this.k.g(10599, null);
        try {
            try {
                if (fsfn.w()) {
                    ddve ddveVar = this.i;
                    ddwd ddwdVar = new ddwd();
                    ddwdVar.a = 11;
                    ddwdVar.d = 10599;
                    ddveVar.r(ddwdVar.a());
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("source_error", 10599);
                    this.i.q(bundle);
                }
            } catch (RemoteException e) {
                h.g("Failed to send fallback challenge error", e, new Object[0]);
            }
        } finally {
            G();
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        denq denqVar = h;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        denqVar.d("onActivityResult requestCode: %d, resultCode: %d", valueOf, valueOf2);
        super.onActivityResult(i, i2, intent);
        if (i == 4) {
            dg g = gI().g(R.id.fragment_container);
            if (g instanceof deam) {
                g.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        if (i != 12) {
            return;
        }
        if (i2 == -1) {
            if (intent == null) {
                denqVar.f("QR code scanner returned OK but is missing data", new Object[0]);
                O();
                return;
            }
            String stringExtra = intent.getStringExtra("qr-code-contents");
            if (stringExtra == null) {
                denqVar.f("QR code result is missing key '%s'", "qr-code-contents");
                O();
                return;
            }
            denqVar.d("Scanned QR contents: ".concat(stringExtra), new Object[0]);
            String queryParameter = Uri.parse(stringExtra).getQueryParameter("key");
            if (queryParameter == null) {
                denqVar.f("QR code is missing parameter '%s'", "key");
                O();
                return;
            }
            try {
                this.i.c(queryParameter);
                return;
            } catch (RemoteException e) {
                h.g("Failed to continue out-of-band", e, new Object[0]);
                O();
                return;
            }
        }
        if (i2 == 0) {
            denqVar.h("QR code scanner was cancelled by system", new Object[0]);
            v();
            return;
        }
        if (i2 == 5001) {
            denqVar.d("User cancelled QR code scanner, exiting...", new Object[0]);
            this.k.e(eloy.CANCEL_QR_SCANNER);
            v();
            return;
        }
        if (i2 == 5003) {
            denqVar.d("User triggered pin fallback", new Object[0]);
            this.k.e(eloy.PIN_FALLBACK_TRIGGERED);
            try {
                this.i.n();
                E();
                return;
            } catch (RemoteException e2) {
                h.g("Failed to accept pending connection", e2, new Object[0]);
                return;
            }
        }
        denqVar.f("QR code scanner errored with code: %d", valueOf2);
        ddzc ddzcVar = this.k;
        fecj v = ddne.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ddne ddneVar = (ddne) fecpVar;
        ddneVar.c = 4;
        ddneVar.b = 1 | ddneVar.b;
        if (!fecpVar.L()) {
            v.U();
        }
        ddne ddneVar2 = (ddne) v.b;
        ddneVar2.b |= 2;
        ddneVar2.d = i2;
        ddzcVar.g(10802, (ddne) v.Q());
        O();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        denq denqVar = h;
        denqVar.m("onBackPressed", new Object[0]);
        if (K()) {
            denqVar.m("Closing activity in state: %s", Integer.valueOf(this.t));
            moveTaskToBack(true);
        } else if (this.t == 101) {
            v();
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        denq denqVar = h;
        denqVar.d("onConfigurationChange()", new Object[0]);
        int i = this.t;
        if (i != 102 && i != 105 && i != 203 && i != 204 && i != 205) {
            dg l = l(i);
            bp bpVar = new bp(gI());
            bpVar.F(R.id.fragment_container, l);
            bpVar.b();
        }
        dg g = gI().g(R.id.fragment_container);
        if (fsfn.w()) {
            if (g instanceof degu) {
                denqVar.d("AccountChallengeFragmentV2 is visible - reloading", new Object[0]);
                ((degu) g).x();
                return;
            }
            return;
        }
        if (g instanceof degq) {
            denqVar.d("AccountChallengeFragment is visible - reloading", new Object[0]);
            ((degq) g).y();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x034e  */
    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        h.d("onDestroy() at state: %d", Integer.valueOf(this.t));
        int i = this.t;
        if (i == 105 || i == 203) {
            D(1);
        }
        long hashCode = UUID.randomUUID().hashCode();
        ddve ddveVar = this.i;
        if (ddveVar != null) {
            try {
                ddveVar.s(hashCode);
            } catch (RemoteException e) {
                h.l(e);
            }
            int i2 = this.r;
            if (i2 == 3 || i2 == 7 || !K()) {
                SourceQuickStartChimeraService.e(this);
            }
        }
        if (this.u != null) {
            h.d("Unbinding Service", new Object[0]);
            try {
                asiu.a().b(this, this.u);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                h.l(e2);
            }
        }
        this.k.d(hashCode);
        this.k.c();
        ddzd.e();
        super.onDestroy();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        h.d("onSaveInstanceState state: %d", Integer.valueOf(this.t));
        bundle.putInt("state", this.t);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.degp
    public final void p(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accounts", arrayList);
        try {
            this.i.q(bundle);
            if (fsfn.r() && arrayList.isEmpty()) {
                h.d("User skipped fallback challenge, closing activity", new Object[0]);
                this.k.g(10905, null);
                finishAndRemoveTask();
            }
        } catch (RemoteException e) {
            h.g("Failed to send fallback challenge results", e, new Object[0]);
            G();
        }
    }

    @Override // defpackage.ddpk
    public final void q() {
        P(2, null);
    }

    @Override // defpackage.ddpk
    public final void r(int i, Bundle bundle) {
        if (i != 1) {
            return;
        }
        P(3, null);
    }

    @Override // defpackage.ddpk
    public final void s() {
        P(1, null);
    }

    @Override // defpackage.ddpk
    public final void t(ArrayList arrayList) {
        P(0, new AccountSelectionData(arrayList));
    }

    @Override // defpackage.deiw
    public final void u(int i, int i2) {
        delx delxVar;
        if (i == 1) {
            v();
            return;
        }
        if (i != 2) {
            return;
        }
        dekm dekmVar = this.s;
        arwm.s(dekmVar);
        if (!dekmVar.ag || (delxVar = dekmVar.ah) == null) {
            return;
        }
        dekmVar.b.c(delxVar.a);
        delx delxVar2 = dekmVar.ah;
        delxVar2.d = 10;
        dekmVar.b.b(delxVar2);
        dekmVar.b.notifyDataSetChanged();
    }

    public final void v() {
        SourceQuickStartChimeraService.e(this);
        finishAndRemoveTask();
    }

    public final void w(Exception exc) {
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

    public final void y(PostTransferAction postTransferAction) {
        Intent a = ddtw.a(this, postTransferAction);
        if (a == null) {
            h.f("Post transfer intent resolved to null", new Object[0]);
            return;
        }
        if (Objects.equals(a.getAction(), "com.google.android.gms.quickstart.LANDING_SCREEN")) {
            a.putExtra("quickstart.intent.extra.DEVICE_NAME", m());
        }
        this.k.n(5);
        startActivity(a.addFlags(268435456));
    }

    public final void z() {
        try {
            this.t = 102;
            ArrayList<String> b = eixf.b(eixf.d(fsfn.l()));
            boolean z = fsfn.o() && this.p.c;
            String string = getString(R.string.smartdevice_quick_start_qr_code_scanner_title, new Object[]{m()});
            arwm.r(string, "Title cannot be empty or null!");
            this.k.e(eloy.LAUNCH_QR_SCANNER);
            Intent intent = new Intent();
            intent.setClassName(this, "com.google.android.gms.quickstart.qr.QrCodeScannerActivity");
            intent.putStringArrayListExtra("url-prefixes", b);
            if (string != null) {
                intent.putExtra("scanner-title", string);
            }
            intent.putExtra("pin-fallback-supported", z);
            startActivityForResult(intent, 12);
        } catch (ActivityNotFoundException e) {
            h.g("QR code scanner activity not found", e, new Object[0]);
            O();
        }
    }

    @Override // defpackage.edjy
    public final void jw() {
    }

    @Override // defpackage.degp
    public final void x(String str) {
    }
}
