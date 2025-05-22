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
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.atmo;
import defpackage.atmr;
import defpackage.atzb;
import defpackage.auad;
import defpackage.aumo;
import defpackage.aupz;
import defpackage.bp;
import defpackage.bsup;
import defpackage.cbiq;
import defpackage.dfim;
import defpackage.dfvm;
import defpackage.dfyj;
import defpackage.dfyw;
import defpackage.dfyy;
import defpackage.dfzy;
import defpackage.dg;
import defpackage.dgbu;
import defpackage.dgbv;
import defpackage.dgcj;
import defpackage.dggp;
import defpackage.dggv;
import defpackage.dghc;
import defpackage.dghh;
import defpackage.dgkj;
import defpackage.dgli;
import defpackage.dglk;
import defpackage.dgls;
import defpackage.dgmc;
import defpackage.dgmt;
import defpackage.dgnd;
import defpackage.dgrw;
import defpackage.dgrx;
import defpackage.dguu;
import defpackage.dgvu;
import defpackage.dgxt;
import defpackage.dgyt;
import defpackage.dwiv;
import defpackage.dwiw;
import defpackage.efwt;
import defpackage.efxo;
import defpackage.ekti;
import defpackage.eobc;
import defpackage.eobe;
import defpackage.eobp;
import defpackage.eodb;
import defpackage.eodc;
import defpackage.eodg;
import defpackage.eogo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmya;
import defpackage.fvab;
import defpackage.fvak;
import defpackage.fvav;
import defpackage.iri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TargetQuickStartChimeraActivity extends dgls implements dfyy, efwt, dgrw {
    public static final auad i = new dgyt(new String[]{"TargetQuickStartChimeraActivity"});
    public String A;
    public BootstrapCompletionResult E;
    private ArrayList I;
    private dgnd J;
    private long K;
    private long L;
    private RestoreAnytimeContext N;
    private aca P;
    public cbiq j;
    public String k;
    public String l;
    public String m;
    public dgrx n;
    public dgkj o;
    public dggv p;
    public dggp q;
    public ServiceConnection r;
    public int u;
    public VerificationInfo v;
    public dfvm x;
    public List z;
    public int s = 0;
    public int t = 0;
    public boolean w = false;
    private final int M = -1;
    private boolean O = false;
    public final Queue y = new ArrayDeque();
    private final fgrc Q = eodg.a.v();
    public final fgrc H = eobe.a.v();
    public boolean B = false;
    public final ExecutorService C = new aupz(2, 9);
    public int D = 101;
    public final AtomicReference F = new AtomicReference(new Bundle());
    public final Bundle G = new Bundle();

    private final void C() {
        auad auadVar = i;
        auadVar.d("findNotTransferredAccounts()", new Object[0]);
        try {
            List<BootstrapAccount> a = this.p.a();
            if (a == null) {
                auadVar.d("sourceBootstrapAccounts is null", new Object[0]);
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
                        if (dgcj.r(bootstrapAccount.b, ((Account) it.next()).name)) {
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
        if (ekti.e(Build.MANUFACTURER, "samsung")) {
            this.J.c((byte) 2);
        } else {
            this.J.c((byte) 1);
        }
    }

    private final void E() {
        dgrx dgrxVar = this.n;
        if (dgrxVar != null) {
            dgrxVar.y();
        }
    }

    @Override // defpackage.dgrw
    public final void A(List list) {
        this.t = this.u - list.size();
        fgrc v = eobc.a.v();
        int i2 = this.u;
        if (!v.b.L()) {
            v.U();
        }
        eobc eobcVar = (eobc) v.b;
        eobcVar.b |= 1;
        eobcVar.c = i2;
        int size = list.size();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eobc eobcVar2 = (eobc) fgriVar;
        eobcVar2.b |= 2;
        eobcVar2.d = size;
        int i3 = this.t;
        if (!fgriVar.L()) {
            v.U();
        }
        eobc eobcVar3 = (eobc) v.b;
        eobcVar3.b |= 4;
        eobcVar3.e = i3;
        this.o.l((eobc) v.Q());
        try {
            this.p.e(new QuickStartTargetEventData(14, null, null, 0, false, null, 0, null, false, list, 0));
        } catch (RemoteException e) {
            i.l(e);
        }
    }

    public final void B() {
        i.d("stopAdvertisingAndDisconnect()", new Object[0]);
        dggv dggvVar = this.p;
        if (dggvVar != null) {
            try {
                dggvVar.m();
            } catch (RemoteException e) {
                i.m("RemoteException ".concat(e.toString()), new Object[0]);
            }
        }
    }

    @Override // defpackage.dfyy
    public final void c(int i2, Bundle bundle) {
        auad auadVar = i;
        auadVar.d("onAction() with actionId: %d", Integer.valueOf(i2));
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
                auadVar.d("User skips on instruction page.", new Object[0]);
                this.J.b((byte) 4);
                if (ekti.e(Build.MANUFACTURER, "samsung")) {
                    this.J.c((byte) 2);
                } else {
                    this.J.c((byte) 1);
                }
                this.o.o(eobp.SKIP_PAIR);
                setResult(1);
                break;
            case 1002:
                auadVar.d("User skips on QR page.", new Object[0]);
                D();
                this.o.o(eobp.SKIP_IN_QR);
                setResult(1);
                break;
            case 1003:
                auadVar.d("Programmatically skips to manual setup.", new Object[0]);
                D();
                this.o.o(eobp.SKIP_PROGRAMMATICALLY);
                setResult(102);
                break;
            case 1004:
                auadVar.d("User proceeds to iOS.", new Object[0]);
                this.J.b((byte) 1);
                if (ekti.e(Build.MANUFACTURER, "samsung")) {
                    this.J.c((byte) 2);
                } else {
                    this.J.c((byte) 1);
                }
                this.o.o(eobp.PROCEED_TO_IOS);
                setResult(101);
                break;
            case 1005:
                auadVar.d("Restore Anytime not supported by source device, return to SUW", new Object[0]);
                D();
                Intent intent = new Intent();
                intent.putExtras(bundle);
                setResult(105, intent);
                break;
            default:
                finish();
                return;
        }
        if (fvak.m()) {
            this.C.execute(new Runnable() { // from class: dgmd
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

    @Override // defpackage.efwt
    public final void gH() {
        onBackPressed();
    }

    public final dg l() {
        return gY().g(R.id.fragment_container);
    }

    public final dg m(int i2) {
        String string;
        CharSequence p;
        int i3 = R.string.smartdevice_restore_anytime_restore_from_backup_button;
        switch (i2) {
            case 101:
                dgmt dgmtVar = new dgmt();
                if (this.N != null) {
                    dgmtVar.b = getString(R.string.smartdevice_restore_anytime_instruction_title);
                    dgmtVar.g(dghc.v(this), getString(R.string.smartdevice_restore_anytime_restore_from_backup_button));
                } else {
                    dgmtVar.b = dghc.u(this);
                    dgmtVar.c = dghc.r(this);
                    dgmtVar.g(dghc.v(this), dghc.s(this));
                }
                dgmtVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
                dgmtVar.d = 3;
                dgmtVar.e = 1004;
                dgmtVar.f = this.N;
                return dgmtVar.f();
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
                    p = dghc.p(this);
                    i3 = R.string.common_skip;
                }
                String str = this.l;
                Bundle bundle = new Bundle();
                bundle.putString("deeplinkUrl", str);
                bundle.putInt("negativeButtonStringRes", i3);
                bundle.putInt("negativeButtonActionId", 1002);
                bundle.putString("title", string);
                bundle.putCharSequence("description", p);
                dguu dguuVar = new dguu();
                dguuVar.setArguments(bundle);
                return dguuVar;
            case 103:
            case 105:
                int i4 = iri.a;
                dfzy dfzyVar = new dfzy();
                dfzyVar.b = getString(R.string.smartdevice_d2d_target_continue_description);
                dfzyVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
                return dfzyVar.a();
            case 104:
                int i5 = iri.a;
                dfyw dfywVar = new dfyw(null);
                dfywVar.b = getString(R.string.smartdevice_getting_account_info);
                dfywVar.a = R.drawable.quantum_gm_ic_account_circle_vd_theme_24;
                return dfywVar.b();
            case 106:
            case 110:
            case 111:
            case 113:
            default:
                throw new IllegalStateException(a.j(i2, "Unexpected state "));
            case 107:
                VerificationInfo verificationInfo = this.v;
                return dgvu.x(eogo.b(verificationInfo.b), verificationInfo.a, false, false, dfim.UNKNOWN);
            case 108:
            case 109:
                ArrayList arrayList = this.I;
                if (arrayList == null || arrayList.isEmpty()) {
                    dfzy dfzyVar2 = new dfzy();
                    dfzyVar2.a = R.drawable.googleg_standard_color_48_vd;
                    dfzyVar2.e(getString(R.string.common_next), 3);
                    dfzyVar2.b = getString(R.string.smartdevice_quick_start_failed_account_transfer_title);
                    dfzyVar2.c = i2 == 108 ? getString(R.string.smartdevice_quick_start_account_transfer_failed_description) : getString(R.string.smartdevice_quick_start_all_accounts_transfer_failed_description);
                    return dfzyVar2.a();
                }
                i.d("Showing detailed account transfer failed page", new Object[0]);
                ArrayList arrayList2 = new ArrayList(this.I.size());
                ArrayList arrayList3 = this.I;
                int size = arrayList3.size();
                for (int i6 = 0; i6 < size; i6++) {
                    BootstrapAccount bootstrapAccount = (BootstrapAccount) arrayList3.get(i6);
                    dwiv a = dwiw.a();
                    a.b(bootstrapAccount.b);
                    arrayList2.add(new ParcelableDeviceOwner(a.a(), null));
                }
                dgli dgliVar = new dgli();
                dgliVar.b = getString(R.string.smartdevice_quick_start_failed_account_transfer_title);
                dgliVar.c = i2 == 108 ? getString(R.string.smartdevice_quick_start_account_transfer_failed_description) : getString(R.string.smartdevice_quick_start_all_accounts_transfer_failed_description);
                dgliVar.a = R.drawable.googleg_standard_color_48_vd;
                dgliVar.d(getString(R.string.common_next), 3);
                dgliVar.d = arrayList2;
                return dgliVar.f();
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /* 112 */:
                dfzy dfzyVar3 = new dfzy();
                dfzyVar3.b = getString(R.string.smartdevice_quick_start_lskf_guess_limit_exceeded_title);
                dfzyVar3.a = R.drawable.gs_error_vd_theme_48;
                if (this.B) {
                    dfzyVar3.c = getString(R.string.smartdevice_quick_start_target_lskf_failed_before_wifi_description);
                    dfzyVar3.e(getString(R.string.common_next), 1003);
                } else {
                    dfzyVar3.c = getString(R.string.smartdevice_quick_start_all_accounts_transfer_failed_description);
                    dfzyVar3.e(getString(R.string.common_next), 3);
                }
                return dfzyVar3.a();
            case 114:
                dfzy dfzyVar4 = new dfzy();
                dfzyVar4.a = R.drawable.gs_error_vd_theme_48;
                if (this.B) {
                    dfzyVar4.b = getString(R.string.common_something_went_wrong);
                    dfzyVar4.c = getString(R.string.smartdevice_quick_start_target_lskf_failed_before_wifi_description);
                    dfzyVar4.e(getString(R.string.common_next), 1003);
                } else {
                    dfzyVar4.b = getString(R.string.smartdevice_quick_start_failed_account_transfer_title);
                    dfzyVar4.c = getString(R.string.smartdevice_quick_start_all_accounts_transfer_failed_description);
                    dfzyVar4.e(getString(R.string.common_next), 3);
                }
                return dfzyVar4.a();
        }
    }

    public final void n(final List list) {
        ((aupz) this.C).submit(new Runnable() { // from class: dgme
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
                        dfvm dfvmVar = targetQuickStartChimeraActivity.x;
                        BootstrapCompletionResult bootstrapCompletionResult = targetQuickStartChimeraActivity.E;
                        int i2 = 0;
                        int i3 = bootstrapCompletionResult == null ? 0 : bootstrapCompletionResult.f;
                        if (i3 == 3) {
                            i2 = 2;
                        } else if (i3 == 4) {
                            i2 = 1;
                        }
                        Intent a = dfvmVar.a(account, bundle, new ManagedAuthOptions(i2, 4));
                        if (a != null) {
                            targetQuickStartChimeraActivity.y.add(a);
                        }
                    }
                }
                targetQuickStartChimeraActivity.runOnUiThread(new Runnable() { // from class: dgmf
                    @Override // java.lang.Runnable
                    public final void run() {
                        TargetQuickStartChimeraActivity.this.t();
                    }
                });
            }
        });
    }

    @Override // defpackage.dgrw
    public final void o(int i2) {
        fgrc v = dfyj.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        dfyj dfyjVar = (dfyj) fgriVar;
        dfyjVar.c = 5;
        dfyjVar.b |= 1;
        if (!fgriVar.L()) {
            v.U();
        }
        dfyj dfyjVar2 = (dfyj) v.b;
        dfyjVar2.b |= 2;
        dfyjVar2.d = i2;
        this.o.n(10599, (dfyj) v.Q());
        if (this.D == 106) {
            E();
        }
        try {
            this.p.e(QuickStartTargetEventData.a(10599));
        } catch (RemoteException e) {
            i.l(e);
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        auad auadVar = i;
        auadVar.d("onActivityResult requestCode: %d, resultCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        super.onActivityResult(i2, i3, intent);
        if (i2 == 13) {
            if (i3 == -1) {
                new dgbu(getApplicationContext()).c(2);
            } else {
                new dgbu(getApplicationContext()).c(3);
            }
            int i4 = this.D;
            if (i4 == 109 || i4 == 114 || i4 == 112) {
                return;
            }
            this.D = 104;
            if (i3 == 0) {
                auadVar.d("User clicked back button on target LSKF page", new Object[0]);
                if (this.B) {
                    if (fvak.m()) {
                        this.C.execute(new Runnable() { // from class: dgmg
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
                auadVar.d("User clicked 'Forgot PIN' or LSKF activity finished for other reasons.", new Object[0]);
                this.o.o(eobp.TARGET_LSKF_SKIPPED);
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
                if (fvak.m()) {
                    this.C.execute(new Runnable() { // from class: dgmh
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
                fgrc fgrcVar = this.Q;
                boolean z = longExtra != 0;
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                eodg eodgVar = (eodg) fgrcVar.b;
                eodg eodgVar2 = eodg.a;
                eodgVar.b = 1 | eodgVar.b;
                eodgVar.c = z;
                dgkj dgkjVar = this.o;
                eodg eodgVar3 = (eodg) fgrcVar.Q();
                fgrc t = dgkjVar.t(eobp.USER_VERIFICATION_COMPLETED);
                if (!t.b.L()) {
                    t.U();
                }
                eodc eodcVar = (eodc) t.b;
                eodc eodcVar2 = eodc.a;
                eodgVar3.getClass();
                eodcVar.o = eodgVar3;
                eodcVar.b |= 32768;
                dgkjVar.k((eodc) t.Q());
                if (!this.B) {
                    if (longExtra != 0) {
                        auadVar.d("GK_PW_HANDLE is set for resultsToSuw", new Object[0]);
                        Bundle bundle = this.G;
                        bundle.putLong("gk_pw_handle", longExtra);
                        bundle.putLong("gk_pw_handle_expiration_elapsed_mills", SystemClock.elapsedRealtime() + fvak.e());
                        bundle.putInt("lskf_type", this.M);
                        return;
                    }
                    return;
                }
                AtomicReference atomicReference = this.F;
                Bundle bundle2 = (Bundle) atomicReference.get();
                bundle2.putLong("gk_pw_handle", longExtra);
                if (longExtra != 0) {
                    auadVar.d("GK_PW_HANDLE is set for resultsToSuwAfterWifiReceivedBundle", new Object[0]);
                    bundle2.putLong("gk_pw_handle_expiration_elapsed_mills", SystemClock.elapsedRealtime() + fvak.e());
                    bundle2.putInt("lskf_type", this.M);
                }
                atomicReference.set(bundle2);
                v();
            }
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        int i2;
        dgkj dgkjVar = this.o;
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
        dgkjVar.s(i2);
        int i3 = this.D;
        if (i3 == 106) {
            E();
            return;
        }
        if (i3 == 102) {
            RestoreAnytimeContext restoreAnytimeContext = this.N;
            if ((restoreAnytimeContext == null || TextUtils.isEmpty(restoreAnytimeContext.c)) && !this.O) {
                gY().R();
                this.D = 101;
                this.o.o(eobp.SHOW_INSTRUCTION);
                return;
            } else {
                i.d("Back on 2nd restore or OTA reboot QR code page.", new Object[0]);
                setResult(0);
                this.o.o(eobp.USER_CANCEL);
                finishAndRemoveTask();
                TargetQuickStartChimeraService.g(this);
                return;
            }
        }
        if (i3 == 103) {
            gY().R();
            this.D = 102;
            this.o.o(eobp.SHOW_QR_FOR_PAIRING);
        } else {
            if (i3 == 105) {
                gY().R();
                this.D = 104;
                return;
            }
            i.d("Error code: %d", 0);
            setResult(0);
            this.o.o(eobp.USER_CANCEL);
            int i4 = this.D;
            if (i4 == 101 || i4 == 107) {
                if (fvak.m()) {
                    this.C.execute(new dgmc(this));
                } else {
                    B();
                }
            }
            finishAndRemoveTask();
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        auad auadVar = i;
        auadVar.d("onConfigurationChanged()", new Object[0]);
        super.onConfigurationChanged(configuration);
        dg l = l();
        if (l instanceof dgrx) {
            auadVar.d("AccountChallengeFragment is visible - reloading", new Object[0]);
            ((dgrx) l).x();
            return;
        }
        int i2 = this.D;
        if (i2 == 113) {
            auadVar.h("Ignoring onConfigurationChanged at STATE_WIFI_RECEIVED.", new Object[0]);
            return;
        }
        if (i2 == 111) {
            auadVar.h("Ignoring onConfigurationChanged during LSKF activity", new Object[0]);
            return;
        }
        dg m = m(i2);
        gY().R();
        bp bpVar = new bp(gY());
        getApplicationContext();
        bpVar.F(R.id.fragment_container, m);
        bpVar.w(null);
        bpVar.b();
    }

    @Override // defpackage.dgls, defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        D2dOptions b;
        Bundle bundle2;
        super.onCreate(bundle);
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null) {
            String packageName = callingActivity.getPackageName();
            if (packageName.equals("com.google.android.gms") || packageName.equals("com.google.android.setupwizard")) {
                Trace.beginSection("smartdevice-TargetQuickStartActivity-onCreate()");
                if (fmya.c()) {
                    atmo.a(this);
                }
                atmr.g(this);
                setContentView(R.layout.smartdevice_fragment_container);
                getWindow().addFlags(128);
                this.J = new dgnd(this);
                Intent intent = getIntent();
                this.m = intent.getStringExtra("smartdevice.theme");
                this.L = SystemClock.elapsedRealtime();
                if (fvav.c() && intent.getIntExtra("suw_lifecycle", 0) == 5) {
                    i.d("Restore Anytime flow starts.", new Object[0]);
                    this.s = 2;
                    RestoreAnytimeContext restoreAnytimeContext = new RestoreAnytimeContext(efxo.d(this, "source_device_name"), efxo.d(this, "source_device_android_id_hash"));
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
                long a = dghh.a(this);
                this.K = a;
                i.h("onCreate(): SessionId: %d; Is deferred SUW: %b, state: %d", Long.valueOf(a), Boolean.valueOf(dgcj.s(this)), Integer.valueOf(this.D));
                if (bundle == null) {
                    u(m(this.D));
                    if (this.D == 101 && fvak.a.lK().ac() && ekti.e(Build.MANUFACTURER, "google") && ekti.e(Build.TYPE, "userdebug") && !Build.MODEL.matches("Pixel [1-9]([^0-9]|$)*")) {
                        String str = SystemProperties.get("ro.boot.hardware.revision");
                        if (!TextUtils.isEmpty(str) && ((str.contains("EVT") || str.contains("PROTO")) && !SystemProperties.getBoolean("setupwizard.feature.quick_start_betocq_tests_passed", false))) {
                            new AlertDialog.Builder(this).setTitle(R.string.smartdevice_quick_start_target_evt_warning_dialog_title).setMessage(R.string.smartdevice_quick_start_target_evt_warning_dialog_description).setNegativeButton(R.string.common_ok, new DialogInterface.OnClickListener() { // from class: dgmi
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    auad auadVar = TargetQuickStartChimeraActivity.i;
                                    dialogInterface.dismiss();
                                }
                            }).show();
                        }
                    }
                }
                dgkj i2 = dgkj.i(this);
                this.o = i2;
                i2.b = this.K;
                eodb b2 = eodb.b(this.s);
                atzb.s(b2);
                i2.c = b2;
                new aupz(1, 9).execute(new Runnable() { // from class: dgmj
                    @Override // java.lang.Runnable
                    public final void run() {
                        Trace.beginSection("smartdevice-TargetQuickStartActivity-startAdvertising()");
                        dgjb dgjbVar = new dgjb();
                        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity = TargetQuickStartChimeraActivity.this;
                        dgjbVar.a = dghh.a(targetQuickStartChimeraActivity);
                        dgjbVar.b = targetQuickStartChimeraActivity.getIntent().getStringExtra("BACKUP_BT_RFCOMM_SERVER_UUID");
                        if (targetQuickStartChimeraActivity.D == 104) {
                            String str2 = targetQuickStartChimeraActivity.k;
                            atzb.s(str2);
                            dgjbVar.b(str2, targetQuickStartChimeraActivity.w);
                        }
                        Trace.beginSection("smartdevice-TargetQuickStartActivity-startService()");
                        Intent intent2 = new Intent();
                        intent2.setClassName(targetQuickStartChimeraActivity, "com.google.android.gms.smartdevice.quickstart.TargetQuickStartService");
                        targetQuickStartChimeraActivity.startService(intent2);
                        Trace.endSection();
                        Trace.beginSection("smartdevice-TargetQuickStartActivity-bindService()");
                        targetQuickStartChimeraActivity.r = new dgmo(targetQuickStartChimeraActivity, dgjbVar);
                        aumo.a().d(targetQuickStartChimeraActivity, intent2, targetQuickStartChimeraActivity.r, 1);
                        Trace.endSection();
                        Trace.endSection();
                    }
                });
                this.x = dgbv.b(this);
                this.P = registerForActivityResult(new acq(), new aby() { // from class: dgmb
                    @Override // defpackage.aby
                    public final void jF(Object obj) {
                        TargetQuickStartChimeraActivity.this.t();
                    }
                });
                if (fvab.c()) {
                    this.j.e();
                }
                Trace.endSection();
                return;
            }
        }
        i.m("Couldn't identify launcher, finishing activity.", new Object[0]);
        finishAndRemoveTask();
    }

    @Override // defpackage.dgls, defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        i.d("Unbinding Service", new Object[0]);
        try {
            try {
                Trace.beginSection("smartdevice-TargetQuickStartActivity-unbindService()");
                if (this.r != null) {
                    aumo.a().b(this, this.r);
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                i.l(e);
            }
            super.onDestroy();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        i.d("onPause()", new Object[0]);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        i.d("onResume()", new Object[0]);
    }

    final void p(final int i2, final Intent intent) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.L;
        if (fvak.d() > 0) {
            i.d("Activity elapsed time: %dms", Long.valueOf(elapsedRealtime));
            Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() { // from class: dgma
                @Override // java.lang.Runnable
                public final void run() {
                    TargetQuickStartChimeraActivity targetQuickStartChimeraActivity = TargetQuickStartChimeraActivity.this;
                    targetQuickStartChimeraActivity.setResult(i2, intent);
                    targetQuickStartChimeraActivity.finish();
                }
            }, Math.max(fvak.d() - elapsedRealtime, 0L), TimeUnit.MILLISECONDS);
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
                    if (fvak.m()) {
                        this.C.execute(new dgmc(this));
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
        dgvu x = dgvu.x(eogo.b(verificationInfo.b), verificationInfo.a, false, false, dfim.UNKNOWN);
        this.D = 107;
        u(x);
    }

    public final void s() {
        int i2 = this.D;
        if (i2 != 101) {
            i.m(a.j(i2, "Unexpected state "), new Object[0]);
            return;
        }
        this.o.o(eobp.PROCEED_TO_QR);
        this.D = 102;
        u(m(102));
    }

    public final void t() {
        Queue queue = this.y;
        if (!queue.isEmpty()) {
            this.o.o(eobp.SETUP_MANAGED_ACCOUNT);
            Intent intent = (Intent) queue.poll();
            aca acaVar = this.P;
            atzb.s(intent);
            acaVar.b(intent);
            return;
        }
        Bundle bundle = this.G;
        this.D = 110;
        i.d("QA latency - complete account transfer timestamp: %d", Long.valueOf(SystemClock.elapsedRealtime()));
        if (!fvak.w()) {
            this.o.m((eobe) this.H.Q());
        }
        Intent intent2 = new Intent();
        intent2.putExtras(bundle);
        p(-1, intent2);
    }

    public final void u(dg dgVar) {
        bp bpVar = new bp(gY());
        if (!dgxt.b(this)) {
            getApplicationContext();
            if (dgVar instanceof dglk) {
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
        auad auadVar = i;
        auadVar.d("Result bundle for SuW is ready, return to SuW.", new Object[0]);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
        auadVar.d("QA latency - return wifi timestamp: %d", Long.valueOf(SystemClock.elapsedRealtime()));
        this.o.o(eobp.RETURN_TO_SUW);
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
        this.o.o(eobp.PARTIAL_ACCOUNT_TRANSFER_FAILED);
        this.D = 108;
        C();
        u(m(this.D));
    }

    public final void z() {
        this.D = 109;
        this.o.o(eobp.SKIP_TO_MINUTE_MAID);
        int i2 = 1;
        if (fvav.a.lK().g() && dgcj.s(this) && bsup.b(this).p("com.google").length > 0) {
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

    @Override // defpackage.efwt
    public final void jM() {
    }
}
