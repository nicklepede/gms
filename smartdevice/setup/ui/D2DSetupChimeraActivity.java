package com.google.android.gms.smartdevice.setup.ui;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.CompanionApp;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity;
import defpackage.Celse;
import defpackage.a;
import defpackage.arco;
import defpackage.arcy;
import defpackage.arjz;
import defpackage.arkc;
import defpackage.arut;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.arxo;
import defpackage.asmb;
import defpackage.asmf;
import defpackage.asqh;
import defpackage.bp;
import defpackage.bqna;
import defpackage.cq;
import defpackage.dcvh;
import defpackage.dcwh;
import defpackage.dcxh;
import defpackage.dcyb;
import defpackage.dcyg;
import defpackage.dcyl;
import defpackage.dcyy;
import defpackage.ddnt;
import defpackage.ddot;
import defpackage.ddpy;
import defpackage.ddqa;
import defpackage.ddqn;
import defpackage.ddqq;
import defpackage.ddtw;
import defpackage.defb;
import defpackage.dego;
import defpackage.degp;
import defpackage.degv;
import defpackage.degy;
import defpackage.degz;
import defpackage.dehb;
import defpackage.dehc;
import defpackage.deho;
import defpackage.dehz;
import defpackage.deic;
import defpackage.deig;
import defpackage.deih;
import defpackage.deiw;
import defpackage.deix;
import defpackage.deja;
import defpackage.dejb;
import defpackage.dejc;
import defpackage.dejd;
import defpackage.dejh;
import defpackage.deji;
import defpackage.dejj;
import defpackage.dekb;
import defpackage.dekc;
import defpackage.dekd;
import defpackage.dekl;
import defpackage.dekm;
import defpackage.dekq;
import defpackage.dekr;
import defpackage.dekv;
import defpackage.deld;
import defpackage.dele;
import defpackage.delx;
import defpackage.demq;
import defpackage.demr;
import defpackage.dems;
import defpackage.demu;
import defpackage.demx;
import defpackage.dene;
import defpackage.deno;
import defpackage.denp;
import defpackage.denq;
import defpackage.denr;
import defpackage.denu;
import defpackage.dfae;
import defpackage.dg;
import defpackage.eiig;
import defpackage.elqn;
import defpackage.elsj;
import defpackage.elso;
import defpackage.elsr;
import defpackage.elta;
import defpackage.ensj;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkhl;
import defpackage.fsct;
import defpackage.fsek;
import defpackage.fsfh;
import defpackage.fsge;
import defpackage.qex;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class D2DSetupChimeraActivity extends qex implements dekv, ddnt, degy, deiw, dehb, dekl, dekb, deho, deja, dejh, dekq, degp, deld {
    public static final arxo h = new denq(new String[]{"Setup", "UI", "D2DSetupChimeraActivity"});
    private static final ExecutorService n = new asmf(1, 9);
    private String A;
    private degv B;
    private String C;
    private deih D;
    private deno E;
    private boolean F;
    private boolean G;
    private ConnectionRequest H;
    SourceLogManager i;
    int j;
    public String l;
    public dehz m;
    private D2DDevice o;
    private int q;
    private boolean r;
    private ArrayList t;
    private boolean u;
    private boolean v;
    private bqna x;
    private int y;
    private String z;
    private dcxh p = dcxh.UNKNOWN;
    private Integer s = -99999;
    ArrayList k = new ArrayList();
    private boolean w = false;

    private final int J() {
        BootstrapOptions bootstrapOptions = this.m.ai;
        boolean z = bootstrapOptions != null && dems.a(bootstrapOptions);
        boolean z2 = (bootstrapOptions == null || ddtw.b(this, bootstrapOptions.u) == elqn.NONE) ? false : true;
        return z ? z2 ? R.string.copy_confirmation_description_3p : R.string.smartdevice_d2d_copy_3p_account_text : z2 ? R.string.copy_confirmation_description : R.string.smartdevice_d2d_copy_account_text;
    }

    private final int K() {
        return this.x.p("com.google").length;
    }

    private final cq M() {
        return deix.x(9, "", getString(R.string.smartdevice_alert_exit_setup_message), getString(R.string.smartdevice_alert_quit_button), getString(R.string.common_cancel), true);
    }

    private final dg N() {
        ddot ddotVar = new ddot();
        ddotVar.b = getString(R.string.smartdevice_d2d_copy_account_title);
        ddotVar.c = getString(J());
        ddotVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
        ddotVar.e(getString(R.string.smartdevice_action_copy), 1);
        ddotVar.f(getString(R.string.common_cancel), 4);
        return ddotVar.a();
    }

    private final dg O() {
        dejj dejjVar = new dejj();
        dejjVar.e(getString(R.string.smartdevice_d2d_copy_account_title));
        dejjVar.b(getString(J()));
        dejjVar.c(getString(R.string.smartdevice_action_copy));
        dejjVar.d(getString(R.string.common_cancel), 4);
        dejjVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
        return dejjVar.a();
    }

    private final BootstrapConfigurations P() {
        String str;
        String str2;
        String str3;
        String str4;
        dcyb dcybVar = new dcyb();
        dcybVar.c(2, this.F);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z = this.v;
        if (TextUtils.isEmpty(this.z)) {
            str = null;
            str2 = null;
            str3 = null;
        } else {
            String str5 = this.z;
            if (TextUtils.isEmpty(this.A)) {
                str4 = "Open";
                str2 = null;
            } else {
                str4 = "PSK";
                str2 = this.A;
            }
            str3 = str4;
            str = str5;
        }
        Account[] p = this.x.p("com.google");
        if (r().as() && p.length == 0) {
            h.o("BootstrapOptions require account but no accounts found on device.", new Object[0]);
            X();
            return null;
        }
        if (!r().au() || this.k.size() == 1) {
            if (this.k.isEmpty()) {
                dcwh.a(p, arrayList);
            } else {
                ArrayList arrayList2 = this.k;
                dcwh.a((Account[]) arrayList2.toArray(new Account[arrayList2.size()]), arrayList);
            }
            return new BootstrapConfigurations(str, str2, str3, z, arrayList, hashMap, dcybVar.a, dcybVar.b);
        }
        if (this.k.isEmpty()) {
            h.f("BootstrapOptions require a single account but for some reason no  was selected.", new Object[0]);
        } else if (this.k.size() > 1) {
            h.f("BootstrapOptions require a single account but multiple accounts selected.", new Object[0]);
        }
        X();
        return null;
    }

    private final void Q(cq cqVar) {
        if (isFinishing()) {
            return;
        }
        cqVar.show(gI(), "smartdevice.dialogfragment");
    }

    private final void R() {
        dcyy dcyyVar = this.m.c;
        if (dcyyVar != null) {
            dcyyVar.e();
        }
    }

    private final void S(dg dgVar, boolean z, boolean z2) {
        if (dgVar instanceof cq) {
            throw new IllegalArgumentException("DialogFragments cannot be added using this method. Did you mean to call 'addOnly(DialogFragment)'?");
        }
        demq.a(getContainerActivity(), dgVar.getArguments().getString("smartdevice.title"));
        if (isFinishing()) {
            return;
        }
        bp bpVar = new bp(gI());
        if (z) {
            bpVar.A(R.anim.slide_next_in, R.anim.slide_next_out, R.anim.slide_back_in, R.anim.slide_back_out);
        }
        if (this.s.intValue() != -99999) {
            this.t.add(this.s);
        }
        bpVar.F(R.id.fragment_container, dgVar);
        bpVar.w(null);
        int a = bpVar.a();
        if (z2) {
            this.s = Integer.valueOf(a);
        } else {
            this.s = -99999;
        }
    }

    private final void T(dg dgVar) {
        S(dgVar, gI().g(R.id.fragment_container) != null, false);
    }

    private final void U() {
        dg g = gI().g(R.id.fragment_container);
        if (g instanceof dekd) {
            H(((dekd) g).x(null));
        }
        if (this.H != null) {
            V(5, Bundle.EMPTY);
        } else {
            V(3, Bundle.EMPTY);
        }
    }

    private final void V(int i, Bundle bundle) {
        Intent putExtras = new Intent().putExtras(bundle);
        this.i.g(i);
        final SourceLogManager sourceLogManager = this.i;
        final long a = fsge.a.a().a();
        if (a > 0) {
            n.execute(new Runnable() { // from class: deib
                @Override // java.lang.Runnable
                public final void run() {
                    arxo arxoVar = D2DSetupChimeraActivity.h;
                    apta aptaVar = SourceLogManager.this.f;
                    if (aptaVar != null) {
                        aptaVar.e(a, TimeUnit.MILLISECONDS);
                    }
                }
            });
        }
        putExtras.putExtra("smartdevice.sourceLogManager", this.i);
        setResult(i, putExtras);
        this.G = true;
    }

    private final void W() {
        CompanionApp companionApp = r().h;
        if (companionApp == null) {
            ab(0);
            return;
        }
        String str = companionApp.e;
        String str2 = companionApp.c;
        if (TextUtils.isEmpty(str2)) {
            h.f("Cannot install companion app; package name is null or empty", new Object[0]);
            ab(0);
            return;
        }
        if (dene.c(str2, getPackageManager())) {
            h.h("No need to install companion app, it's already installed", new Object[0]);
            ab(2);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = getResources().getString(R.string.smartdevice_install_app_reason, companionApp.b, this.o.c);
        }
        String string = getString(R.string.smartdevice_install_app);
        arwm.s(str);
        degz degzVar = new degz();
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.message", str);
        bundle.putString("smartdevice.title", string);
        degzVar.setArguments(bundle);
        T(degzVar);
    }

    private final void X() {
        this.q = R.string.common_something_went_wrong;
        V(2, Bundle.EMPTY);
        finish();
    }

    private final void Y() {
        startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
    }

    private final void Z() {
        if (deji.z(this)) {
            h.j("Source device doesn't have a lock screen or is Fido flow.", new Object[0]);
            this.w = r().au() && this.p == dcxh.AUTO && fsct.d() && fsct.a.a().d();
            aa(r(), false);
            return;
        }
        if (!asqh.c() || fsfh.a.a().F()) {
            arxo arxoVar = dejb.a;
            FingerprintManager fingerprintManager = (FingerprintManager) getApplicationContext().getSystemService("fingerprint");
            if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
                h.j("Creating FingerprintFragment", new Object[0]);
                String string = getString(R.string.smartdevice_d2d_fingerprint_title);
                String string2 = getString(R.string.smartdevice_d2d_fingerprint_verification_text, new Object[]{r().g});
                dejb dejbVar = new dejb();
                Bundle bundle = new Bundle();
                bundle.putString("smartdevice.title", string);
                bundle.putString("smartdevice.message", string2);
                dejbVar.setArguments(bundle);
                T(dejbVar);
                return;
            }
        }
        if (this.p != dcxh.AUTO || !fsct.d()) {
            h.j("Creating copy confirmation/lockscreen page", new Object[0]);
            T(O());
            return;
        }
        dejd x = dejd.x();
        if (!isFinishing()) {
            bp bpVar = new bp(gI());
            bpVar.v(x, "smartdevice.headlessfragment");
            bpVar.a();
        }
        h.j("Added headless Lock Screen fragment", new Object[0]);
    }

    private final void aa(BootstrapOptions bootstrapOptions, boolean z) {
        arwm.t(bootstrapOptions, "bootstrapOptions cannot be null.");
        if (!bootstrapOptions.as() && K() == 0) {
            h.d("No accounts required and no accounts on device.", new Object[0]);
            ad();
            return;
        }
        if (!bootstrapOptions.au()) {
            if (!bootstrapOptions.at()) {
                h.f("Unsupported account requirements set in BootstrapOptions.", new Object[0]);
                X();
                return;
            } else if (this.w) {
                ad();
                return;
            } else {
                S(N(), !z, false);
                return;
            }
        }
        this.k.clear();
        if (this.p == dcxh.AUTO && K() == 0) {
            y();
            return;
        }
        boolean z2 = !z;
        String string = getString(R.string.common_choose_account_label);
        dcxh dcxhVar = this.p;
        dekd dekdVar = new dekd();
        Bundle bundle = new Bundle();
        bundle.putBoolean("smartdevice.accountRequired", true);
        bundle.putString("smartdevice.title", string);
        bundle.putBoolean("singleAccount", false);
        bundle.putString("device_type", dcxhVar.name());
        dekdVar.setArguments(bundle);
        S(dekdVar, z2, true);
    }

    private final void ab(int i) {
        SourceLogManager sourceLogManager = this.i;
        fecj v = elsr.a.v();
        fecj v2 = Celse.a.v();
        if (i != 0) {
            if (i == 1) {
                if (!v2.b.L()) {
                    v2.U();
                }
                Celse celse = (Celse) v2.b;
                celse.c = 3;
                celse.b |= 1;
            } else if (i == 2) {
                if (!v2.b.L()) {
                    v2.U();
                }
                Celse celse2 = (Celse) v2.b;
                celse2.c = 2;
                celse2.b |= 1;
            } else if (i != 3) {
                if (!v2.b.L()) {
                    v2.U();
                }
                Celse celse3 = (Celse) v2.b;
                celse3.c = 5;
                celse3.b |= 1;
            } else {
                if (!v2.b.L()) {
                    v2.U();
                }
                Celse celse4 = (Celse) v2.b;
                celse4.c = 4;
                celse4.b |= 1;
            }
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            elsr elsrVar = (elsr) fecpVar;
            elsrVar.d = 8;
            elsrVar.b |= 2;
            if (!fecpVar.L()) {
                v.U();
            }
            elsr elsrVar2 = (elsr) v.b;
            Celse celse5 = (Celse) v2.Q();
            celse5.getClass();
            elsrVar2.j = celse5;
            elsrVar2.b |= 1024;
            sourceLogManager.j(v);
        }
        ddot ddotVar = new ddot();
        ddotVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
        ddotVar.d(R.drawable.smartdevice_setup_success, false);
        ddotVar.b = getString(R.string.smartdevice_d2d_source_setup_success);
        if (i == 1) {
            ddotVar.e(getString(R.string.smartdevice_action_open_app), 3);
        } else if (i != 2) {
            if (this.p == dcxh.AUTO) {
                ddotVar.b = getString(R.string.smartdevice_d2d_source_setup_success_auto);
                ddotVar.a = 2131232977;
                ddotVar.c = getString(R.string.smartdevice_d2d_source_setup_success_description_auto);
            } else {
                ddotVar.c = getString(R.string.smartdevice_d2d_source_setup_continue_on_target, new Object[]{r().g});
            }
            ddotVar.e(getString(R.string.close_button_label), 2);
        } else {
            ddotVar.e(getString(R.string.smartdevice_action_open_app), 3);
            ddotVar.c = getString(R.string.smartdevice_companion_app_ready, new Object[]{r().h.b});
        }
        T(ddotVar.a());
    }

    private final void ac() {
        final BootstrapConfigurations P = P();
        if (P == null) {
            return;
        }
        dehz dehzVar = this.m;
        final dcyy dcyyVar = dehzVar.c;
        final D2DDevice d2DDevice = dehzVar.d;
        final dcyl dcylVar = dehzVar.ak;
        arcy arcyVar = new arcy();
        arcyVar.a = new arco() { // from class: ddiz
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                ddir ddirVar = (ddir) obj;
                ddjq ddjqVar = new ddjq((dfau) obj2);
                ddhc ddhcVar = new ddhc(new ddjo(dcyy.this, dcylVar));
                ddhm ddhmVar = (ddhm) ddirVar.H();
                ddih ddihVar = new ddih(ddjqVar);
                Context context = ddirVar.r;
                ddhmVar.d(ddihVar, d2DDevice, P, ddhcVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        arcyVar.d = 20713;
        dcyyVar.iT(arcyVar.a());
        this.j = 2;
    }

    private final void ad() {
        if (((UserManager) getSystemService("user")).getUserProfiles().size() <= 1) {
            ac();
            return;
        }
        boolean isEmpty = this.k.isEmpty();
        boolean b = r().p().b(5);
        if (!isEmpty || b) {
            ac();
        } else {
            h.d("Warning Android At Work profiles will not copy over", new Object[0]);
            Q(deix.x(10, getString(R.string.smartdevice_alert_work_profile_title), getString(R.string.smartdevice_alert_work_profile_message), getString(R.string.common_ok), null, false));
        }
    }

    private final void ae() {
        if (r().d) {
            S(dekm.D(getString(R.string.smartdevice_connect_to_wifi), false), gI().g(R.id.fragment_container) != null, true);
        } else {
            Z();
        }
    }

    private final cq af(String str) {
        return deix.x(4, TextUtils.isEmpty(null) ? getString(R.string.common_something_went_wrong) : null, str, getString(R.string.common_ok), null, false);
    }

    public static Intent n(ConnectionRequest connectionRequest, int i, SourceLogManager sourceLogManager, dcxh dcxhVar) {
        arwm.s(dcxhVar);
        Bundle bundle = new Bundle();
        bundle.putString("connectionRequest", arxd.d(connectionRequest));
        bundle.putInt("smartdevice.trigger", i);
        bundle.putParcelable("smartdevice.sourceLogManager", sourceLogManager);
        bundle.putString("device_type", dcxhVar.name());
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.setup.ui.D2DSetupActivity").putExtras(bundle);
    }

    public static Intent q(Context context, D2DDevice d2DDevice, int i, String str, SourceLogManager sourceLogManager) {
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.d2dDevice", arxd.d(d2DDevice));
        bundle.putInt("smartdevice.trigger", i);
        bundle.putString("smartdevice.pin", str);
        bundle.putParcelable("smartdevice.sourceLogManager", sourceLogManager);
        return new Intent().setClassName(context, "com.google.android.gms.smartdevice.setup.ui.D2DSetupActivity").putExtras(bundle);
    }

    @Override // defpackage.dejh
    public final void A() {
        h.d("suppressing setup incomplete toast", new Object[0]);
        this.r = true;
    }

    @Override // defpackage.dekq
    public final void B() {
        this.r = true;
        R();
        if (this.p == dcxh.AUTO) {
            V(0, Bundle.EMPTY);
        } else {
            V(3, Bundle.EMPTY);
        }
        finish();
    }

    @Override // defpackage.dekq
    public final void C() {
        if (fsct.d() && this.j == 1) {
            ae();
            return;
        }
        dcyy dcyyVar = this.m.c;
        arcy arcyVar = new arcy();
        arcyVar.a = new arco() { // from class: ddiy
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                ddir ddirVar = (ddir) obj;
                ddjq ddjqVar = new ddjq((dfau) obj2);
                ddhm ddhmVar = (ddhm) ddirVar.H();
                ddij ddijVar = new ddij(ddjqVar);
                Context context = ddirVar.r;
                ddhmVar.x(ddijVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        arcyVar.d = 20715;
        dcyyVar.iT(arcyVar.a());
    }

    @Override // defpackage.dejh
    public final void D() {
        this.w = true;
        this.i.b();
        this.v = true;
        aa(r(), true);
        overridePendingTransition(R.anim.slide_next_in, R.anim.slide_next_out);
    }

    @Override // defpackage.deja
    public final void E() {
        T(O());
    }

    @Override // defpackage.deja
    public final void F() {
        this.w = true;
        this.v = true;
        SourceLogManager sourceLogManager = this.i;
        fecj v = elsr.a.v();
        if (!v.b.L()) {
            v.U();
        }
        elsr elsrVar = (elsr) v.b;
        elsrVar.d = 14;
        elsrVar.b |= 2;
        sourceLogManager.j(v);
        aa(r(), false);
    }

    @Override // defpackage.dekb
    public final void H(dekc dekcVar) {
        this.i.f(dekcVar);
    }

    @Override // defpackage.deld
    public final void I(String str, String str2) {
        this.z = str;
        this.A = str2;
        P();
    }

    @Override // defpackage.dekl
    public final void L(delx delxVar, int i, int i2) {
        this.z = delxVar.a;
        this.A = delxVar.e;
        SourceLogManager sourceLogManager = this.i;
        int i3 = delxVar.d;
        fecj v = elsr.a.v();
        fecj v2 = elso.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        elso elsoVar = (elso) fecpVar;
        elsoVar.e = i - 1;
        elsoVar.b |= 4;
        switch (i3) {
            case 10:
                if (!fecpVar.L()) {
                    v2.U();
                }
                elso elsoVar2 = (elso) v2.b;
                elsoVar2.d = 3;
                elsoVar2.b |= 2;
                break;
            case 11:
                if (!fecpVar.L()) {
                    v2.U();
                }
                elso elsoVar3 = (elso) v2.b;
                elsoVar3.d = 2;
                elsoVar3.b |= 2;
                break;
            case 12:
                if (!fecpVar.L()) {
                    v2.U();
                }
                elso elsoVar4 = (elso) v2.b;
                elsoVar4.d = 1;
                elsoVar4.b |= 2;
                break;
            default:
                if (!fecpVar.L()) {
                    v2.U();
                }
                elso elsoVar5 = (elso) v2.b;
                elsoVar5.d = 0;
                elsoVar5.b |= 2;
                SourceLogManager.a.f(a.j(i3, "Unknown connection status: "), new Object[0]);
                break;
        }
        if (!v2.b.L()) {
            v2.U();
        }
        elso elsoVar6 = (elso) v2.b;
        elsoVar6.b = 1 | elsoVar6.b;
        elsoVar6.c = i2;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        elsr elsrVar = (elsr) fecpVar2;
        elsrVar.d = 4;
        elsrVar.b |= 2;
        if (!fecpVar2.L()) {
            v.U();
        }
        elsr elsrVar2 = (elsr) v.b;
        elso elsoVar7 = (elso) v2.Q();
        elsoVar7.getClass();
        elsrVar2.h = elsoVar7;
        elsrVar2.b |= 128;
        sourceLogManager.j(v);
        Z();
    }

    @Override // defpackage.degy
    public final void a(int i) {
        if (i != 1) {
            h.h("User chose not to install companion app, going to done state.", new Object[0]);
            ab(3);
            return;
        }
        if (r() == null) {
            h.f("Cannot install companion app; bootstrap options are null", new Object[0]);
            ab(0);
            return;
        }
        CompanionApp companionApp = r().h;
        if (companionApp == null) {
            h.f("Cannot install companion app; companion app is null", new Object[0]);
            ab(0);
            return;
        }
        String str = companionApp.c;
        if (TextUtils.isEmpty(str)) {
            h.f("Cannot install companion app; package name is null or empty", new Object[0]);
            ab(0);
            return;
        }
        h.h("Displaying companion app confirmation.", new Object[0]);
        eiig.a(!TextUtils.isEmpty(str));
        Bundle z = dejc.z(getResources().getString(R.string.smartdevice_setup_info_installing_app), null);
        z.putString("smartdevice.appPackage", str);
        dehc dehcVar = new dehc();
        dehcVar.setArguments(z);
        T(dehcVar);
        Intent intent = new Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        if (!TextUtils.isEmpty(null)) {
            intent.putExtra("authAccount", (String) null);
        }
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        intent.putExtra("full_docid", str);
        intent.putExtra("backend_docid", str);
        intent.putExtra("offer_type", 1);
        if (!arut.f(getPackageManager(), intent)) {
            intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format(Locale.US, "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", str, 1)));
            intent.setPackage("com.android.vending");
            intent.putExtra("use_direct_purchase", true);
        }
        startActivityForResult(intent, 7);
    }

    @Override // defpackage.dehb
    public final void b() {
        ab(4);
    }

    @Override // defpackage.ddnt
    public final void c(int i, Bundle bundle) {
        if (i == 1) {
            this.i.b();
            ad();
            return;
        }
        if (i == 2) {
            Y();
            finish();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException(a.j(i, "Unknown action "));
            }
            Q(M());
        } else {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(r().h.c);
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
            } else {
                h.f("Can't launch app, package manager says it's not installed", new Object[0]);
                Y();
            }
            finish();
        }
    }

    @Override // defpackage.dehb
    public final void d() {
        ab(1);
    }

    @Override // defpackage.deho
    public final void e() {
        this.j = 3;
        V(-1, Bundle.EMPTY);
        BootstrapOptions r = r();
        if (r == null) {
            return;
        }
        PostTransferAction postTransferAction = r.u;
        if (postTransferAction == null || !fsfh.a.a().N()) {
            W();
        } else {
            Intent a = ddtw.a(this, postTransferAction);
            if (a != null) {
                startActivity(a.addFlags(268435456));
                finish();
            } else {
                ab(0);
            }
        }
        int K = K();
        if ((r.au() || r.at()) && K > 0) {
            int i = ddqn.a;
            int c = dcvh.c();
            if (c == 0 || c == 1) {
                ddqn.a(this, K, r.g);
            }
        }
    }

    @Override // defpackage.deho
    public final void f() {
        this.j = 1;
        BootstrapOptions r = r();
        if (r.as() && this.p != dcxh.AUTO && this.x.p("com.google").length == 0) {
            l(7);
            return;
        }
        long j = r.l;
        if (j == -1 || j == 0) {
            j = denp.a();
        }
        SourceLogManager sourceLogManager = this.i;
        fecj v = elsr.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elsr elsrVar = (elsr) fecpVar;
        elsrVar.d = 17;
        elsrVar.b |= 2;
        if (!fecpVar.L()) {
            v.U();
        }
        elsr elsrVar2 = (elsr) v.b;
        elsrVar2.b |= 4096;
        elsrVar2.l = j;
        sourceLogManager.j(v);
        SourceLogManager sourceLogManager2 = this.i;
        synchronized (sourceLogManager2.d) {
            if (sourceLogManager2.c) {
                SourceLogManager.a.m("Attempted to set sessionId twice", new Object[0]);
            } else if (j == -1) {
                SourceLogManager.a.f("Attempted to set invalid sessionId", new Object[0]);
            } else {
                SourceLogManager.a.j(a.D(j, "Set session ID to : "), new Object[0]);
                sourceLogManager2.b = j;
                sourceLogManager2.c = true;
                sourceLogManager2.a();
            }
        }
        dcyb p = r.p();
        boolean z = !r.au() || K() == 1;
        byte b = r.f;
        int i = r.y;
        if (i == 0) {
            i = r.s;
        }
        boolean z2 = p.b(12) || (fsek.k() && b == 3 && ((long) i) >= fsek.c());
        this.u = z2;
        h.d(a.Z(z2, "Is fido flow: "), new Object[0]);
        if (z && this.F && !p.b(1)) {
            Q(demx.a(this, 12));
        } else {
            ae();
        }
    }

    @Override // defpackage.deho
    public final void g() {
        if (this.j == 3) {
            return;
        }
        this.j = 0;
        l(4);
    }

    @Override // defpackage.deho
    public final void h(String str) {
        if (this.p == dcxh.AUTO && fsct.f() && str.equals(getResources().getQuantityString(R.plurals.smartdevice_d2d_copying_accounts, 1))) {
            str = getString(R.string.common_login_activity_task_title);
        }
        T(dejc.A(str, null));
    }

    @Override // defpackage.deho
    public final void i(String str) {
        if (str == null) {
            h.f("PIN verification is no longer supported.", new Object[0]);
            X();
        } else {
            this.i.c();
            T(dekr.x(elta.b(this.o.h), str, true, true, this.p));
        }
    }

    @Override // defpackage.deho
    public final void j(VerificationInfo verificationInfo) {
        String str = verificationInfo.a;
        this.i.c();
        T(dekr.x(elta.b(verificationInfo.b), str, true, true, this.p));
    }

    @Override // defpackage.dejh
    public final void jD() {
        aa(r(), false);
    }

    @Override // defpackage.dejh
    public final void jE() {
        onBackPressed();
    }

    @Override // defpackage.deho
    public final void k(BootstrapProgressResult bootstrapProgressResult) {
        int i = bootstrapProgressResult.a;
        if (i != 1) {
            if (i != 6) {
                return;
            }
            arxo arxoVar = h;
            arxoVar.j("WIFI_AUTHENTICATION_FAILED", new Object[0]);
            arxoVar.f("Wifi Password was incorrect", new Object[0]);
            dele.x(this.z, true).show(gI(), "dialog");
            return;
        }
        SourceLogManager sourceLogManager = this.i;
        fecj v = elsr.a.v();
        if (!v.b.L()) {
            v.U();
        }
        elsr elsrVar = (elsr) v.b;
        elsrVar.d = 20;
        elsrVar.b |= 2;
        sourceLogManager.j(v);
        Bundle bundle = bootstrapProgressResult.b;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("accounts");
        boolean z = (this.p == dcxh.AUTO && fsct.a.a().b()) ? false : true;
        String string = (this.p == dcxh.AUTO && fsct.f()) ? getString(R.string.common_login_activity_task_title) : null;
        if (parcelableArrayList == null) {
            h.j("Has pending intent to delegate", new Object[0]);
            this.B.d(null, (PendingIntent) bundle.getParcelable("pendingIntent"));
        } else if (this.u) {
            T(dego.b(parcelableArrayList, null, string, null, R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24, true, true, false, null));
        } else {
            T(dego.b(parcelableArrayList, this.l, string, null, R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24, z, false, false, null));
        }
    }

    @Override // defpackage.deho
    public final void l(int i) {
        Bundle bundle = new Bundle();
        SourceLogManager sourceLogManager = this.i;
        fecj v = elsj.a.v();
        int i2 = -1;
        int i3 = i - 1;
        int i4 = 6;
        if (i3 == 1) {
            if (!v.b.L()) {
                v.U();
            }
            elsj elsjVar = (elsj) v.b;
            elsjVar.c = 8;
            elsjVar.b |= 1;
        } else if (i3 == 2) {
            if (!v.b.L()) {
                v.U();
            }
            elsj elsjVar2 = (elsj) v.b;
            elsjVar2.c = 3;
            elsjVar2.b |= 1;
        } else if (i3 == 3) {
            if (!v.b.L()) {
                v.U();
            }
            elsj elsjVar3 = (elsj) v.b;
            elsjVar3.c = 6;
            elsjVar3.b |= 1;
        } else if (i3 == 5) {
            if (!v.b.L()) {
                v.U();
            }
            elsj elsjVar4 = (elsj) v.b;
            elsjVar4.c = 2;
            elsjVar4.b |= 1;
        } else if (i3 != 6) {
            if (!v.b.L()) {
                v.U();
            }
            elsj elsjVar5 = (elsj) v.b;
            elsjVar5.c = 0;
            elsjVar5.b |= 1;
        } else {
            if (!v.b.L()) {
                v.U();
            }
            elsj elsjVar6 = (elsj) v.b;
            elsjVar6.c = 7;
            elsjVar6.b |= 1;
        }
        fecj v2 = elsr.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        elsr elsrVar = (elsr) v2.b;
        elsj elsjVar7 = (elsj) v.Q();
        elsjVar7.getClass();
        elsrVar.k = elsjVar7;
        elsrVar.b |= 2048;
        if (!v2.b.L()) {
            v2.U();
        }
        elsr elsrVar2 = (elsr) v2.b;
        elsrVar2.d = 12;
        elsrVar2.b |= 2;
        sourceLogManager.j(v2);
        if (i3 == 1) {
            i2 = 3;
            i4 = 3;
        } else if (i3 == 2) {
            i4 = 3;
            i2 = 1;
        } else if (i3 != 3) {
            if (i3 == 6) {
                String str = r() != null ? r().g : null;
                Q(deix.x(8, getString(R.string.smartdevice_alert_no_accounts_title), TextUtils.isEmpty(str) ? getString(R.string.smartdevice_alert_no_accounts_generic_text) : String.format(getString(R.string.smartdevice_alert_no_accounts_text), str.trim()), getString(R.string.common_ok), null, false));
                return;
            } else if (i3 != 7) {
                X();
                return;
            }
        } else if (this.H != null) {
            X();
            return;
        } else {
            i2 = 2;
            i4 = 3;
        }
        this.r = true;
        bundle.putInt("restart_code", i2);
        V(i4, bundle);
        finish();
    }

    @Override // defpackage.deho
    public final void m() {
        l(3);
    }

    @Override // defpackage.degp
    public final void o(int i) {
        R();
        X();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            this.B.e(i, i2);
            return;
        }
        if (i == 4) {
            dg g = gI().g(R.id.fragment_container);
            if (g == null || !(g instanceof dekm)) {
                return;
            }
            g.onActivityResult(i, i2, intent);
            return;
        }
        if (i == 7) {
            if (i2 == -1) {
                h.h("User approved companion app permissions, installing app.", new Object[0]);
                return;
            } else {
                h.h("User denied companion app permissions, or clicked back", new Object[0]);
                W();
                return;
            }
        }
        if (i != 9) {
            h.f(a.j(i, "Unknown request code: "), new Object[0]);
            return;
        }
        this.r = false;
        arxo arxoVar = h;
        arxoVar.h(a.j(i2, "RESULT CODE = "), new Object[0]);
        if (i2 == 0) {
            if (K() == 0) {
                finish();
                return;
            }
        } else if (i2 == -1) {
            Account account = null;
            if (intent != null) {
                String stringExtra = intent.getStringExtra("authAccount");
                int i3 = ddpy.a;
                Account[] p = demr.a(this).p("com.google");
                int length = p.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    Account account2 = p[i4];
                    if (account2.name.equals(stringExtra)) {
                        account = account2;
                        break;
                    }
                    i4++;
                }
            }
            if (account == null) {
                arxoVar.m("Couldn't find account", new Object[0]);
                s(R.string.common_something_went_wrong);
                return;
            }
            arxoVar.h("Account successfully added: %s", account.name);
            ddot ddotVar = new ddot();
            ddotVar.b = getString(R.string.smartdevice_d2d_adding_account);
            ddotVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
            ddotVar.e = true;
            T(ddotVar.a());
            defb defbVar = new defb(this);
            ensj.t(ensj.q(ensj.p(defbVar.a(account, "service_HOSTED"), defbVar.a(account, "service_usm")), fsct.b(), TimeUnit.MILLISECONDS, new asmb(1, 9)), new deig(this, account), new asmf(1, 9));
            return;
        }
        s(R.string.common_something_went_wrong);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        int i = this.j;
        if (i == 0) {
            U();
            R();
            finish();
        } else {
            if (i == 3) {
                finish();
                return;
            }
            if (i == 2 || this.t.isEmpty()) {
                Q(M());
                return;
            }
            this.s = (Integer) this.t.remove(r0.size() - 1);
            gI().S(this.s.intValue(), 0);
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        dcxh dcxhVar;
        Status status;
        super.onCreate(bundle);
        if (fkhl.c()) {
            arjz.a(this);
        }
        arkc.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        getWindow().addFlags(128);
        this.x = demr.a(this);
        Intent intent = getIntent();
        this.y = intent.getIntExtra("smartdevice.trigger", 0);
        if (intent.hasExtra("connectionRequest")) {
            this.H = (ConnectionRequest) arxd.c(intent.getStringExtra("connectionRequest"), ConnectionRequest.CREATOR);
            this.p = dcxh.a(intent.getStringExtra("device_type"));
        } else {
            D2DDevice d2DDevice = (D2DDevice) arxd.c(intent.getStringExtra("smartdevice.d2dDevice"), D2DDevice.CREATOR);
            arwm.t(d2DDevice, "D2D device cannot be null");
            this.o = d2DDevice;
            byte b = d2DDevice.e;
            dcxh[] values = dcxh.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dcxhVar = dcxh.UNKNOWN;
                    break;
                }
                dcxhVar = values[i];
                if (dcxhVar.i == b) {
                    break;
                } else {
                    i++;
                }
            }
            this.p = dcxhVar;
            this.C = intent.getStringExtra("smartdevice.pin");
        }
        deih deihVar = new deih(this);
        this.D = deihVar;
        deihVar.execute(new Void[0]);
        this.E = new deno(getApplicationContext());
        this.F = ddqq.b(this).b();
        ew gI = gI();
        dehz dehzVar = (dehz) gI.h("connectionless_connection_fragment");
        this.m = dehzVar;
        if (dehzVar == null) {
            this.m = new dehz();
            bp bpVar = new bp(gI);
            bpVar.v(this.m, "connectionless_connection_fragment");
            bpVar.a();
            if (this.H != null) {
                final dehz dehzVar2 = this.m;
                Context applicationContext = getApplicationContext();
                final ConnectionRequest connectionRequest = this.H;
                dehzVar2.c = new dcyy(applicationContext);
                dehzVar2.b.a(this);
                dehzVar2.c.e().x(new dfae() { // from class: dehg
                    @Override // defpackage.dfae
                    public final void hr(dfaq dfaqVar) {
                        final dehz dehzVar3 = dehz.this;
                        final ConnectionRequest connectionRequest2 = connectionRequest;
                        if (dfaqVar.m()) {
                            dehz.a.d("Disconnect from previous connection succeeded, waiting for Bluetooth cleanup", new Object[0]);
                            new asmb(1, 9).schedule(new Runnable() { // from class: dehh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dehz.a.j("Finished waiting, connecting", new Object[0]);
                                    final dehz dehzVar4 = dehz.this;
                                    dehzVar4.c.d(connectionRequest2, dehzVar4.aj).y(new dfah() { // from class: dehk
                                        @Override // defpackage.dfah
                                        public final void gm(Exception exc) {
                                            dehz.this.b.l(3);
                                        }
                                    });
                                }
                            }, fsdd.a.a().d(), TimeUnit.MILLISECONDS).hn(new Runnable() { // from class: dehi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dehz.a.j("Called connect", new Object[0]);
                                }
                            }, enre.a);
                        } else {
                            dehz.a.j("Disconnect failed, likely no connection in progress", new Object[0]);
                            dehzVar3.c.d(connectionRequest2, dehzVar3.aj).y(new dfah() { // from class: dehj
                                @Override // defpackage.dfah
                                public final void gm(Exception exc) {
                                    dehz.this.b.l(3);
                                }
                            });
                        }
                    }
                });
            } else {
                if (ddqq.c() == null) {
                    h.m("Bluetooth not available", new Object[0]);
                    status = new Status(10570);
                } else if (denr.a(this)) {
                    h.m("Cannot copy restricted profile", new Object[0]);
                    status = new Status(10569);
                } else {
                    status = Status.b;
                }
                if (status.e()) {
                    dehz dehzVar3 = this.m;
                    Context applicationContext2 = getApplicationContext();
                    D2DDevice d2DDevice2 = this.o;
                    int i2 = this.y;
                    String str = this.C;
                    dehzVar3.c = new dcyy(applicationContext2);
                    dehzVar3.d = d2DDevice2;
                    dehzVar3.ag = i2;
                    dehzVar3.ah = str;
                    dehzVar3.b.a(this);
                    if (dehzVar3.ag == 1) {
                        dehzVar3.c.i(dehzVar3.al);
                    } else {
                        dehzVar3.x();
                    }
                } else {
                    int i3 = status.i;
                    if (i3 == 10569) {
                        Q(af(getString(R.string.smartdevice_d2d_source_restricted_user_text)));
                    } else if (i3 != 10570) {
                        h.f("Source mode is unsupported. Reason: ".concat(dcyg.a(i3)), new Object[0]);
                    } else {
                        Q(af(getString(R.string.smartdevice_d2d_source_bluetooth_unavailable_text)));
                    }
                }
            }
        }
        this.B = new degv(this, new deic(this), bundle);
        Bundle bundle2 = bundle == null ? Bundle.EMPTY : bundle;
        this.v = bundle2.getBoolean("smartdevice.d2dSetupActivity.lockscreenUnlocked", false);
        this.z = bundle2.getString("smartdevice.d2dSetupActivity.wifiSsid", "");
        this.A = bundle2.getString("smartdevice.d2dSetupActivity.wifiPassword", null);
        this.j = bundle2.getInt("smartdevice.d2dSetupActivity.bootstrapState", 0);
        this.s = Integer.valueOf(bundle2.getInt("smartdevice.d2dSetupActivity.backStackFragmentId", -99999));
        ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList("smartdevice.d2dSetupActivity.backStackIds");
        if (integerArrayList == null) {
            integerArrayList = new ArrayList<>(0);
        }
        this.t = integerArrayList;
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("smartdevice.d2dSetupActivity.selectedAccounts");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList(0);
        }
        this.k = parcelableArrayList;
        if (bundle == null) {
            T(dejc.A(getString(R.string.common_connecting), this.p == dcxh.AUTO ? getString(R.string.smartdevice_setup_bluetooth_connecting_text_auto) : null));
            this.i = (SourceLogManager) intent.getParcelableExtra("smartdevice.sourceLogManager");
        } else {
            this.i = (SourceLogManager) bundle2.getParcelable("smartdevice.sourceLogManager");
        }
        SourceLogManager sourceLogManager = this.i;
        if (sourceLogManager != null) {
            sourceLogManager.e = this;
            return;
        }
        SourceLogManager sourceLogManager2 = new SourceLogManager(this);
        this.i = sourceLogManager2;
        sourceLogManager2.h(this.y, ddqa.a(this));
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        h.d("onDestroy", new Object[0]);
        this.D.cancel(true);
        if (!this.G) {
            this.i.g(4);
        }
        super.onDestroy();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        h.d("onPause", new Object[0]);
        this.E.a();
        this.B.a();
        super.onPause();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPostResume() {
        super.onPostResume();
        h.d("onPostResume", new Object[0]);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        h.d("onResume", new Object[0]);
        this.r = false;
        deno denoVar = this.E;
        denu.a();
        if (!denoVar.d) {
            denoVar.d = true;
            ContentResolver contentResolver = denoVar.b;
            int i = deno.a;
            denoVar.c = Settings.System.getInt(contentResolver, "screen_off_timeout", i);
            denoVar.b(i);
            denoVar.e = new demu(denoVar, Thread.getDefaultUncaughtExceptionHandler());
            Thread.setDefaultUncaughtExceptionHandler(denoVar.e);
        }
        this.B.b();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        h.d("onSaveInstanceState", new Object[0]);
        super.onSaveInstanceState(bundle);
        this.B.c(bundle);
        bundle.putBoolean("smartdevice.d2dSetupActivity.lockscreenUnlocked", this.v);
        bundle.putString("smartdevice.d2dSetupActivity.wifiSsid", this.z);
        bundle.putString("smartdevice.d2dSetupActivity.wifiPassword", this.A);
        bundle.putInt("smartdevice.d2dSetupActivity.bootstrapState", this.j);
        bundle.putInt("smartdevice.d2dSetupActivity.backStackFragmentId", this.s.intValue());
        bundle.putIntegerArrayList("smartdevice.d2dSetupActivity.backStackIds", this.t);
        bundle.putParcelable("smartdevice.sourceLogManager", this.i);
        bundle.putParcelableArrayList("smartdevice.d2dSetupActivity.selectedAccounts", this.k);
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        arxo arxoVar = h;
        arxoVar.d("onStop", new Object[0]);
        if (!isChangingConfigurations() && this.j != 3 && !this.r) {
            if (this.q > 0) {
                arxoVar.d("Displaying error toast", new Object[0]);
                Toast.makeText(this, this.q, 1).show();
            } else {
                arxoVar.d("Displaying setup incomplete toast", new Object[0]);
                Toast.makeText(this, R.string.smartdevice_alert_setup_incomplete, 1).show();
            }
        }
        super.onStop();
    }

    @Override // defpackage.degp
    public final void p(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (this.u) {
            bundle.putParcelableArrayList("accounts", arrayList);
            this.m.y(bundle);
            return;
        }
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle2 = (Bundle) arrayList.get(i);
            if (!TextUtils.isEmpty(bundle2.getString("sessionCheckpoint"))) {
                arrayList2.add(bundle2);
            }
        }
        bundle.putParcelableArrayList("accounts", arrayList2);
        this.m.y(bundle);
    }

    final BootstrapOptions r() {
        dehz dehzVar = this.m;
        if (dehzVar != null) {
            return dehzVar.ai;
        }
        throw new IllegalStateException("No bootstrap options available yet");
    }

    public final void s(int i) {
        Toast.makeText(this, i, 1).show();
        aa(r(), false);
    }

    public final void t(Account account) {
        dg g = gI().g(R.id.fragment_container);
        if (!(g instanceof dekd)) {
            w(new dekc(account, K(), 0, 0, false, true));
            return;
        }
        dekd dekdVar = (dekd) g;
        dekb dekbVar = dekdVar.b;
        if (dekbVar != null) {
            dekbVar.w(new dekc(account, dekdVar.c.size(), dekdVar.ag.size(), dekdVar.ah.size(), dekdVar.al, true));
        }
    }

    @Override // defpackage.deiw
    public final void u(int i, int i2) {
        if (i != 4) {
            if (i == 12) {
                V(2, Bundle.EMPTY);
                finish();
                return;
            }
            switch (i) {
                case 9:
                    if (i2 == 1) {
                        U();
                        R();
                        finish();
                        break;
                    }
                    break;
                case 10:
                    ac();
                    break;
            }
            return;
        }
        if (i2 == 3) {
            V(2, Bundle.EMPTY);
            finish();
        }
    }

    public final /* synthetic */ void v(AccountManagerFuture accountManagerFuture) {
        try {
            Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
            this.r = true;
            startActivityForResult(intent, 9);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            h.g("Failed to add account", e, new Object[0]);
        }
    }

    @Override // defpackage.dekb
    public final void w(dekc dekcVar) {
        Account account = dekcVar.a;
        if (account == null) {
            throw new IllegalStateException("onAccountSelected was called but account was null!");
        }
        h.d("Selected account: %s", account);
        if (r().au()) {
            this.k.clear();
        }
        this.k.add(account);
        this.i.f(dekcVar);
        if (this.w) {
            ad();
        } else {
            T(N());
        }
    }

    @Override // defpackage.dekb
    public final void y() {
        this.x.s("com.google", null, null, new AccountManagerCallback() { // from class: deia
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                D2DSetupChimeraActivity.this.v(accountManagerFuture);
            }
        }, null);
    }

    @Override // defpackage.dejh
    public final void z(int i) {
        if (i == 4) {
            c(4, null);
        } else {
            h.f("Unknown lock screen secondary action: %d", Integer.valueOf(i));
        }
    }

    @Override // defpackage.dekv
    public final void G(int i) {
    }

    @Override // defpackage.degp
    public final void x(String str) {
    }
}
