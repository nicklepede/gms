package com.google.android.gms.smartdevice.d2d.ui;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.auad;
import defpackage.aupz;
import defpackage.bp;
import defpackage.dfim;
import defpackage.dfvm;
import defpackage.dfvx;
import defpackage.dfxf;
import defpackage.dfyy;
import defpackage.dfzk;
import defpackage.dfzl;
import defpackage.dfzt;
import defpackage.dfzu;
import defpackage.dfzy;
import defpackage.dg;
import defpackage.dgak;
import defpackage.dgcj;
import defpackage.dgrs;
import defpackage.dgvu;
import defpackage.dgyt;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.emnp;
import defpackage.emnq;
import defpackage.eogo;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fmtw;
import defpackage.fvae;
import defpackage.ip;
import defpackage.itn;
import defpackage.ryb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetChimeraActivity extends ryb implements dgrs, dfyy {
    public static final auad h = new dgyt(new String[]{"D2D", "UI", "TargetChimeraActivity"});
    private String A;
    private eogo B;
    private String C;
    public String i;
    public boolean m;
    public boolean n;
    public dfvm p;
    public BootstrapCompletionResult r;
    public ResultReceiver s;
    private Bundle t;
    private dgak u;
    private dfvx v;
    private dfzl x;
    private dfzl y;
    private D2dOptions z;
    final ExecutorService j = new aupz(1, 9);
    public final Queue k = new ArrayDeque();
    public int l = 1;
    private boolean w = false;
    public volatile Future o = null;
    public boolean q = false;

    private final dfzl u() {
        return new dfzk(this, this, gY(), this.A);
    }

    private final void v(final Bundle bundle, final List list) {
        h.d("configureDeviceManagementOrFinish", new Object[0]);
        this.w = true;
        if (!fvae.l()) {
            l(bundle);
        } else if (list == null) {
            l(bundle);
        } else {
            this.o = ((aupz) this.j).submit(new Runnable() { // from class: dfzs
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [int] */
                /* JADX WARN: Type inference failed for: r5v3 */
                /* JADX WARN: Type inference failed for: r5v4 */
                @Override // java.lang.Runnable
                public final void run() {
                    Bundle bundle2 = new Bundle();
                    final TargetChimeraActivity targetChimeraActivity = TargetChimeraActivity.this;
                    bundle2.putString("theme", targetChimeraActivity.i);
                    for (Account account : list) {
                        if (targetChimeraActivity.p.c(account)) {
                            dfvm dfvmVar = targetChimeraActivity.p;
                            boolean z = targetChimeraActivity.m;
                            BootstrapCompletionResult bootstrapCompletionResult = targetChimeraActivity.r;
                            int i = bootstrapCompletionResult == null ? 0 : bootstrapCompletionResult.f;
                            ?? r5 = z;
                            if (i == 3) {
                                r5 = 2;
                            } else if (i == 4) {
                                r5 = 1;
                            }
                            Intent a = dfvmVar.a(account, bundle2, new ManagedAuthOptions(r5, true != targetChimeraActivity.s() ? 3 : 4));
                            if (a != null) {
                                targetChimeraActivity.k.add(a);
                            }
                        }
                    }
                    final Bundle bundle3 = bundle;
                    targetChimeraActivity.runOnUiThread(new Runnable() { // from class: dfzr
                        @Override // java.lang.Runnable
                        public final void run() {
                            TargetChimeraActivity targetChimeraActivity2 = TargetChimeraActivity.this;
                            if (targetChimeraActivity2.k.isEmpty()) {
                                targetChimeraActivity2.l(bundle3);
                            } else {
                                targetChimeraActivity2.t(false);
                            }
                        }
                    });
                    targetChimeraActivity.o = null;
                }
            });
        }
    }

    private final void w() {
        emnq a;
        h.d("logD2dEvent()", new Object[0]);
        dgak dgakVar = this.u;
        if (dgakVar == null || (a = dgakVar.aj.a(getApplicationContext(), dgakVar.an)) == null) {
            return;
        }
        dgak.a.j("Sent D2DEvent\n%s", a);
    }

    @Override // defpackage.dfyy
    public final void c(int i, Bundle bundle) {
        auad auadVar = h;
        auadVar.d("onAction %d", Integer.valueOf(i));
        if (i == 116) {
            String string = bundle.getString("deviceName");
            if (string != null) {
                this.A = string;
            }
            i = 116;
        }
        dfzl dfzlVar = this.y;
        if (dfzlVar != null && dfzlVar.h(i)) {
            dfzlVar.c(i, bundle);
            if (i == 116) {
                auadVar.h("Updating primary with device name", new Object[0]);
                this.x.c(116, bundle);
                return;
            }
            return;
        }
        if (this.x.h(i)) {
            this.x.c(i, bundle);
            return;
        }
        Integer valueOf = Integer.valueOf(i);
        auadVar.j("Handling action %d", valueOf);
        switch (i) {
            case 108:
            case 118:
                r();
                return;
            case 109:
            case 110:
            case 114:
            case 116:
            default:
                auadVar.m("Unknown action %d", valueOf);
                return;
            case 111:
                if (this.l == 8) {
                    auadVar.m("Already connected", new Object[0]);
                    return;
                }
                int a = this.y != null ? emnp.a(3) : emnp.a(this.x.a());
                fgrc fgrcVar = this.v.c;
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                emnq emnqVar = (emnq) fgrcVar.b;
                emnq emnqVar2 = emnq.a;
                int i2 = a - 1;
                if (a == 0) {
                    throw null;
                }
                emnqVar.s = i2;
                emnqVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                dfzy dfzyVar = new dfzy();
                dfzyVar.a = R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24;
                dfzyVar.b = getString(R.string.smartdevice_d2d_target_continue_description);
                j(dfzyVar.a());
                this.l = 8;
                return;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /* 112 */:
                q();
                return;
            case 113:
                String string2 = bundle.getString("pin.code");
                this.C = string2;
                if (this.l != 7) {
                    eogo b = fvae.m() ? dfxf.b(this) : eogo.DEFAULT;
                    this.B = b;
                    j(dgvu.x(b, string2, false, false, dfim.UNKNOWN));
                    this.l = 7;
                    return;
                }
                return;
            case 115:
                k();
                return;
            case 117:
                dfzl u = u();
                this.y = u;
                u.i();
                this.l = 2;
                return;
        }
    }

    public final void j(dg dgVar) {
        bp bpVar = new bp(gY());
        if (fmtw.d()) {
            int i = efwn.a;
            if (efrl.z(this)) {
                bpVar.A(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
                bpVar.F(R.id.fragment_container, dgVar);
                bpVar.w(null);
                bpVar.a();
            }
        }
        bpVar.A(R.anim.slide_next_in, R.anim.slide_next_out, R.anim.slide_back_in, R.anim.slide_back_out);
        bpVar.F(R.id.fragment_container, dgVar);
        bpVar.w(null);
        bpVar.a();
    }

    public final void k() {
        this.u.y(getApplicationContext());
        if (this.l == 1) {
            return;
        }
        ew ewVar = this.x.d;
        if (!ewVar.au("instruction", 0)) {
            ewVar.T(null, 1);
        }
        this.l = 1;
    }

    public final void l(Bundle bundle) {
        int i;
        h.d("doneToSuw()", new Object[0]);
        this.v.d();
        if (bundle.containsKey("restoreToken")) {
            fgrc fgrcVar = this.v.c;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            emnq emnqVar = (emnq) fgrcVar.b;
            emnq emnqVar2 = emnq.a;
            emnqVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            emnqVar.o = true;
        }
        Intent intent = new Intent();
        BootstrapCompletionResult bootstrapCompletionResult = this.r;
        int i2 = -1;
        if (bootstrapCompletionResult != null) {
            int i3 = bootstrapCompletionResult.a;
            if (i3 == 1) {
                i2 = 103;
            } else if (i3 == 2) {
                i = 102;
                m(i, intent);
            }
        }
        intent.putExtras(bundle);
        i = i2;
        m(i, intent);
    }

    final void m(int i, Intent intent) {
        w();
        setResult(i, intent);
        finish();
    }

    public final void n(Bundle bundle, BootstrapCompletionResult bootstrapCompletionResult) {
        h.j("handleCompletionResults", new Object[0]);
        this.t.putAll(bundle);
        this.r = bootstrapCompletionResult;
        this.m = bootstrapCompletionResult.f == 4;
        if (this.n) {
            return;
        }
        p(bundle.getParcelableArrayList("accounts"));
    }

    @Override // defpackage.dgrs
    public final void o(int i) {
        this.u.z();
        q();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        h.d("onActivityResult() with requestCode: %d and resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 2 && !t(true)) {
            l(this.t);
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        int i = this.l;
        if (i != 1 && i != 2) {
            ip ipVar = new ip(this);
            ipVar.l(R.string.smartdevice_alert_exit_setup_title);
            ipVar.setPositiveButton(R.string.smartdevice_alert_quit_button, new dfzt(this));
            ipVar.setNegativeButton(R.string.common_cancel, null);
            ipVar.a();
            return;
        }
        dfzl dfzlVar = this.y;
        if (dfzlVar != null) {
            if (dfzlVar.g()) {
                dfzlVar.e();
                return;
            } else {
                dfzlVar.e();
                this.y = null;
                return;
            }
        }
        if (this.x.g()) {
            this.x.e();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("intentionally_canceled", true);
        m(0, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConfigurationChanged(android.content.res.Configuration r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        h.d("onDestroy()", new Object[0]);
        if (isFinishing()) {
            w();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        h.d("onPause()", new Object[0]);
        if (this.o == null || this.o.isCancelled()) {
            return;
        }
        this.o.cancel(true);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        h.d("onResume()", new Object[0]);
        if (!this.w || this.o == null) {
            return;
        }
        this.w = false;
        this.o = null;
        this.k.clear();
        v(this.t, null);
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        h.d("onSaveInstanceState()", new Object[0]);
        bundle.putInt("smartdevice.savedState", this.l);
        bundle.putParcelable("smartdevice.results", this.t);
        bundle.putString("deviceName", this.A);
        this.x.f(bundle);
        if (this.y != null) {
            Bundle bundle2 = new Bundle();
            this.y.f(bundle2);
            bundle.putBundle("secondaryInstrState", bundle2);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.addAll(this.k);
        bundle.putParcelableArrayList("smartdevice.managed_intents", arrayList);
    }

    @Override // defpackage.dgrs
    public final void p(ArrayList arrayList) {
        auad auadVar = h;
        auadVar.d("onAccountChallengesCompleted", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accountChallengeData", arrayList);
        ResultReceiver resultReceiver = this.s;
        if (resultReceiver != null) {
            resultReceiver.send(2003, bundle);
        }
        itn itnVar = arrayList == null ? new itn(null, null) : dgcj.d(arrayList, this.t.getString("restoreAccount"));
        Object obj = itnVar.b;
        Account account = (Account) itnVar.a;
        List list = (List) obj;
        if (account != null && list != null) {
            this.u.aj.c(10, list.size());
            auadVar.d("onAccountSuccess()", new Object[0]);
            this.t.putString("authAccount", account.name);
            this.t.putString("accountType", account.type);
            v(this.t, list);
            return;
        }
        if (!s()) {
            r();
            return;
        }
        auadVar.d("skipToMinuteMaidForWifiD2d()", new Object[0]);
        this.v.d();
        BootstrapCompletionResult bootstrapCompletionResult = this.r;
        int i = 1;
        if (bootstrapCompletionResult != null) {
            int i2 = bootstrapCompletionResult.a;
            if (i2 == 1) {
                i = 103;
            } else if (i2 == 2) {
                i = 102;
            }
        }
        m(i, new Intent());
    }

    protected final void q() {
        if (this.q) {
            return;
        }
        dfzu dfzuVar = new dfzu(this);
        ip ipVar = new ip(this);
        ipVar.l(R.string.common_something_went_wrong);
        ipVar.setPositiveButton(R.string.common_try_again, dfzuVar);
        ipVar.setNegativeButton(R.string.common_skip, dfzuVar);
        ipVar.c(false);
        ipVar.a();
        this.q = true;
    }

    public final void r() {
        h.d("skipToMinuteMaid()", new Object[0]);
        this.u.aj.b(15);
        m(1, new Intent());
    }

    public final boolean s() {
        D2dOptions d2dOptions = this.z;
        return d2dOptions != null && d2dOptions.a;
    }

    public final boolean t(boolean z) {
        h.d("processDeviceManagementInfoHolderQueue()", new Object[0]);
        if (z) {
            this.k.poll();
        }
        Intent intent = (Intent) this.k.peek();
        if (intent == null) {
            return false;
        }
        startActivityForResult(intent, 2);
        return true;
    }

    @Override // defpackage.dgrs
    public final void x(String str) {
    }
}
