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
import defpackage.a;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.atmo;
import defpackage.atmr;
import defpackage.atxi;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.auad;
import defpackage.aupv;
import defpackage.aupz;
import defpackage.auub;
import defpackage.bp;
import defpackage.bsup;
import defpackage.cq;
import defpackage.dfgm;
import defpackage.dfhm;
import defpackage.dfim;
import defpackage.dfjg;
import defpackage.dfjl;
import defpackage.dfjq;
import defpackage.dfkd;
import defpackage.dfyy;
import defpackage.dfzy;
import defpackage.dg;
import defpackage.dgbd;
import defpackage.dgbf;
import defpackage.dgbs;
import defpackage.dgbv;
import defpackage.dgfb;
import defpackage.dgqe;
import defpackage.dgrr;
import defpackage.dgrs;
import defpackage.dgry;
import defpackage.dgsb;
import defpackage.dgsc;
import defpackage.dgse;
import defpackage.dgsf;
import defpackage.dgsr;
import defpackage.dgtc;
import defpackage.dgtf;
import defpackage.dgtj;
import defpackage.dgtk;
import defpackage.dgtz;
import defpackage.dgua;
import defpackage.dgud;
import defpackage.dgue;
import defpackage.dguf;
import defpackage.dgug;
import defpackage.dguk;
import defpackage.dgul;
import defpackage.dgum;
import defpackage.dgve;
import defpackage.dgvf;
import defpackage.dgvg;
import defpackage.dgvo;
import defpackage.dgvp;
import defpackage.dgvt;
import defpackage.dgvu;
import defpackage.dgvy;
import defpackage.dgwg;
import defpackage.dgwh;
import defpackage.dgxa;
import defpackage.dgxt;
import defpackage.dgxu;
import defpackage.dgxv;
import defpackage.dgxx;
import defpackage.dgya;
import defpackage.dgyh;
import defpackage.dgyr;
import defpackage.dgys;
import defpackage.dgyt;
import defpackage.dgyu;
import defpackage.dgyx;
import defpackage.dhlk;
import defpackage.ekvl;
import defpackage.eoeb;
import defpackage.eofs;
import defpackage.eofx;
import defpackage.eogc;
import defpackage.eogf;
import defpackage.eogo;
import defpackage.eqgc;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmya;
import defpackage.fuxq;
import defpackage.fuzh;
import defpackage.fvae;
import defpackage.fvbb;
import defpackage.ryb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class D2DSetupChimeraActivity extends ryb implements dgvy, dfyy, dgsb, dgtz, dgse, dgvo, dgve, dgsr, dgud, dguk, dgvt, dgrs, dgwg {
    public static final auad h = new dgyt(new String[]{"Setup", "UI", "D2DSetupChimeraActivity"});
    private static final ExecutorService n = new aupz(1, 9);
    private String A;
    private dgry B;
    private String C;
    private dgtk D;
    private dgyr E;
    private boolean F;
    private boolean G;
    private ConnectionRequest H;
    SourceLogManager i;
    int j;
    public String l;
    public dgtc m;
    private D2DDevice o;
    private int q;
    private boolean r;
    private ArrayList t;
    private boolean u;
    private boolean v;
    private bsup x;
    private int y;
    private String z;
    private dfim p = dfim.UNKNOWN;
    private Integer s = -99999;
    ArrayList k = new ArrayList();
    private boolean w = false;

    private final int J() {
        BootstrapOptions bootstrapOptions = this.m.ai;
        boolean z = bootstrapOptions != null && dgxv.a(bootstrapOptions);
        boolean z2 = (bootstrapOptions == null || dgfb.b(this, bootstrapOptions.u) == eoeb.NONE) ? false : true;
        return z ? z2 ? R.string.copy_confirmation_description_3p : R.string.smartdevice_d2d_copy_3p_account_text : z2 ? R.string.copy_confirmation_description : R.string.smartdevice_d2d_copy_account_text;
    }

    private final int K() {
        return this.x.p("com.google").length;
    }

    private final cq M() {
        return dgua.x(9, "", getString(R.string.smartdevice_alert_exit_setup_message), getString(R.string.smartdevice_alert_quit_button), getString(R.string.common_cancel), true);
    }

    private final dg N() {
        dfzy dfzyVar = new dfzy();
        dfzyVar.b = getString(R.string.smartdevice_d2d_copy_account_title);
        dfzyVar.c = getString(J());
        dfzyVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
        dfzyVar.e(getString(R.string.smartdevice_action_copy), 1);
        dfzyVar.f(getString(R.string.common_cancel), 4);
        return dfzyVar.a();
    }

    private final dg O() {
        dgum dgumVar = new dgum();
        dgumVar.e(getString(R.string.smartdevice_d2d_copy_account_title));
        dgumVar.b(getString(J()));
        dgumVar.c(getString(R.string.smartdevice_action_copy));
        dgumVar.d(getString(R.string.common_cancel), 4);
        dgumVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
        return dgumVar.a();
    }

    private final BootstrapConfigurations P() {
        String str;
        String str2;
        String str3;
        String str4;
        dfjg dfjgVar = new dfjg();
        dfjgVar.c(2, this.F);
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
                dfhm.a(p, arrayList);
            } else {
                ArrayList arrayList2 = this.k;
                dfhm.a((Account[]) arrayList2.toArray(new Account[arrayList2.size()]), arrayList);
            }
            return new BootstrapConfigurations(str, str2, str3, z, arrayList, hashMap, dfjgVar.a, dfjgVar.b);
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
        cqVar.show(gY(), "smartdevice.dialogfragment");
    }

    private final void R() {
        dfkd dfkdVar = this.m.c;
        if (dfkdVar != null) {
            dfkdVar.e();
        }
    }

    private final void S(dg dgVar, boolean z, boolean z2) {
        if (dgVar instanceof cq) {
            throw new IllegalArgumentException("DialogFragments cannot be added using this method. Did you mean to call 'addOnly(DialogFragment)'?");
        }
        dgxt.a(getContainerActivity(), dgVar.getArguments().getString("smartdevice.title"));
        if (isFinishing()) {
            return;
        }
        bp bpVar = new bp(gY());
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
        S(dgVar, gY().g(R.id.fragment_container) != null, false);
    }

    private final void U() {
        dg g = gY().g(R.id.fragment_container);
        if (g instanceof dgvg) {
            H(((dgvg) g).x(null));
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
        final long a = fvbb.a.lK().a();
        if (a > 0) {
            n.execute(new Runnable() { // from class: dgte
                @Override // java.lang.Runnable
                public final void run() {
                    auad auadVar = D2DSetupChimeraActivity.h;
                    arvr arvrVar = SourceLogManager.this.f;
                    if (arvrVar != null) {
                        arvrVar.e(a, TimeUnit.MILLISECONDS);
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
        if (dgyh.c(str2, getPackageManager())) {
            h.h("No need to install companion app, it's already installed", new Object[0]);
            ab(2);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = getResources().getString(R.string.smartdevice_install_app_reason, companionApp.b, this.o.c);
        }
        String string = getString(R.string.smartdevice_install_app);
        atzb.s(str);
        dgsc dgscVar = new dgsc();
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.message", str);
        bundle.putString("smartdevice.title", string);
        dgscVar.setArguments(bundle);
        T(dgscVar);
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
        if (dgul.z(this)) {
            h.j("Source device doesn't have a lock screen or is Fido flow.", new Object[0]);
            this.w = r().au() && this.p == dfim.AUTO && fuxq.d() && fuxq.a.lK().d();
            aa(r(), false);
            return;
        }
        if (!auub.c() || fvae.a.lK().F()) {
            auad auadVar = dgue.a;
            FingerprintManager fingerprintManager = (FingerprintManager) getApplicationContext().getSystemService("fingerprint");
            if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
                h.j("Creating FingerprintFragment", new Object[0]);
                String string = getString(R.string.smartdevice_d2d_fingerprint_title);
                String string2 = getString(R.string.smartdevice_d2d_fingerprint_verification_text, new Object[]{r().g});
                dgue dgueVar = new dgue();
                Bundle bundle = new Bundle();
                bundle.putString("smartdevice.title", string);
                bundle.putString("smartdevice.message", string2);
                dgueVar.setArguments(bundle);
                T(dgueVar);
                return;
            }
        }
        if (this.p != dfim.AUTO || !fuxq.d()) {
            h.j("Creating copy confirmation/lockscreen page", new Object[0]);
            T(O());
            return;
        }
        dgug x = dgug.x();
        if (!isFinishing()) {
            bp bpVar = new bp(gY());
            bpVar.v(x, "smartdevice.headlessfragment");
            bpVar.a();
        }
        h.j("Added headless Lock Screen fragment", new Object[0]);
    }

    private final void aa(BootstrapOptions bootstrapOptions, boolean z) {
        atzb.t(bootstrapOptions, "bootstrapOptions cannot be null.");
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
        if (this.p == dfim.AUTO && K() == 0) {
            y();
            return;
        }
        boolean z2 = !z;
        String string = getString(R.string.common_choose_account_label);
        dfim dfimVar = this.p;
        dgvg dgvgVar = new dgvg();
        Bundle bundle = new Bundle();
        bundle.putBoolean("smartdevice.accountRequired", true);
        bundle.putString("smartdevice.title", string);
        bundle.putBoolean("singleAccount", false);
        bundle.putString("device_type", dfimVar.name());
        dgvgVar.setArguments(bundle);
        S(dgvgVar, z2, true);
    }

    private final void ab(int i) {
        SourceLogManager sourceLogManager = this.i;
        fgrc v = eogf.a.v();
        fgrc v2 = eofs.a.v();
        if (i != 0) {
            if (i == 1) {
                if (!v2.b.L()) {
                    v2.U();
                }
                eofs eofsVar = (eofs) v2.b;
                eofsVar.c = 3;
                eofsVar.b |= 1;
            } else if (i == 2) {
                if (!v2.b.L()) {
                    v2.U();
                }
                eofs eofsVar2 = (eofs) v2.b;
                eofsVar2.c = 2;
                eofsVar2.b |= 1;
            } else if (i != 3) {
                if (!v2.b.L()) {
                    v2.U();
                }
                eofs eofsVar3 = (eofs) v2.b;
                eofsVar3.c = 5;
                eofsVar3.b |= 1;
            } else {
                if (!v2.b.L()) {
                    v2.U();
                }
                eofs eofsVar4 = (eofs) v2.b;
                eofsVar4.c = 4;
                eofsVar4.b |= 1;
            }
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            eogf eogfVar = (eogf) fgriVar;
            eogfVar.d = 8;
            eogfVar.b |= 2;
            if (!fgriVar.L()) {
                v.U();
            }
            eogf eogfVar2 = (eogf) v.b;
            eofs eofsVar5 = (eofs) v2.Q();
            eofsVar5.getClass();
            eogfVar2.j = eofsVar5;
            eogfVar2.b |= 1024;
            sourceLogManager.j(v);
        }
        dfzy dfzyVar = new dfzy();
        dfzyVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
        dfzyVar.d(R.drawable.smartdevice_setup_success, false);
        dfzyVar.b = getString(R.string.smartdevice_d2d_source_setup_success);
        if (i == 1) {
            dfzyVar.e(getString(R.string.smartdevice_action_open_app), 3);
        } else if (i != 2) {
            if (this.p == dfim.AUTO) {
                dfzyVar.b = getString(R.string.smartdevice_d2d_source_setup_success_auto);
                dfzyVar.a = 2131233041;
                dfzyVar.c = getString(R.string.smartdevice_d2d_source_setup_success_description_auto);
            } else {
                dfzyVar.c = getString(R.string.smartdevice_d2d_source_setup_continue_on_target, new Object[]{r().g});
            }
            dfzyVar.e(getString(R.string.close_button_label), 2);
        } else {
            dfzyVar.e(getString(R.string.smartdevice_action_open_app), 3);
            dfzyVar.c = getString(R.string.smartdevice_companion_app_ready, new Object[]{r().h.b});
        }
        T(dfzyVar.a());
    }

    private final void ac() {
        final BootstrapConfigurations P = P();
        if (P == null) {
            return;
        }
        dgtc dgtcVar = this.m;
        final dfkd dfkdVar = dgtcVar.c;
        final D2DDevice d2DDevice = dgtcVar.d;
        final dfjq dfjqVar = dgtcVar.ak;
        atfn atfnVar = new atfn();
        atfnVar.a = new atfd() { // from class: dfue
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                dftw dftwVar = (dftw) obj;
                dfuv dfuvVar = new dfuv((dhma) obj2);
                dfsh dfshVar = new dfsh(new dfut(dfkd.this, dfjqVar));
                ((dfsr) dftwVar.H()).d(new dftm(dfuvVar), d2DDevice, P, dfshVar, bsxa.a(dftwVar.r));
            }
        };
        atfnVar.d = 20713;
        dfkdVar.ji(atfnVar.a());
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
            Q(dgua.x(10, getString(R.string.smartdevice_alert_work_profile_title), getString(R.string.smartdevice_alert_work_profile_message), getString(R.string.common_ok), null, false));
        }
    }

    private final void ae() {
        if (r().d) {
            S(dgvp.D(getString(R.string.smartdevice_connect_to_wifi), false), gY().g(R.id.fragment_container) != null, true);
        } else {
            Z();
        }
    }

    private final cq af(String str) {
        return dgua.x(4, TextUtils.isEmpty(null) ? getString(R.string.common_something_went_wrong) : null, str, getString(R.string.common_ok), null, false);
    }

    public static Intent n(ConnectionRequest connectionRequest, int i, SourceLogManager sourceLogManager, dfim dfimVar) {
        atzb.s(dfimVar);
        Bundle bundle = new Bundle();
        bundle.putString("connectionRequest", atzs.d(connectionRequest));
        bundle.putInt("smartdevice.trigger", i);
        bundle.putParcelable("smartdevice.sourceLogManager", sourceLogManager);
        bundle.putString("device_type", dfimVar.name());
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.setup.ui.D2DSetupActivity").putExtras(bundle);
    }

    public static Intent q(Context context, D2DDevice d2DDevice, int i, String str, SourceLogManager sourceLogManager) {
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.d2dDevice", atzs.d(d2DDevice));
        bundle.putInt("smartdevice.trigger", i);
        bundle.putString("smartdevice.pin", str);
        bundle.putParcelable("smartdevice.sourceLogManager", sourceLogManager);
        return new Intent().setClassName(context, "com.google.android.gms.smartdevice.setup.ui.D2DSetupActivity").putExtras(bundle);
    }

    @Override // defpackage.dguk
    public final void A() {
        h.d("suppressing setup incomplete toast", new Object[0]);
        this.r = true;
    }

    @Override // defpackage.dgvt
    public final void B() {
        this.r = true;
        R();
        if (this.p == dfim.AUTO) {
            V(0, Bundle.EMPTY);
        } else {
            V(3, Bundle.EMPTY);
        }
        finish();
    }

    @Override // defpackage.dgvt
    public final void C() {
        if (fuxq.d() && this.j == 1) {
            ae();
            return;
        }
        dfkd dfkdVar = this.m.c;
        atfn atfnVar = new atfn();
        atfnVar.a = new atfd() { // from class: dfud
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                dftw dftwVar = (dftw) obj;
                ((dfsr) dftwVar.H()).x(new dfto(new dfuv((dhma) obj2)), bsxa.a(dftwVar.r));
            }
        };
        atfnVar.d = 20715;
        dfkdVar.ji(atfnVar.a());
    }

    @Override // defpackage.dguk
    public final void D() {
        this.w = true;
        this.i.b();
        this.v = true;
        aa(r(), true);
        overridePendingTransition(R.anim.slide_next_in, R.anim.slide_next_out);
    }

    @Override // defpackage.dgud
    public final void E() {
        T(O());
    }

    @Override // defpackage.dgud
    public final void F() {
        this.w = true;
        this.v = true;
        SourceLogManager sourceLogManager = this.i;
        fgrc v = eogf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eogf eogfVar = (eogf) v.b;
        eogfVar.d = 14;
        eogfVar.b |= 2;
        sourceLogManager.j(v);
        aa(r(), false);
    }

    @Override // defpackage.dgve
    public final void H(dgvf dgvfVar) {
        this.i.f(dgvfVar);
    }

    @Override // defpackage.dgwg
    public final void I(String str, String str2) {
        this.z = str;
        this.A = str2;
        P();
    }

    @Override // defpackage.dgvo
    public final void L(dgxa dgxaVar, int i, int i2) {
        this.z = dgxaVar.a;
        this.A = dgxaVar.e;
        SourceLogManager sourceLogManager = this.i;
        int i3 = dgxaVar.d;
        fgrc v = eogf.a.v();
        fgrc v2 = eogc.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        eogc eogcVar = (eogc) fgriVar;
        eogcVar.e = i - 1;
        eogcVar.b |= 4;
        switch (i3) {
            case 10:
                if (!fgriVar.L()) {
                    v2.U();
                }
                eogc eogcVar2 = (eogc) v2.b;
                eogcVar2.d = 3;
                eogcVar2.b |= 2;
                break;
            case 11:
                if (!fgriVar.L()) {
                    v2.U();
                }
                eogc eogcVar3 = (eogc) v2.b;
                eogcVar3.d = 2;
                eogcVar3.b |= 2;
                break;
            case 12:
                if (!fgriVar.L()) {
                    v2.U();
                }
                eogc eogcVar4 = (eogc) v2.b;
                eogcVar4.d = 1;
                eogcVar4.b |= 2;
                break;
            default:
                if (!fgriVar.L()) {
                    v2.U();
                }
                eogc eogcVar5 = (eogc) v2.b;
                eogcVar5.d = 0;
                eogcVar5.b |= 2;
                SourceLogManager.a.f(a.j(i3, "Unknown connection status: "), new Object[0]);
                break;
        }
        if (!v2.b.L()) {
            v2.U();
        }
        eogc eogcVar6 = (eogc) v2.b;
        eogcVar6.b = 1 | eogcVar6.b;
        eogcVar6.c = i2;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        eogf eogfVar = (eogf) fgriVar2;
        eogfVar.d = 4;
        eogfVar.b |= 2;
        if (!fgriVar2.L()) {
            v.U();
        }
        eogf eogfVar2 = (eogf) v.b;
        eogc eogcVar7 = (eogc) v2.Q();
        eogcVar7.getClass();
        eogfVar2.h = eogcVar7;
        eogfVar2.b |= 128;
        sourceLogManager.j(v);
        Z();
    }

    @Override // defpackage.dgsb
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
        ekvl.a(!TextUtils.isEmpty(str));
        Bundle z = dguf.z(getResources().getString(R.string.smartdevice_setup_info_installing_app), null);
        z.putString("smartdevice.appPackage", str);
        dgsf dgsfVar = new dgsf();
        dgsfVar.setArguments(z);
        T(dgsfVar);
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
        if (!atxi.f(getPackageManager(), intent)) {
            intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format(Locale.US, "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", str, 1)));
            intent.setPackage("com.android.vending");
            intent.putExtra("use_direct_purchase", true);
        }
        startActivityForResult(intent, 7);
    }

    @Override // defpackage.dgse
    public final void b() {
        ab(4);
    }

    @Override // defpackage.dfyy
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

    @Override // defpackage.dgse
    public final void d() {
        ab(1);
    }

    @Override // defpackage.dgsr
    public final void e() {
        this.j = 3;
        V(-1, Bundle.EMPTY);
        BootstrapOptions r = r();
        if (r == null) {
            return;
        }
        PostTransferAction postTransferAction = r.u;
        if (postTransferAction == null || !fvae.a.lK().M()) {
            W();
        } else {
            Intent a = dgfb.a(this, postTransferAction);
            if (a != null) {
                startActivity(a.addFlags(268435456));
                finish();
            } else {
                ab(0);
            }
        }
        int K = K();
        if ((r.au() || r.at()) && K > 0) {
            int i = dgbs.a;
            int c = dfgm.c();
            if (c == 0 || c == 1) {
                dgbs.a(this, K, r.g);
            }
        }
    }

    @Override // defpackage.dgsr
    public final void f() {
        this.j = 1;
        BootstrapOptions r = r();
        if (r.as() && this.p != dfim.AUTO && this.x.p("com.google").length == 0) {
            l(7);
            return;
        }
        long j = r.l;
        if (j == -1 || j == 0) {
            j = dgys.a();
        }
        SourceLogManager sourceLogManager = this.i;
        fgrc v = eogf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eogf eogfVar = (eogf) fgriVar;
        eogfVar.d = 17;
        eogfVar.b |= 2;
        if (!fgriVar.L()) {
            v.U();
        }
        eogf eogfVar2 = (eogf) v.b;
        eogfVar2.b |= 4096;
        eogfVar2.l = j;
        sourceLogManager.j(v);
        SourceLogManager sourceLogManager2 = this.i;
        synchronized (sourceLogManager2.d) {
            if (sourceLogManager2.c) {
                SourceLogManager.a.m("Attempted to set sessionId twice", new Object[0]);
            } else if (j == -1) {
                SourceLogManager.a.f("Attempted to set invalid sessionId", new Object[0]);
            } else {
                SourceLogManager.a.j(a.C(j, "Set session ID to : "), new Object[0]);
                sourceLogManager2.b = j;
                sourceLogManager2.c = true;
                sourceLogManager2.a();
            }
        }
        dfjg p = r.p();
        boolean z = !r.au() || K() == 1;
        byte b = r.f;
        int i = r.y;
        if (i == 0) {
            i = r.s;
        }
        boolean z2 = p.b(12) || (fuzh.k() && b == 3 && ((long) i) >= fuzh.c());
        this.u = z2;
        h.d(a.aa(z2, "Is fido flow: "), new Object[0]);
        if (z && this.F && !p.b(1)) {
            Q(dgya.a(this, 12));
        } else {
            ae();
        }
    }

    @Override // defpackage.dgsr
    public final void g() {
        if (this.j == 3) {
            return;
        }
        this.j = 0;
        l(4);
    }

    @Override // defpackage.dgsr
    public final void h(String str) {
        if (this.p == dfim.AUTO && fuxq.f() && str.equals(getResources().getQuantityString(R.plurals.smartdevice_d2d_copying_accounts, 1))) {
            str = getString(R.string.common_login_activity_task_title);
        }
        T(dguf.A(str, null));
    }

    @Override // defpackage.dgsr
    public final void i(String str) {
        if (str == null) {
            h.f("PIN verification is no longer supported.", new Object[0]);
            X();
        } else {
            this.i.c();
            T(dgvu.x(eogo.b(this.o.h), str, true, true, this.p));
        }
    }

    @Override // defpackage.dgsr
    public final void j(VerificationInfo verificationInfo) {
        String str = verificationInfo.a;
        this.i.c();
        T(dgvu.x(eogo.b(verificationInfo.b), str, true, true, this.p));
    }

    @Override // defpackage.dguk
    public final void jT() {
        aa(r(), false);
    }

    @Override // defpackage.dguk
    public final void jU() {
        onBackPressed();
    }

    @Override // defpackage.dgsr
    public final void k(BootstrapProgressResult bootstrapProgressResult) {
        int i = bootstrapProgressResult.a;
        if (i != 1) {
            if (i != 6) {
                return;
            }
            auad auadVar = h;
            auadVar.j("WIFI_AUTHENTICATION_FAILED", new Object[0]);
            auadVar.f("Wifi Password was incorrect", new Object[0]);
            dgwh.x(this.z, true).show(gY(), "dialog");
            return;
        }
        SourceLogManager sourceLogManager = this.i;
        fgrc v = eogf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eogf eogfVar = (eogf) v.b;
        eogfVar.d = 20;
        eogfVar.b |= 2;
        sourceLogManager.j(v);
        Bundle bundle = bootstrapProgressResult.b;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("accounts");
        dfim dfimVar = this.p;
        dfim dfimVar2 = dfim.AUTO;
        boolean z = (dfimVar == dfimVar2 && fuxq.a.lK().b()) ? false : true;
        String string = (this.p == dfimVar2 && fuxq.f()) ? getString(R.string.common_login_activity_task_title) : null;
        if (parcelableArrayList == null) {
            h.j("Has pending intent to delegate", new Object[0]);
            this.B.d(null, (PendingIntent) bundle.getParcelable("pendingIntent"));
        } else if (this.u) {
            T(dgrr.b(parcelableArrayList, null, string, null, R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24, true, true, false, null));
        } else {
            T(dgrr.b(parcelableArrayList, this.l, string, null, R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24, z, false, false, null));
        }
    }

    @Override // defpackage.dgsr
    public final void l(int i) {
        Bundle bundle = new Bundle();
        SourceLogManager sourceLogManager = this.i;
        fgrc v = eofx.a.v();
        int i2 = -1;
        int i3 = i - 1;
        int i4 = 6;
        if (i3 == 1) {
            if (!v.b.L()) {
                v.U();
            }
            eofx eofxVar = (eofx) v.b;
            eofxVar.c = 8;
            eofxVar.b |= 1;
        } else if (i3 == 2) {
            if (!v.b.L()) {
                v.U();
            }
            eofx eofxVar2 = (eofx) v.b;
            eofxVar2.c = 3;
            eofxVar2.b |= 1;
        } else if (i3 == 3) {
            if (!v.b.L()) {
                v.U();
            }
            eofx eofxVar3 = (eofx) v.b;
            eofxVar3.c = 6;
            eofxVar3.b |= 1;
        } else if (i3 == 5) {
            if (!v.b.L()) {
                v.U();
            }
            eofx eofxVar4 = (eofx) v.b;
            eofxVar4.c = 2;
            eofxVar4.b |= 1;
        } else if (i3 != 6) {
            if (!v.b.L()) {
                v.U();
            }
            eofx eofxVar5 = (eofx) v.b;
            eofxVar5.c = 0;
            eofxVar5.b |= 1;
        } else {
            if (!v.b.L()) {
                v.U();
            }
            eofx eofxVar6 = (eofx) v.b;
            eofxVar6.c = 7;
            eofxVar6.b |= 1;
        }
        fgrc v2 = eogf.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        eogf eogfVar = (eogf) v2.b;
        eofx eofxVar7 = (eofx) v.Q();
        eofxVar7.getClass();
        eogfVar.k = eofxVar7;
        eogfVar.b |= 2048;
        if (!v2.b.L()) {
            v2.U();
        }
        eogf eogfVar2 = (eogf) v2.b;
        eogfVar2.d = 12;
        eogfVar2.b |= 2;
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
                Q(dgua.x(8, getString(R.string.smartdevice_alert_no_accounts_title), TextUtils.isEmpty(str) ? getString(R.string.smartdevice_alert_no_accounts_generic_text) : String.format(getString(R.string.smartdevice_alert_no_accounts_text), str.trim()), getString(R.string.common_ok), null, false));
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

    @Override // defpackage.dgsr
    public final void m() {
        l(3);
    }

    @Override // defpackage.dgrs
    public final void o(int i) {
        R();
        X();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            this.B.e(i, i2);
            return;
        }
        if (i == 4) {
            dg g = gY().g(R.id.fragment_container);
            if (g == null || !(g instanceof dgvp)) {
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
        auad auadVar = h;
        auadVar.h(a.j(i2, "RESULT CODE = "), new Object[0]);
        if (i2 == 0) {
            if (K() == 0) {
                finish();
                return;
            }
        } else if (i2 == -1) {
            Account account = null;
            if (intent != null) {
                String stringExtra = intent.getStringExtra("authAccount");
                int i3 = dgbd.a;
                Account[] p = dgxu.a(this).p("com.google");
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
                auadVar.m("Couldn't find account", new Object[0]);
                s(R.string.common_something_went_wrong);
                return;
            }
            auadVar.h("Account successfully added: %s", account.name);
            dfzy dfzyVar = new dfzy();
            dfzyVar.b = getString(R.string.smartdevice_d2d_adding_account);
            dfzyVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
            dfzyVar.e = true;
            T(dfzyVar.a());
            dgqe dgqeVar = new dgqe(this);
            eqgc.t(eqgc.q(eqgc.p(dgqeVar.a(account, "service_HOSTED"), dgqeVar.a(account, "service_usm")), fuxq.b(), TimeUnit.MILLISECONDS, new aupv(1, 9)), new dgtj(this, account), new aupz(1, 9));
            return;
        }
        s(R.string.common_something_went_wrong);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
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
            gY().S(this.s.intValue(), 0);
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        dfim dfimVar;
        Status status;
        super.onCreate(bundle);
        if (fmya.c()) {
            atmo.a(this);
        }
        atmr.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        getWindow().addFlags(128);
        this.x = dgxu.a(this);
        Intent intent = getIntent();
        this.y = intent.getIntExtra("smartdevice.trigger", 0);
        if (intent.hasExtra("connectionRequest")) {
            this.H = (ConnectionRequest) atzs.c(intent.getStringExtra("connectionRequest"), ConnectionRequest.CREATOR);
            this.p = dfim.a(intent.getStringExtra("device_type"));
        } else {
            D2DDevice d2DDevice = (D2DDevice) atzs.c(intent.getStringExtra("smartdevice.d2dDevice"), D2DDevice.CREATOR);
            atzb.t(d2DDevice, "D2D device cannot be null");
            this.o = d2DDevice;
            byte b = d2DDevice.e;
            dfim[] values = dfim.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dfimVar = dfim.UNKNOWN;
                    break;
                }
                dfimVar = values[i];
                if (dfimVar.i == b) {
                    break;
                } else {
                    i++;
                }
            }
            this.p = dfimVar;
            this.C = intent.getStringExtra("smartdevice.pin");
        }
        dgtk dgtkVar = new dgtk(this);
        this.D = dgtkVar;
        dgtkVar.execute(new Void[0]);
        this.E = new dgyr(getApplicationContext());
        this.F = dgbv.b(this).b();
        ew gY = gY();
        dgtc dgtcVar = (dgtc) gY.h("connectionless_connection_fragment");
        this.m = dgtcVar;
        if (dgtcVar == null) {
            this.m = new dgtc();
            bp bpVar = new bp(gY);
            bpVar.v(this.m, "connectionless_connection_fragment");
            bpVar.a();
            if (this.H != null) {
                final dgtc dgtcVar2 = this.m;
                Context applicationContext = getApplicationContext();
                final ConnectionRequest connectionRequest = this.H;
                dgtcVar2.c = new dfkd(applicationContext);
                dgtcVar2.b.a(this);
                dgtcVar2.c.e().x(new dhlk() { // from class: dgsj
                    @Override // defpackage.dhlk
                    public final void hH(dhlw dhlwVar) {
                        final dgtc dgtcVar3 = dgtc.this;
                        final ConnectionRequest connectionRequest2 = connectionRequest;
                        if (dhlwVar.m()) {
                            dgtc.a.d("Disconnect from previous connection succeeded, waiting for Bluetooth cleanup", new Object[0]);
                            new aupv(1, 9).schedule(new Runnable() { // from class: dgsk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dgtc.a.j("Finished waiting, connecting", new Object[0]);
                                    final dgtc dgtcVar4 = dgtc.this;
                                    dgtcVar4.c.d(connectionRequest2, dgtcVar4.aj).y(new dhln() { // from class: dgsn
                                        @Override // defpackage.dhln
                                        public final void gB(Exception exc) {
                                            dgtc.this.b.l(3);
                                        }
                                    });
                                }
                            }, fuya.a.lK().d(), TimeUnit.MILLISECONDS).hD(new Runnable() { // from class: dgsl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dgtc.a.j("Called connect", new Object[0]);
                                }
                            }, eqex.a);
                        } else {
                            dgtc.a.j("Disconnect failed, likely no connection in progress", new Object[0]);
                            dgtcVar3.c.d(connectionRequest2, dgtcVar3.aj).y(new dhln() { // from class: dgsm
                                @Override // defpackage.dhln
                                public final void gB(Exception exc) {
                                    dgtc.this.b.l(3);
                                }
                            });
                        }
                    }
                });
            } else {
                if (dgbv.c() == null) {
                    h.m("Bluetooth not available", new Object[0]);
                    status = new Status(10570);
                } else if (dgyu.a(this)) {
                    h.m("Cannot copy restricted profile", new Object[0]);
                    status = new Status(10569);
                } else {
                    status = Status.b;
                }
                if (status.e()) {
                    dgtc dgtcVar3 = this.m;
                    Context applicationContext2 = getApplicationContext();
                    D2DDevice d2DDevice2 = this.o;
                    int i2 = this.y;
                    String str = this.C;
                    dgtcVar3.c = new dfkd(applicationContext2);
                    dgtcVar3.d = d2DDevice2;
                    dgtcVar3.ag = i2;
                    dgtcVar3.ah = str;
                    dgtcVar3.b.a(this);
                    if (dgtcVar3.ag == 1) {
                        dgtcVar3.c.i(dgtcVar3.al);
                    } else {
                        dgtcVar3.x();
                    }
                } else {
                    int i3 = status.i;
                    if (i3 == 10569) {
                        Q(af(getString(R.string.smartdevice_d2d_source_restricted_user_text)));
                    } else if (i3 != 10570) {
                        h.f("Source mode is unsupported. Reason: ".concat(dfjl.a(i3)), new Object[0]);
                    } else {
                        Q(af(getString(R.string.smartdevice_d2d_source_bluetooth_unavailable_text)));
                    }
                }
            }
        }
        this.B = new dgry(this, new dgtf(this), bundle);
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
            T(dguf.A(getString(R.string.common_connecting), this.p == dfim.AUTO ? getString(R.string.smartdevice_setup_bluetooth_connecting_text_auto) : null));
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
        sourceLogManager2.h(this.y, dgbf.a(this));
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        h.d("onDestroy", new Object[0]);
        this.D.cancel(true);
        if (!this.G) {
            this.i.g(4);
        }
        super.onDestroy();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        h.d("onPause", new Object[0]);
        this.E.a();
        this.B.a();
        super.onPause();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPostResume() {
        super.onPostResume();
        h.d("onPostResume", new Object[0]);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        h.d("onResume", new Object[0]);
        this.r = false;
        dgyr dgyrVar = this.E;
        dgyx.a();
        if (!dgyrVar.d) {
            dgyrVar.d = true;
            ContentResolver contentResolver = dgyrVar.b;
            int i = dgyr.a;
            dgyrVar.c = Settings.System.getInt(contentResolver, "screen_off_timeout", i);
            dgyrVar.b(i);
            dgyrVar.e = new dgxx(dgyrVar, Thread.getDefaultUncaughtExceptionHandler());
            Thread.setDefaultUncaughtExceptionHandler(dgyrVar.e);
        }
        this.B.b();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        auad auadVar = h;
        auadVar.d("onStop", new Object[0]);
        if (!isChangingConfigurations() && this.j != 3 && !this.r) {
            if (this.q > 0) {
                auadVar.d("Displaying error toast", new Object[0]);
                Toast.makeText(this, this.q, 1).show();
            } else {
                auadVar.d("Displaying setup incomplete toast", new Object[0]);
                Toast.makeText(this, R.string.smartdevice_alert_setup_incomplete, 1).show();
            }
        }
        super.onStop();
    }

    @Override // defpackage.dgrs
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
        dgtc dgtcVar = this.m;
        if (dgtcVar != null) {
            return dgtcVar.ai;
        }
        throw new IllegalStateException("No bootstrap options available yet");
    }

    public final void s(int i) {
        Toast.makeText(this, i, 1).show();
        aa(r(), false);
    }

    public final void t(Account account) {
        dg g = gY().g(R.id.fragment_container);
        if (!(g instanceof dgvg)) {
            w(new dgvf(account, K(), 0, 0, false, true));
            return;
        }
        dgvg dgvgVar = (dgvg) g;
        dgve dgveVar = dgvgVar.b;
        if (dgveVar != null) {
            dgveVar.w(new dgvf(account, dgvgVar.c.size(), dgvgVar.ag.size(), dgvgVar.ah.size(), dgvgVar.al, true));
        }
    }

    @Override // defpackage.dgtz
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

    @Override // defpackage.dgve
    public final void w(dgvf dgvfVar) {
        Account account = dgvfVar.a;
        if (account == null) {
            throw new IllegalStateException("onAccountSelected was called but account was null!");
        }
        h.d("Selected account: %s", account);
        if (r().au()) {
            this.k.clear();
        }
        this.k.add(account);
        this.i.f(dgvfVar);
        if (this.w) {
            ad();
        } else {
            T(N());
        }
    }

    @Override // defpackage.dgve
    public final void y() {
        this.x.s("com.google", null, null, new AccountManagerCallback() { // from class: dgtd
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                D2DSetupChimeraActivity.this.v(accountManagerFuture);
            }
        }, null);
    }

    @Override // defpackage.dguk
    public final void z(int i) {
        if (i == 4) {
            c(4, null);
        } else {
            h.f("Unknown lock screen secondary action: %d", Integer.valueOf(i));
        }
    }

    @Override // defpackage.dgvy
    public final void G(int i) {
    }

    @Override // defpackage.dgrs
    public final void x(String str) {
    }
}
