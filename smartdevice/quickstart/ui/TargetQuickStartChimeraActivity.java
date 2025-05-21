package com.google.android.gms.smartdevice.quickstart.ui;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.os.Trace;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.d2d.owners.ParcelableDeviceOwner;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import com.google.android.gms.smartdevice.quickstart.RestoreAnytimeContext;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartChimeraService;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.arjz;
import defpackage.arkc;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.asiu;
import defpackage.asmf;
import defpackage.bp;
import defpackage.bqna;
import defpackage.byzz;
import defpackage.dcxh;
import defpackage.ddkh;
import defpackage.ddne;
import defpackage.ddnr;
import defpackage.ddnt;
import defpackage.ddot;
import defpackage.ddqp;
import defpackage.ddqq;
import defpackage.ddre;
import defpackage.ddvk;
import defpackage.ddvq;
import defpackage.ddvx;
import defpackage.ddwc;
import defpackage.ddwf;
import defpackage.ddzf;
import defpackage.deae;
import defpackage.deag;
import defpackage.deao;
import defpackage.deax;
import defpackage.debq;
import defpackage.deca;
import defpackage.degt;
import defpackage.degu;
import defpackage.dejr;
import defpackage.dekr;
import defpackage.demq;
import defpackage.denq;
import defpackage.dg;
import defpackage.dtyj;
import defpackage.dtyk;
import defpackage.edjy;
import defpackage.edks;
import defpackage.eigd;
import defpackage.elno;
import defpackage.elnq;
import defpackage.elob;
import defpackage.elpn;
import defpackage.elpo;
import defpackage.elps;
import defpackage.elta;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkhl;
import defpackage.fsfe;
import defpackage.fsfn;
import defpackage.fsfy;
import defpackage.ips;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TargetQuickStartChimeraActivity extends deao implements ddnt, edjy, degt {
    public static final arxo i = new denq(new String[]{"TargetQuickStartChimeraActivity"});
    public String A;
    public BootstrapCompletionResult E;
    private ArrayList I;
    private deca J;
    private long K;
    private long L;
    private RestoreAnytimeContext N;
    private abv P;
    public byzz j;
    public String k;
    public String l;
    public String m;
    public degu n;
    public ddzf o;
    public ddvq p;
    public ddvk q;
    public ServiceConnection r;
    public int u;
    public VerificationInfo v;
    public ddkh x;
    public List z;
    public int s = 0;
    public int t = 0;
    public boolean w = false;
    private final int M = -1;
    private boolean O = false;
    public final Queue y = new ArrayDeque();
    private final fecj Q = elps.a.v();
    public final fecj H = elnq.a.v();
    public boolean B = false;
    public final ExecutorService C = new asmf(2, 9);
    public int D = 101;
    public final AtomicReference F = new AtomicReference(new Bundle());
    public final Bundle G = new Bundle();

    private final void C() {
        arxo arxoVar = i;
        arxoVar.d("findNotTransferredAccounts()", new Object[0]);
        try {
            List<BootstrapAccount> a = this.p.a();
            if (a == null) {
                arxoVar.d("sourceBootstrapAccounts is null", new Object[0]);
                return;
            }
            List list = this.z;
            if (list == null || list.isEmpty()) {
                this.I = new ArrayList(a);
                return;
            }
            this.I = new ArrayList();
            for (BootstrapAccount bootstrapAccount : a) {
                Iterator it = this.z.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ddre.r(bootstrapAccount.b, ((Account) it.next()).name)) {
                            break;
                        }
                    } else {
                        this.I.add(bootstrapAccount);
                        break;
                    }
                }
            }
        } catch (RemoteException e) {
            i.l(e);
        }
    }

    private final void D() {
        this.J.b((byte) 2);
        if (eigd.e(Build.MANUFACTURER, "samsung")) {
            this.J.c((byte) 2);
        } else {
            this.J.c((byte) 1);
        }
    }

    private final void E() {
        degu deguVar = this.n;
        if (deguVar != null) {
            deguVar.y();
        }
    }

    @Override // defpackage.degt
    public final void A(List list) {
        this.t = this.u - list.size();
        fecj v = elno.a.v();
        int i2 = this.u;
        if (!v.b.L()) {
            v.U();
        }
        elno elnoVar = (elno) v.b;
        elnoVar.b |= 1;
        elnoVar.c = i2;
        int size = list.size();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elno elnoVar2 = (elno) fecpVar;
        elnoVar2.b |= 2;
        elnoVar2.d = size;
        int i3 = this.t;
        if (!fecpVar.L()) {
            v.U();
        }
        elno elnoVar3 = (elno) v.b;
        elnoVar3.b |= 4;
        elnoVar3.e = i3;
        this.o.l((elno) v.Q());
        try {
            this.p.e(ddwf.a(14, null, null, 0, false, null, 0, null, false, list, 0));
        } catch (RemoteException e) {
            i.l(e);
        }
    }

    public final void B() {
        i.d("stopAdvertisingAndDisconnect()", new Object[0]);
        ddvq ddvqVar = this.p;
        if (ddvqVar != null) {
            try {
                ddvqVar.m();
            } catch (RemoteException e) {
                i.m("RemoteException ".concat(e.toString()), new Object[0]);
            }
        }
    }

    @Override // defpackage.ddnt
    public final void c(int i2, Bundle bundle) {
        arxo arxoVar = i;
        arxoVar.d("onAction() with actionId: %d", Integer.valueOf(i2));
        if (i2 == 3) {
            int i3 = this.D;
            if (i3 == 101) {
                s();
                return;
            }
            if (i3 == 108) {
                n(this.z);
                return;
            } else {
                if (i3 == 109 || i3 == 112 || i3 == 114) {
                    z();
                    return;
                }
                return;
            }
        }
        switch (i2) {
            case 1001:
                arxoVar.d("User skips on instruction page.", new Object[0]);
                this.J.b((byte) 4);
                if (eigd.e(Build.MANUFACTURER, "samsung")) {
                    this.J.c((byte) 2);
                } else {
                    this.J.c((byte) 1);
                }
                this.o.o(elob.SKIP_PAIR);
                setResult(1);
                break;
            case 1002:
                arxoVar.d("User skips on QR page.", new Object[0]);
                D();
                this.o.o(elob.SKIP_IN_QR);
                setResult(1);
                break;
            case 1003:
                arxoVar.d("Programmatically skips to manual setup.", new Object[0]);
                D();
                this.o.o(elob.SKIP_PROGRAMMATICALLY);
                setResult(102);
                break;
            case 1004:
                arxoVar.d("User proceeds to iOS.", new Object[0]);
                this.J.b((byte) 1);
                if (eigd.e(Build.MANUFACTURER, "samsung")) {
                    this.J.c((byte) 2);
                } else {
                    this.J.c((byte) 1);
                }
                this.o.o(elob.PROCEED_TO_IOS);
                setResult(101);
                break;
            case 1005:
                arxoVar.d("Restore Anytime not supported by source device, return to SUW", new Object[0]);
                D();
                Intent intent = new Intent();
                intent.putExtras(bundle);
                setResult(105, intent);
                break;
            default:
                finish();
                return;
        }
        if (fsfn.m()) {
            this.C.execute(new Runnable() { // from class: deay
                @Override // java.lang.Runnable
                public final void run() {
                    TargetQuickStartChimeraActivity targetQuickStartChimeraActivity = TargetQuickStartChimeraActivity.this;
                    targetQuickStartChimeraActivity.B();
                    TargetQuickStartChimeraService.g(targetQuickStartChimeraActivity);
                }
            });
        } else {
            B();
            TargetQuickStartChimeraService.g(this);
        }
        finishAndRemoveTask();
    }

    @Override // defpackage.edjy
    public final void gs() {
        onBackPressed();
    }

    public final dg l() {
        return gI().g(R.id.fragment_container);
    }

    public final dg m(int i2) {
        String string;
        CharSequence p;
        int i3 = R.string.smartdevice_restore_anytime_restore_from_backup_button;
        switch (i2) {
            case 101:
                debq debqVar = new debq();
                if (this.N != null) {
                    debqVar.b = getString(R.string.smartdevice_restore_anytime_instruction_title);
                    debqVar.g(ddvx.v(this), getString(R.string.smartdevice_restore_anytime_restore_from_backup_button));
                } else {
                    debqVar.b = ddvx.u(this);
                    debqVar.c = ddvx.r(this);
                    debqVar.g(ddvx.v(this), ddvx.s(this));
                }
                debqVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
                debqVar.d = 3;
                debqVar.e = 1004;
                debqVar.f = this.N;
                return debqVar.f();
            case 102:
                if (this.l == null) {
                    i.m(a.j(i2, "Entering QR code fragment with null deepLinkUrl at state "), new Object[0]);
                }
                RestoreAnytimeContext restoreAnytimeContext = this.N;
                if (restoreAnytimeContext != null) {
                    string = (TextUtils.isEmpty(restoreAnytimeContext.c) || TextUtils.isEmpty(this.N.b)) ? getString(R.string.smartdevice_qrcode_scan_qr) : getString(R.string.smartdevice_restore_anytime_qrcode_title, new Object[]{this.N.b});
                    p = Html.fromHtml(getString(R.string.smartdevice_restore_anytime_qrcode_body_text));
                } else {
                    string = this.O ? getString(R.string.smartdevice_qrcode_scan_qr_again) : getString(R.string.smartdevice_qrcode_scan_qr);
                    p = ddvx.p(this);
                    i3 = R.string.common_skip;
                }
                String str = this.l;
                Bundle bundle = new Bundle();
                bundle.putString("deeplinkUrl", str);
                bundle.putInt("negativeButtonStringRes", i3);
                bundle.putInt("negativeButtonActionId", 1002);
                bundle.putString("title", string);
                bundle.putCharSequence("description", p);
                dejr dejrVar = new dejr();
                dejrVar.setArguments(bundle);
                return dejrVar;
            case 103:
            case 105:
                int i4 = ips.a;
                ddot ddotVar = new ddot();
                ddotVar.b = getString(R.string.smartdevice_d2d_target_continue_description);
                ddotVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
                return ddotVar.a();
            case 104:
                int i5 = ips.a;
                ddnr ddnrVar = new ddnr(null);
                ddnrVar.b = getString(R.string.smartdevice_getting_account_info);
                ddnrVar.a = R.drawable.quantum_gm_ic_account_circle_vd_theme_24;
                return ddnrVar.b();
            case 106:
            case 110:
            case 111:
            case 113:
            default:
                throw new IllegalStateException(a.j(i2, "Unexpected state "));
            case 107:
                VerificationInfo verificationInfo = this.v;
                return dekr.x(elta.b(verificationInfo.b), verificationInfo.a, false, false, dcxh.UNKNOWN);
            case 108:
            case 109:
                ArrayList arrayList = this.I;
                if (arrayList == null || arrayList.isEmpty()) {
                    ddot ddotVar2 = new ddot();
                    ddotVar2.a = R.drawable.googleg_standard_color_48_vd;
                    ddotVar2.e(getString(R.string.common_next), 3);
                    ddotVar2.b = getString(R.string.smartdevice_quick_start_failed_account_transfer_title);
                    ddotVar2.c = i2 == 108 ? getString(R.string.smartdevice_quick_start_account_transfer_failed_description) : getString(R.string.smartdevice_quick_start_all_accounts_transfer_failed_description);
                    return ddotVar2.a();
                }
                i.d("Showing detailed account transfer failed page", new Object[0]);
                ArrayList arrayList2 = new ArrayList(this.I.size());
                ArrayList arrayList3 = this.I;
                int size = arrayList3.size();
                for (int i6 = 0; i6 < size; i6++) {
                    BootstrapAccount bootstrapAccount = (BootstrapAccount) arrayList3.get(i6);
                    dtyj a = dtyk.a();
                    a.b(bootstrapAccount.b);
                    arrayList2.add(new ParcelableDeviceOwner(a.a(), null));
                }
                deae deaeVar = new deae();
                deaeVar.b = getString(R.string.smartdevice_quick_start_failed_account_transfer_title);
                deaeVar.c = i2 == 108 ? getString(R.string.smartdevice_quick_start_account_transfer_failed_description) : getString(R.string.smartdevice_quick_start_all_accounts_transfer_failed_description);
                deaeVar.a = R.drawable.googleg_standard_color_48_vd;
                deaeVar.d(getString(R.string.common_next), 3);
                deaeVar.d = arrayList2;
                return deaeVar.f();
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /* 112 */:
                ddot ddotVar3 = new ddot();
                ddotVar3.b = getString(R.string.smartdevice_quick_start_lskf_guess_limit_exceeded_title);
                ddotVar3.a = R.drawable.gs_error_vd_theme_48;
                if (this.B) {
                    ddotVar3.c = getString(R.string.smartdevice_quick_start_target_lskf_failed_before_wifi_description);
                    ddotVar3.e(getString(R.string.common_next), 1003);
                } else {
                    ddotVar3.c = getString(R.string.smartdevice_quick_start_all_accounts_transfer_failed_description);
                    ddotVar3.e(getString(R.string.common_next), 3);
                }
                return ddotVar3.a();
            case 114:
                ddot ddotVar4 = new ddot();
                ddotVar4.a = R.drawable.gs_error_vd_theme_48;
                if (this.B) {
                    ddotVar4.b = getString(R.string.common_something_went_wrong);
                    ddotVar4.c = getString(R.string.smartdevice_quick_start_target_lskf_failed_before_wifi_description);
                    ddotVar4.e(getString(R.string.common_next), 1003);
                } else {
                    ddotVar4.b = getString(R.string.smartdevice_quick_start_failed_account_transfer_title);
                    ddotVar4.c = getString(R.string.smartdevice_quick_start_all_accounts_transfer_failed_description);
                    ddotVar4.e(getString(R.string.common_next), 3);
                }
                return ddotVar4.a();
        }
    }

    public final void n(final List list) {
        ((asmf) this.C).submit(new Runnable() { // from class: deaz
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle = new Bundle();
                final TargetQuickStartChimeraActivity targetQuickStartChimeraActivity = TargetQuickStartChimeraActivity.this;
                String str = targetQuickStartChimeraActivity.m;
                if (str != null) {
                    bundle.putString("theme", str);
                }
                for (Account account : list) {
                    if (targetQuickStartChimeraActivity.x.c(account)) {
                        ddkh ddkhVar = targetQuickStartChimeraActivity.x;
                        BootstrapCompletionResult bootstrapCompletionResult = targetQuickStartChimeraActivity.E;
                        int i2 = 0;
                        int i3 = bootstrapCompletionResult == null ? 0 : bootstrapCompletionResult.f;
                        if (i3 == 3) {
                            i2 = 2;
                        } else if (i3 == 4) {
                            i2 = 1;
                        }
                        Intent a = ddkhVar.a(account, bundle, new ManagedAuthOptions(i2, 4));
                        if (a != null) {
                            targetQuickStartChimeraActivity.y.add(a);
                        }
                    }
                }
                targetQuickStartChimeraActivity.runOnUiThread(new Runnable() { // from class: deba
                    @Override // java.lang.Runnable
                    public final void run() {
                        TargetQuickStartChimeraActivity.this.t();
                    }
                });
            }
        });
    }

    @Override // defpackage.degt
    public final void o(int i2) {
        fecj v = ddne.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ddne ddneVar = (ddne) fecpVar;
        ddneVar.c = 5;
        ddneVar.b |= 1;
        if (!fecpVar.L()) {
            v.U();
        }
        ddne ddneVar2 = (ddne) v.b;
        ddneVar2.b |= 2;
        ddneVar2.d = i2;
        this.o.n(10599, (ddne) v.Q());
        if (this.D == 106) {
            E();
        }
        try {
            this.p.e(QuickStartTargetEventData.a(10599));
        } catch (RemoteException e) {
            i.l(e);
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        arxo arxoVar = i;
        arxoVar.d("onActivityResult requestCode: %d, resultCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        super.onActivityResult(i2, i3, intent);
        if (i2 == 13) {
            if (i3 == -1) {
                new ddqp(getApplicationContext()).c(2);
            } else {
                new ddqp(getApplicationContext()).c(3);
            }
            int i4 = this.D;
            if (i4 == 109 || i4 == 114 || i4 == 112) {
                return;
            }
            this.D = 104;
            if (i3 == 0) {
                arxoVar.d("User clicked back button on target LSKF page", new Object[0]);
                if (this.B) {
                    if (fsfn.m()) {
                        this.C.execute(new Runnable() { // from class: debb
                            @Override // java.lang.Runnable
                            public final void run() {
                                TargetQuickStartChimeraActivity targetQuickStartChimeraActivity = TargetQuickStartChimeraActivity.this;
                                targetQuickStartChimeraActivity.B();
                                TargetQuickStartChimeraService.g(targetQuickStartChimeraActivity);
                            }
                        });
                    } else {
                        B();
                        TargetQuickStartChimeraService.g(this);
                    }
                }
                onBackPressed();
                return;
            }
            if (i3 == 1) {
                arxoVar.d("User clicked 'Forgot PIN' or LSKF activity finished for other reasons.", new Object[0]);
                this.o.o(elob.TARGET_LSKF_SKIPPED);
                try {
                    this.p.e(QuickStartTargetEventData.a(10767));
                } catch (RemoteException e) {
                    i.l(e);
                }
                if (this.B) {
                    c(1003, Bundle.EMPTY);
                    return;
                }
                z();
                if (fsfn.m()) {
                    this.C.execute(new Runnable() { // from class: debc
                        @Override // java.lang.Runnable
                        public final void run() {
                            TargetQuickStartChimeraActivity targetQuickStartChimeraActivity = TargetQuickStartChimeraActivity.this;
                            targetQuickStartChimeraActivity.B();
                            TargetQuickStartChimeraService.g(targetQuickStartChimeraActivity);
                        }
                    });
                    return;
                } else {
                    B();
                    TargetQuickStartChimeraService.g(this);
                    return;
                }
            }
            if (i3 == -1) {
                long longExtra = intent != null ? intent.getLongExtra("gk_pw_handle", 0L) : 0L;
                fecj fecjVar = this.Q;
                boolean z = longExtra != 0;
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                elps elpsVar = (elps) fecjVar.b;
                elps elpsVar2 = elps.a;
                elpsVar.b = 1 | elpsVar.b;
                elpsVar.c = z;
                ddzf ddzfVar = this.o;
                elps elpsVar3 = (elps) fecjVar.Q();
                fecj t = ddzfVar.t(elob.USER_VERIFICATION_COMPLETED);
                if (!t.b.L()) {
                    t.U();
                }
                elpo elpoVar = (elpo) t.b;
                elpo elpoVar2 = elpo.a;
                elpsVar3.getClass();
                elpoVar.o = elpsVar3;
                elpoVar.b |= 32768;
                ddzfVar.k((elpo) t.Q());
                if (!this.B) {
                    if (longExtra != 0) {
                        arxoVar.d("GK_PW_HANDLE is set for resultsToSuw", new Object[0]);
                        Bundle bundle = this.G;
                        bundle.putLong("gk_pw_handle", longExtra);
                        bundle.putLong("gk_pw_handle_expiration_elapsed_mills", SystemClock.elapsedRealtime() + fsfn.e());
                        bundle.putInt("lskf_type", this.M);
                        return;
                    }
                    return;
                }
                AtomicReference atomicReference = this.F;
                Bundle bundle2 = (Bundle) atomicReference.get();
                bundle2.putLong("gk_pw_handle", longExtra);
                if (longExtra != 0) {
                    arxoVar.d("GK_PW_HANDLE is set for resultsToSuwAfterWifiReceivedBundle", new Object[0]);
                    bundle2.putLong("gk_pw_handle_expiration_elapsed_mills", SystemClock.elapsedRealtime() + fsfn.e());
                    bundle2.putInt("lskf_type", this.M);
                }
                atomicReference.set(bundle2);
                v();
            }
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        int i2;
        ddzf ddzfVar = this.o;
        switch (this.D) {
            case 101:
                i2 = 2;
                break;
            case 102:
                i2 = 3;
                break;
            case 103:
                i2 = 6;
                break;
            case 104:
                i2 = 4;
                break;
            case 105:
                i2 = 7;
                break;
            case 106:
                i2 = 5;
                break;
            case 107:
                i2 = 8;
                break;
            case 108:
                i2 = 9;
                break;
            case 109:
                i2 = 10;
                break;
            case 110:
                i2 = 11;
                break;
            case 111:
                i2 = 12;
                break;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /* 112 */:
                i2 = 13;
                break;
            case 113:
                i2 = 14;
                break;
            case 114:
                i2 = 15;
                break;
            default:
                i2 = 1;
                break;
        }
        ddzfVar.s(i2);
        int i3 = this.D;
        if (i3 == 106) {
            E();
            return;
        }
        if (i3 == 102) {
            RestoreAnytimeContext restoreAnytimeContext = this.N;
            if ((restoreAnytimeContext == null || TextUtils.isEmpty(restoreAnytimeContext.c)) && !this.O) {
                gI().R();
                this.D = 101;
                this.o.o(elob.SHOW_INSTRUCTION);
                return;
            } else {
                i.d("Back on 2nd restore or OTA reboot QR code page.", new Object[0]);
                setResult(0);
                this.o.o(elob.USER_CANCEL);
                finishAndRemoveTask();
                TargetQuickStartChimeraService.g(this);
                return;
            }
        }
        if (i3 == 103) {
            gI().R();
            this.D = 102;
            this.o.o(elob.SHOW_QR_FOR_PAIRING);
        } else {
            if (i3 == 105) {
                gI().R();
                this.D = 104;
                return;
            }
            i.d("Error code: %d", 0);
            setResult(0);
            this.o.o(elob.USER_CANCEL);
            int i4 = this.D;
            if (i4 == 101 || i4 == 107) {
                if (fsfn.m()) {
                    this.C.execute(new deax(this));
                } else {
                    B();
                }
            }
            finishAndRemoveTask();
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        arxo arxoVar = i;
        arxoVar.d("onConfigurationChanged()", new Object[0]);
        super.onConfigurationChanged(configuration);
        dg l = l();
        if (l instanceof degu) {
            arxoVar.d("AccountChallengeFragment is visible - reloading", new Object[0]);
            ((degu) l).x();
            return;
        }
        int i2 = this.D;
        if (i2 == 113) {
            arxoVar.h("Ignoring onConfigurationChanged at STATE_WIFI_RECEIVED.", new Object[0]);
            return;
        }
        if (i2 == 111) {
            arxoVar.h("Ignoring onConfigurationChanged during LSKF activity", new Object[0]);
            return;
        }
        dg m = m(i2);
        gI().R();
        bp bpVar = new bp(gI());
        getApplicationContext();
        bpVar.F(R.id.fragment_container, m);
        bpVar.w(null);
        bpVar.b();
    }

    @Override // defpackage.deao, defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        D2dOptions b;
        Bundle bundle2;
        super.onCreate(bundle);
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null) {
            String packageName = callingActivity.getPackageName();
            if (packageName.equals("com.google.android.gms") || packageName.equals("com.google.android.setupwizard")) {
                Trace.beginSection("smartdevice-TargetQuickStartActivity-onCreate()");
                if (fkhl.c()) {
                    arjz.a(this);
                }
                arkc.g(this);
                setContentView(R.layout.smartdevice_fragment_container);
                getWindow().addFlags(128);
                this.J = new deca(this);
                Intent intent = getIntent();
                this.m = intent.getStringExtra("smartdevice.theme");
                this.L = SystemClock.elapsedRealtime();
                if (fsfy.c() && intent.getIntExtra("suw_lifecycle", 0) == 5) {
                    i.d("Restore Anytime flow starts.", new Object[0]);
                    this.s = 2;
                    RestoreAnytimeContext restoreAnytimeContext = new RestoreAnytimeContext(edks.d(this, "source_device_name"), edks.d(this, "source_device_android_id_hash"));
                    this.N = restoreAnytimeContext;
                    if (!TextUtils.isEmpty(restoreAnytimeContext.c)) {
                        this.D = 102;
                    }
                }
                if (intent.getBooleanExtra("ota_has_detected_after_paired", false)) {
                    this.D = 102;
                    this.O = true;
                }
                if (intent.getExtras() != null && (bundle2 = (b = D2dOptions.b(intent.getExtras())).f) != null) {
                    boolean z = b.d;
                    String string = bundle2.getString("shared_secret");
                    this.w = z;
                    if (string != null) {
                        this.D = 104;
                        this.k = string;
                    }
                }
                long a = ddwc.a(this);
                this.K = a;
                i.h("onCreate(): SessionId: %d; Is deferred SUW: %b, state: %d", Long.valueOf(a), Boolean.valueOf(ddre.s(this)), Integer.valueOf(this.D));
                if (bundle == null) {
                    u(m(this.D));
                    if (this.D == 101 && fsfn.a.a().ad() && eigd.e(Build.MANUFACTURER, "google") && eigd.e(Build.TYPE, "userdebug") && !Build.MODEL.matches("Pixel [1-9]([^0-9]|$)*")) {
                        String str = SystemProperties.get("ro.boot.hardware.revision");
                        if (!TextUtils.isEmpty(str) && ((str.contains("EVT") || str.contains("PROTO")) && !SystemProperties.getBoolean("setupwizard.feature.quick_start_betocq_tests_passed", false))) {
                            new AlertDialog.Builder(this).setTitle(R.string.smartdevice_quick_start_target_evt_warning_dialog_title).setMessage(R.string.smartdevice_quick_start_target_evt_warning_dialog_description).setNegativeButton(R.string.common_ok, new DialogInterface.OnClickListener() { // from class: debd
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    arxo arxoVar = TargetQuickStartChimeraActivity.i;
                                    dialogInterface.dismiss();
                                }
                            }).show();
                        }
                    }
                }
                ddzf i2 = ddzf.i(this);
                this.o = i2;
                i2.b = this.K;
                elpn b2 = elpn.b(this.s);
                arwm.s(b2);
                i2.c = b2;
                new asmf(1, 9).execute(new Runnable() { // from class: debe
                    @Override // java.lang.Runnable
                    public final void run() {
                        Trace.beginSection("smartdevice-TargetQuickStartActivity-startAdvertising()");
                        ddxx ddxxVar = new ddxx();
                        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity = TargetQuickStartChimeraActivity.this;
                        ddxxVar.a = ddwc.a(targetQuickStartChimeraActivity);
                        ddxxVar.b = targetQuickStartChimeraActivity.getIntent().getStringExtra("BACKUP_BT_RFCOMM_SERVER_UUID");
                        if (targetQuickStartChimeraActivity.D == 104) {
                            String str2 = targetQuickStartChimeraActivity.k;
                            arwm.s(str2);
                            ddxxVar.b(str2, targetQuickStartChimeraActivity.w);
                        }
                        Trace.beginSection("smartdevice-TargetQuickStartActivity-startService()");
                        Intent intent2 = new Intent();
                        intent2.setClassName(targetQuickStartChimeraActivity, "com.google.android.gms.smartdevice.quickstart.TargetQuickStartService");
                        targetQuickStartChimeraActivity.startService(intent2);
                        Trace.endSection();
                        Trace.beginSection("smartdevice-TargetQuickStartActivity-bindService()");
                        targetQuickStartChimeraActivity.r = new debk(targetQuickStartChimeraActivity, ddxxVar);
                        asiu.a().d(targetQuickStartChimeraActivity, intent2, targetQuickStartChimeraActivity.r, 1);
                        Trace.endSection();
                        Trace.endSection();
                    }
                });
                this.x = ddqq.b(this);
                this.P = registerForActivityResult(new acl(), new abt() { // from class: debf
                    @Override // defpackage.abt
                    public final void jq(Object obj) {
                        TargetQuickStartChimeraActivity.this.t();
                    }
                });
                if (fsfe.c()) {
                    this.j.e();
                }
                Trace.endSection();
                return;
            }
        }
        i.m("Couldn't identify launcher, finishing activity.", new Object[0]);
        finishAndRemoveTask();
    }

    @Override // defpackage.deao, defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        i.d("Unbinding Service", new Object[0]);
        try {
            try {
                Trace.beginSection("smartdevice-TargetQuickStartActivity-unbindService()");
                if (this.r != null) {
                    asiu.a().b(this, this.r);
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                i.l(e);
            }
            super.onDestroy();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        i.d("onPause()", new Object[0]);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        i.d("onResume()", new Object[0]);
    }

    final void p(final int i2, final Intent intent) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.L;
        if (fsfn.d() > 0) {
            i.d("Activity elapsed time: %dms", Long.valueOf(elapsedRealtime));
            Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() { // from class: deaw
                @Override // java.lang.Runnable
                public final void run() {
                    TargetQuickStartChimeraActivity targetQuickStartChimeraActivity = TargetQuickStartChimeraActivity.this;
                    targetQuickStartChimeraActivity.setResult(i2, intent);
                    targetQuickStartChimeraActivity.finish();
                }
            }, Math.max(fsfn.d() - elapsedRealtime, 0L), TimeUnit.MILLISECONDS);
        } else {
            setResult(i2, intent);
            finish();
        }
    }

    public final void q(int i2) {
        int i3 = this.D;
        if (i3 == 111) {
            finishActivity(13);
            if (i2 != 10770) {
                x();
                return;
            }
            if (this.B) {
                i.j("Skip to manual sign-in as user exceeded LSKF guess limit before WiFi transfer.", new Object[0]);
            } else {
                i.j("No accounts were transferred as user exceeded LSKF guess limit.", new Object[0]);
            }
            this.D = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            u(m(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS));
            return;
        }
        switch (i3) {
            case 101:
            case 102:
            case 103:
            case 107:
                if (i2 != 10804) {
                    c(1003, Bundle.EMPTY);
                    break;
                }
                break;
            case 104:
            case 106:
                if (i2 != 10595) {
                    w();
                    break;
                } else {
                    if (fsfn.m()) {
                        this.C.execute(new deax(this));
                    } else {
                        B();
                    }
                    z();
                    break;
                }
            case 105:
                z();
                break;
        }
    }

    public final void r(VerificationInfo verificationInfo) {
        int i2 = this.D;
        if (i2 != 101 && i2 != 102) {
            i.m(a.j(i2, "Unexpected state "), new Object[0]);
            return;
        }
        dekr x = dekr.x(elta.b(verificationInfo.b), verificationInfo.a, false, false, dcxh.UNKNOWN);
        this.D = 107;
        u(x);
    }

    public final void s() {
        int i2 = this.D;
        if (i2 != 101) {
            i.m(a.j(i2, "Unexpected state "), new Object[0]);
            return;
        }
        this.o.o(elob.PROCEED_TO_QR);
        this.D = 102;
        u(m(102));
    }

    public final void t() {
        Queue queue = this.y;
        if (!queue.isEmpty()) {
            this.o.o(elob.SETUP_MANAGED_ACCOUNT);
            Intent intent = (Intent) queue.poll();
            abv abvVar = this.P;
            arwm.s(intent);
            abvVar.b(intent);
            return;
        }
        Bundle bundle = this.G;
        this.D = 110;
        i.d("QA latency - complete account transfer timestamp: %d", Long.valueOf(SystemClock.elapsedRealtime()));
        if (!fsfn.x()) {
            this.o.m((elnq) this.H.Q());
        }
        Intent intent2 = new Intent();
        intent2.putExtras(bundle);
        p(-1, intent2);
    }

    public final void u(dg dgVar) {
        bp bpVar = new bp(gI());
        if (!demq.b(this)) {
            getApplicationContext();
            if (dgVar instanceof deag) {
                bpVar.G(android.R.anim.fade_in, android.R.anim.fade_out);
            } else {
                bpVar.A(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
            }
        }
        bpVar.F(R.id.fragment_container, dgVar);
        bpVar.w(null);
        bpVar.b();
    }

    public final void v() {
        Bundle bundle = (Bundle) this.F.get();
        if (this.B && (!bundle.containsKey("wifi_network") || !bundle.containsKey("gk_pw_handle"))) {
            i.d("Result bundle for SuW is not ready. Has WiFi: %s, has lskf HAT: %s", Boolean.valueOf(bundle.containsKey("wifi_network")), Boolean.valueOf(bundle.containsKey("gk_pw_handle")));
            return;
        }
        arxo arxoVar = i;
        arxoVar.d("Result bundle for SuW is ready, return to SuW.", new Object[0]);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
        arxoVar.d("QA latency - return wifi timestamp: %d", Long.valueOf(SystemClock.elapsedRealtime()));
        this.o.o(elob.RETURN_TO_SUW);
        finish();
    }

    public final void w() {
        i.j("No accounts were transferred", new Object[0]);
        this.D = 109;
        C();
        u(m(this.D));
    }

    public final void x() {
        if (this.B) {
            i.m("Target LSKF failed before WiFi transfer.", new Object[0]);
        } else {
            i.m("Target LSKF failed after WiFi transfer.", new Object[0]);
        }
        this.D = 114;
        u(m(114));
    }

    public final void y() {
        i.j("Partial accounts failed to transfer", new Object[0]);
        this.o.o(elob.PARTIAL_ACCOUNT_TRANSFER_FAILED);
        this.D = 108;
        C();
        u(m(this.D));
    }

    public final void z() {
        this.D = 109;
        this.o.o(elob.SKIP_TO_MINUTE_MAID);
        int i2 = 1;
        if (fsfy.a.a().g() && ddre.s(this) && bqna.b(this).p("com.google").length > 0) {
            i2 = 104;
        }
        Intent intent = new Intent();
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            i.d("Adding notTransferredAccounts to intent", new Object[0]);
            intent.putExtra("failedTransferAccount", TextUtils.isEmpty(this.A) ? ((BootstrapAccount) this.I.get(0)).b : this.A);
        }
        p(i2, intent);
    }

    @Override // defpackage.edjy
    public final void jw() {
    }
}
