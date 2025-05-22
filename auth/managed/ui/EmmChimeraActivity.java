package com.google.android.gms.auth.managed.ui;

import android.R;
import android.accounts.Account;
import android.app.DownloadManager;
import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.auth.managed.ui.EmmChimeraActivity;
import com.google.android.gms.common.api.Status;
import defpackage.a;
import defpackage.aby;
import defpackage.aca;
import defpackage.adqr;
import defpackage.adqs;
import defpackage.adqx;
import defpackage.advc;
import defpackage.adve;
import defpackage.advg;
import defpackage.advn;
import defpackage.adxx;
import defpackage.adyh;
import defpackage.adzk;
import defpackage.adzm;
import defpackage.adzr;
import defpackage.adzu;
import defpackage.aeat;
import defpackage.atmg;
import defpackage.atmh;
import defpackage.atmr;
import defpackage.atzb;
import defpackage.auio;
import defpackage.auub;
import defpackage.bp;
import defpackage.bsxr;
import defpackage.dg;
import defpackage.dznn;
import defpackage.dzno;
import defpackage.efrl;
import defpackage.eftg;
import defpackage.efwn;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.flal;
import defpackage.flml;
import defpackage.fnqv;
import defpackage.fnqw;
import defpackage.fnra;
import defpackage.fnri;
import defpackage.fnrl;
import defpackage.fnsv;
import defpackage.fxxm;
import defpackage.fyxr;
import defpackage.fyxu;
import defpackage.fyyc;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class EmmChimeraActivity extends adxx implements atmg {
    private String A;
    private boolean B;
    private String C;
    public flml h;
    public final aca i = registerForActivityResult(new adqr(), new aby() { // from class: aduy
        @Override // defpackage.aby
        public final void jF(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            EmmChimeraActivity.this.k(activityResult.a, activityResult.b);
        }
    });
    final aca j = registerForActivityResult(new adqs(), new aby() { // from class: aduz
        @Override // defpackage.aby
        public final void jF(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            EmmChimeraActivity.this.l(activityResult.a, activityResult.b);
        }
    });
    public Account k;
    public adve l;
    public byte[] m;
    public flal n;
    public long o;
    public int p;
    public adzm q;
    public adzr r;
    public boolean s;
    public Bundle t;
    public int u;
    public advc v;
    public boolean w;
    public bsxr x;

    public EmmChimeraActivity() {
        registerForActivityResult(new adqx(), new aby() { // from class: adva
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                EmmChimeraActivity.this.m(activityResult.a, activityResult.b);
            }
        });
        this.A = null;
        this.w = false;
    }

    private final void A(int i, Intent intent) {
        adzm e = adzm.e();
        this.q = e;
        e.i(this, this.k, false);
        j(i, intent);
    }

    private final void B(String str) {
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, EmmActivity] ".concat(str), new Object[0]));
        j(10, null);
    }

    private final void C(int i, int i2) {
        aeat aeatVar;
        Log.i("Auth", String.format(Locale.US, a.t(i, i2, "[AuthManaged, EmmActivity] onActivityResult: ", " "), new Object[0]));
        if (fnsv.e()) {
            advc advcVar = this.v;
            aeat aeatVar2 = advcVar.a;
            if (aeatVar2 != null) {
                fyxr b = new adzr().b(this);
                fxxm.e(b, "getProfileStateLogEnum(...)");
                aeatVar = aeat.b(aeatVar2, 0, false, b, null, null, 0, 59);
            } else {
                aeatVar = null;
            }
            advcVar.a = aeatVar;
        }
    }

    private final int D(int i) {
        if (!v() || i != 0) {
            return i;
        }
        if (!this.q.j(this) && (!auub.a() || ((DevicePolicyManager) getSystemService("device_policy")).getUserProvisioningState() != 4)) {
            return 0;
        }
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, EmmActivity] Provisioning is indeed done, returns RESULT_OKAY instead", new Object[0]));
        return -1;
    }

    private final int z(int i) {
        TypedArray obtainTypedArray = getResources().obtainTypedArray(i);
        int resourceId = obtainTypedArray.getResourceId(a(), 0);
        obtainTypedArray.recycle();
        return resourceId;
    }

    public final int a() {
        if (getIntent().getBooleanExtra("is_unicorn_account", false)) {
            return 2;
        }
        return (getIntent().getBooleanExtra("is_unicorn_account", false) && fnqv.a.lK().j()) ? 1 : 0;
    }

    public final aeat c() {
        return this.v.a;
    }

    @Override // defpackage.atmc
    protected final void gJ(String str, boolean z) {
        atmr.g(this);
        if (fnrl.d()) {
            int i = efwn.a;
            if (efrl.w(this)) {
                setTheme(efwn.a(this));
            }
        }
    }

    public final void j(int i, Intent intent) {
        fyyc fyycVar;
        Log.i("Auth", String.format(Locale.US, a.j(i, "[AuthManaged, EmmActivity] Finish with resultCode: "), new Object[0]));
        if (fnsv.f()) {
            adzu a = adzu.a(this);
            aeat c = c();
            if (!fnsv.e() || c == null) {
                fgrc v = fyyc.a.v();
                fyxu b = adzu.b();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                fyyc fyycVar2 = (fyyc) fgriVar;
                b.getClass();
                fyycVar2.c = b;
                fyycVar2.b |= 1;
                if (!fgriVar.L()) {
                    v.U();
                }
                fgri fgriVar2 = v.b;
                fyyc fyycVar3 = (fyyc) fgriVar2;
                fyycVar3.d = 15;
                fyycVar3.b |= 2;
                int i2 = adzu.i(i);
                if (!fgriVar2.L()) {
                    v.U();
                }
                fyyc fyycVar4 = (fyyc) v.b;
                fyycVar4.f = i2 - 1;
                fyycVar4.b |= 8;
                fyycVar = (fyyc) v.Q();
            } else {
                fgrc p = adzu.p(c);
                if (!p.b.L()) {
                    p.U();
                }
                fyyc fyycVar5 = (fyyc) p.b;
                fyyc fyycVar6 = fyyc.a;
                fyycVar5.d = 15;
                fyycVar5.b |= 2;
                int i3 = adzu.i(i);
                if (!p.b.L()) {
                    p.U();
                }
                fyyc fyycVar7 = (fyyc) p.b;
                fyycVar7.f = i3 - 1;
                fyycVar7.b |= 8;
                fyycVar = (fyyc) p.Q();
            }
            a.n(fyycVar, a.a, 16);
        }
        if (i == 0) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("intentionally_canceled", true);
            i = 0;
        }
        setResult(i, intent);
        finish();
    }

    public final void k(int i, Intent intent) {
        C(1, i);
        if (i == 0) {
            B("Forced DO is cancelled, removing the account");
        } else {
            A(D(i), intent);
        }
    }

    public final void l(int i, Intent intent) {
        C(2, i);
        fnqw fnqwVar = fnqw.a;
        if (fnqwVar.lK().q() && !v() && i == 0) {
            adzm adzmVar = this.q;
            flal flalVar = this.n;
            if (adzmVar.k(this.C) && (((fnqwVar.lK().r() && "com.google.android.apps.work.clouddpc".equals(flalVar.c)) || (fnqwVar.lK().s() && "com.google.android.apps.enterprise.dmagent".equals(flalVar.c))) && getIntent().getIntExtra("flow", -1) == 0)) {
                B("Returning to remove just added Google managed account");
                return;
            }
            i = 0;
        }
        A(D(i), intent);
    }

    public final void m(int i, Intent intent) {
        C(3, i);
        if (fnsv.f()) {
            adzu.a(this).j(c(), 18);
        }
        if (fnqw.a.lK().t() && (i == 122 || i == 123)) {
            i = -1;
        }
        if (fnra.a.lK().g() && i == 0) {
            B("Streamlined SyncAuth is cancelled, removing the account");
        } else {
            A(D(i), intent);
        }
    }

    @Override // defpackage.atmg
    public final void n(atmh atmhVar, int i) {
        dg h = gY().h("SkipDialogFragment");
        dg h2 = gY().h("FailedDialogFragment");
        atmhVar.dismissAllowingStateLoss();
        this.l.d = null;
        if (i == 1 && h == atmhVar) {
            j(6, null);
        } else if (h2 == atmhVar) {
            if (i == 1) {
                t();
            } else {
                u(4);
            }
        }
    }

    public final void o() {
        if (this.p == 3) {
            u(-1);
        } else {
            t();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            m(i2, intent);
        } else if (i == 1) {
            k(i2, intent);
        } else if (i == 2) {
            l(i2, intent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a0, code lost:
    
        if (r5 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0281, code lost:
    
        if (defpackage.fnqv.a.lK().e() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02b8, code lost:
    
        if ("com.google.work".equals(r12.k.type) != false) goto L99;
     */
    @Override // defpackage.adxx, defpackage.atmc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.managed.ui.EmmChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ryr, com.google.android.chimera.Activity, defpackage.rtq
    protected final void onResumeFragments() {
        super.onResumeFragments();
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, EmmActivity] onResumeFragments", new Object[0]));
        if (isFinishing()) {
            return;
        }
        if (fnri.c() && this.l.ag) {
            return;
        }
        if (this.l.a != null) {
            if (!this.q.p(this.p, this.n)) {
                p();
            }
            if (!fnqv.f() ? this.l.c != -1 : this.l.b != null) {
                if ("ProgressDialogFragment".equals(this.l.d)) {
                    r();
                    return;
                }
            }
            if ("FailedDialogFragment".equals(this.l.d)) {
                q();
                return;
            } else {
                if ("SkipDialogFragment".equals(this.l.d)) {
                    s();
                    return;
                }
                return;
            }
        }
        if (((advg) gY().h("FetchManagingAppFragment")) == null) {
            Account account = this.k;
            String y = y();
            int i = this.u;
            advg advgVar = new advg();
            Bundle bundle = new Bundle();
            bundle.putParcelable("account", account);
            bundle.putString("theme", y);
            if (adzm.e().o(i)) {
                bundle.putInt("unmanagedWorkProfileMode", i);
            }
            advgVar.setArguments(bundle);
            bp bpVar = new bp(gY());
            bpVar.u(R.id.content, advgVar, "FetchManagingAppFragment");
            bpVar.a();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("force_device_owner_launched", this.s);
        if (fnra.f()) {
            bundle.putBoolean("streamlined_flow_launched", this.B);
        }
    }

    public final void p() {
        if (((advn) gY().h("DownloadInstallFragment")) == null) {
            String str = this.k.name;
            flal flalVar = this.n;
            String str2 = flalVar.d;
            String str3 = flalVar.i;
            int i = this.p;
            String y = y();
            int a = a();
            advn advnVar = new advn();
            Bundle bundle = new Bundle();
            bundle.putString("account_name", str);
            bundle.putString("package_display_name", str2);
            bundle.putString("package_icon_url", str3);
            bundle.putInt("package_install_state", i);
            bundle.putString("theme", y);
            bundle.putInt("variant_index", a);
            advnVar.setArguments(bundle);
            bp bpVar = new bp(gY());
            bpVar.z(R.id.content, advnVar, "DownloadInstallFragment");
            bpVar.b();
        }
    }

    public final void q() {
        int i = this.p;
        if (((atmh) gY().h("FailedDialogFragment")) == null) {
            atmh x = atmh.x(getText(z(com.google.android.gms.R.array.auth_device_management_download_failed_title)), getText(z(i == 2 ? com.google.android.gms.R.array.auth_device_management_download_not_updated_message : com.google.android.gms.R.array.auth_device_management_download_failed_message)), getText(com.google.android.gms.R.string.common_retry), getText(com.google.android.gms.R.string.common_dismiss), null, true);
            bp bpVar = new bp(gY());
            bpVar.v(x, "FailedDialogFragment");
            bpVar.b();
            this.l.d = "FailedDialogFragment";
        }
    }

    final void r() {
        if (((adyh) gY().h("ProgressDialogFragment")) == null) {
            String str = this.n.d;
            String string = getString(com.google.android.gms.R.string.auth_common_downloading);
            String string2 = getString(com.google.android.gms.R.string.auth_device_management_download_paused);
            long j = this.o;
            String str2 = this.A;
            byte[] bArr = this.m;
            adyh adyhVar = new adyh();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("title", str);
            bundle.putCharSequence("message", string);
            bundle.putCharSequence("pausedMessage", string2);
            bundle.putString("downloadFileDestinationUri", str2);
            bundle.putLong("downloadRequestId", j);
            bundle.putByteArray("packageInformationBytes", bArr);
            adyhVar.setArguments(bundle);
            bp bpVar = new bp(gY());
            bpVar.v(adyhVar, "ProgressDialogFragment");
            bpVar.b();
            this.l.d = "ProgressDialogFragment";
        }
    }

    public final void s() {
        if (((atmh) gY().h("SkipDialogFragment")) == null) {
            atmh y = atmh.y(getText(z(com.google.android.gms.R.array.auth_device_management_download_skip_message)), getText(z(com.google.android.gms.R.array.auth_device_management_download_skip_confirm)), getText(com.google.android.gms.R.string.auth_common_go_back), false);
            bp bpVar = new bp(gY());
            bpVar.v(y, "SkipDialogFragment");
            bpVar.b();
            this.l.d = "SkipDialogFragment";
        }
    }

    final void t() {
        if (fnqv.f()) {
            Pattern pattern = dzno.a;
            dznn dznnVar = new dznn(this);
            dznnVar.j();
            dznnVar.e("auth_managed");
            dznnVar.f("ManagingAppFileId");
            String uri = dznnVar.a().toString();
            this.A = uri;
            this.l.b = uri;
        } else {
            flal flalVar = this.n;
            atzb.s(flalVar);
            DownloadManager.Request visibleInDownloadsUi = new DownloadManager.Request(Uri.parse(flalVar.j)).setNotificationVisibility(2).setVisibleInDownloadsUi(false);
            if (!flalVar.k.isEmpty() && !flalVar.l.isEmpty()) {
                visibleInDownloadsUi.addRequestHeader("Cookie", flalVar.k + "=" + flalVar.l);
            }
            long enqueue = ((DownloadManager) getSystemService("download")).enqueue(visibleInDownloadsUi);
            this.o = enqueue;
            this.l.c = enqueue;
        }
        r();
    }

    public final void u(int i) {
        Intent intent;
        if (fnqw.h()) {
            this.q.i(this, this.k, true);
        }
        Intent intent2 = getIntent();
        flal flalVar = this.n;
        Account account = this.k;
        boolean booleanExtra = intent2.getBooleanExtra("is_setup_wizard", false);
        Bundle bundle = this.t;
        atzb.s(flalVar);
        atzb.s(account);
        adzk d = adzm.d(this, flalVar.c, flalVar, account, bundle, Boolean.valueOf(booleanExtra), false, null);
        if (d.a.i != Status.b.i || (intent = d.b) == null) {
            if (i == -1) {
                j(2, null);
                return;
            } else {
                j(i, null);
                return;
            }
        }
        if (fnsv.f()) {
            Log.i("Auth", String.format(Locale.US, "[AuthManaged, EmmActivity] Launching managing app", new Object[0]));
            if (fnsv.e()) {
                adzu.a(this).j(c(), 14);
            } else {
                adzu.a(this).l(14, this.n);
            }
        }
        if (this.x != null) {
            bsxr.a(auio.AUTH_MANAGED_MANAGING_APP_LAUNCHED);
        }
        if (fnqw.d()) {
            eftg.a(getIntent(), intent);
        }
        if (this.w) {
            this.j.b(intent);
        } else {
            startActivityForResult(intent, 2);
        }
    }

    public final boolean v() {
        boolean booleanExtra;
        if (fnqw.a.lK().g()) {
            booleanExtra = true;
            if (!getIntent().getBooleanExtra("is_setup_wizard", false) && eftg.d(this)) {
                booleanExtra = false;
            }
        } else {
            booleanExtra = getIntent().getBooleanExtra("is_setup_wizard", false);
        }
        Log.i("Auth", String.format(Locale.US, a.aa(booleanExtra, "[AuthManaged, EmmActivity] isSetupWizard: "), new Object[0]));
        return booleanExtra;
    }
}
