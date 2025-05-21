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
import defpackage.abqr;
import defpackage.abqs;
import defpackage.abqx;
import defpackage.abt;
import defpackage.abv;
import defpackage.abvc;
import defpackage.abve;
import defpackage.abvg;
import defpackage.abvn;
import defpackage.abxx;
import defpackage.abyh;
import defpackage.abzk;
import defpackage.abzm;
import defpackage.abzr;
import defpackage.abzu;
import defpackage.acat;
import defpackage.arjr;
import defpackage.arjs;
import defpackage.arkc;
import defpackage.arwm;
import defpackage.aseu;
import defpackage.asqh;
import defpackage.bp;
import defpackage.bqqa;
import defpackage.dg;
import defpackage.dxbn;
import defpackage.dxbo;
import defpackage.edeq;
import defpackage.edgl;
import defpackage.edjs;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fiko;
import defpackage.fiwo;
import defpackage.fkzn;
import defpackage.fkzo;
import defpackage.fkzs;
import defpackage.flaa;
import defpackage.flad;
import defpackage.flbn;
import defpackage.fvbo;
import defpackage.fwbp;
import defpackage.fwbs;
import defpackage.fwca;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class EmmChimeraActivity extends abxx implements arjr {
    private String A;
    private boolean B;
    private String C;
    public fiwo h;
    public final abv i = registerForActivityResult(new abqr(), new abt() { // from class: abuy
        @Override // defpackage.abt
        public final void jq(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            EmmChimeraActivity.this.k(activityResult.a, activityResult.b);
        }
    });
    final abv j = registerForActivityResult(new abqs(), new abt() { // from class: abuz
        @Override // defpackage.abt
        public final void jq(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            EmmChimeraActivity.this.l(activityResult.a, activityResult.b);
        }
    });
    public Account k;
    public abve l;
    public byte[] m;
    public fiko n;
    public long o;
    public int p;
    public abzm q;
    public abzr r;
    public boolean s;
    public Bundle t;
    public int u;
    public abvc v;
    public boolean w;
    public bqqa x;

    public EmmChimeraActivity() {
        registerForActivityResult(new abqx(), new abt() { // from class: abva
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                EmmChimeraActivity.this.m(activityResult.a, activityResult.b);
            }
        });
        this.A = null;
        this.w = false;
    }

    private final void A(int i, Intent intent) {
        abzm e = abzm.e();
        this.q = e;
        e.i(this, this.k, false);
        j(i, intent);
    }

    private final void B(String str) {
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, EmmActivity] ".concat(str), new Object[0]));
        j(10, null);
    }

    private final void C(int i, int i2) {
        acat acatVar;
        Log.i("Auth", String.format(Locale.US, a.t(i, i2, "[AuthManaged, EmmActivity] onActivityResult: ", " "), new Object[0]));
        if (flbn.e()) {
            abvc abvcVar = this.v;
            acat acatVar2 = abvcVar.a;
            if (acatVar2 != null) {
                fwbp b = new abzr().b(this);
                fvbo.e(b, "getProfileStateLogEnum(...)");
                acatVar = acat.b(acatVar2, 0, false, b, null, null, 0, 59);
            } else {
                acatVar = null;
            }
            abvcVar.a = acatVar;
        }
    }

    private final int D(int i) {
        if (!v() || i != 0) {
            return i;
        }
        if (!this.q.j(this) && (!asqh.a() || ((DevicePolicyManager) getSystemService("device_policy")).getUserProvisioningState() != 4)) {
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
        return (getIntent().getBooleanExtra("is_unicorn_account", false) && fkzn.a.a().j()) ? 1 : 0;
    }

    public final acat c() {
        return this.v.a;
    }

    @Override // defpackage.arjn
    protected final void gu(String str, boolean z) {
        if (flad.c()) {
            arkc.g(this);
        } else {
            arkc.f(this, str);
        }
        if (flad.e()) {
            int i = edjs.a;
            if (edeq.w(this)) {
                setTheme(edjs.a(this));
            }
        }
    }

    public final void j(int i, Intent intent) {
        fwca fwcaVar;
        Log.i("Auth", String.format(Locale.US, a.j(i, "[AuthManaged, EmmActivity] Finish with resultCode: "), new Object[0]));
        if (flbn.f()) {
            abzu a = abzu.a(this);
            acat c = c();
            if (!flbn.e() || c == null) {
                fecj v = fwca.a.v();
                fwbs b = abzu.b();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                fwca fwcaVar2 = (fwca) fecpVar;
                b.getClass();
                fwcaVar2.c = b;
                fwcaVar2.b |= 1;
                if (!fecpVar.L()) {
                    v.U();
                }
                fecp fecpVar2 = v.b;
                fwca fwcaVar3 = (fwca) fecpVar2;
                fwcaVar3.d = 15;
                fwcaVar3.b |= 2;
                int i2 = abzu.i(i);
                if (!fecpVar2.L()) {
                    v.U();
                }
                fwca fwcaVar4 = (fwca) v.b;
                fwcaVar4.f = i2 - 1;
                fwcaVar4.b |= 8;
                fwcaVar = (fwca) v.Q();
            } else {
                fecj p = abzu.p(c);
                if (!p.b.L()) {
                    p.U();
                }
                fwca fwcaVar5 = (fwca) p.b;
                fwca fwcaVar6 = fwca.a;
                fwcaVar5.d = 15;
                fwcaVar5.b |= 2;
                int i3 = abzu.i(i);
                if (!p.b.L()) {
                    p.U();
                }
                fwca fwcaVar7 = (fwca) p.b;
                fwcaVar7.f = i3 - 1;
                fwcaVar7.b |= 8;
                fwcaVar = (fwca) p.Q();
            }
            a.n(fwcaVar, a.a, 16);
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
        fkzo fkzoVar = fkzo.a;
        if (fkzoVar.a().q() && !v() && i == 0) {
            abzm abzmVar = this.q;
            fiko fikoVar = this.n;
            if (abzmVar.k(this.C) && (((fkzoVar.a().r() && "com.google.android.apps.work.clouddpc".equals(fikoVar.c)) || (fkzoVar.a().s() && "com.google.android.apps.enterprise.dmagent".equals(fikoVar.c))) && getIntent().getIntExtra("flow", -1) == 0)) {
                B("Returning to remove just added Google managed account");
                return;
            }
            i = 0;
        }
        A(D(i), intent);
    }

    public final void m(int i, Intent intent) {
        C(3, i);
        if (flbn.f()) {
            abzu.a(this).j(c(), 18);
        }
        if (fkzo.a.a().t() && (i == 122 || i == 123)) {
            i = -1;
        }
        if (fkzs.a.a().g() && i == 0) {
            B("Streamlined SyncAuth is cancelled, removing the account");
        } else {
            A(D(i), intent);
        }
    }

    @Override // defpackage.arjr
    public final void n(arjs arjsVar, int i) {
        dg h = gI().h("SkipDialogFragment");
        dg h2 = gI().h("FailedDialogFragment");
        arjsVar.dismissAllowingStateLoss();
        this.l.d = null;
        if (i == 1 && h == arjsVar) {
            j(6, null);
        } else if (h2 == arjsVar) {
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

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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

    /* JADX WARN: Code restructure failed: missing block: B:71:0x024e, code lost:
    
        if (defpackage.fkzn.a.a().e() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0285, code lost:
    
        if ("com.google.work".equals(r12.k.type) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x026d, code lost:
    
        if (r5 != false) goto L85;
     */
    @Override // defpackage.abxx, defpackage.arjn, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.managed.ui.EmmChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qfn, com.google.android.chimera.Activity, defpackage.qam
    protected final void onResumeFragments() {
        super.onResumeFragments();
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, EmmActivity] onResumeFragments", new Object[0]));
        if (isFinishing()) {
            return;
        }
        if (flaa.c() && this.l.ag) {
            return;
        }
        if (this.l.a != null) {
            if (!this.q.p(this.p, this.n)) {
                p();
            }
            if (!fkzn.f() ? this.l.c != -1 : this.l.b != null) {
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
        if (((abvg) gI().h("FetchManagingAppFragment")) == null) {
            Account account = this.k;
            String y = y();
            int i = this.u;
            abvg abvgVar = new abvg();
            Bundle bundle = new Bundle();
            bundle.putParcelable("account", account);
            bundle.putString("theme", y);
            if (abzm.e().o(i)) {
                bundle.putInt("unmanagedWorkProfileMode", i);
            }
            abvgVar.setArguments(bundle);
            bp bpVar = new bp(gI());
            bpVar.u(R.id.content, abvgVar, "FetchManagingAppFragment");
            bpVar.a();
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("force_device_owner_launched", this.s);
        if (fkzs.f()) {
            bundle.putBoolean("streamlined_flow_launched", this.B);
        }
    }

    public final void p() {
        if (((abvn) gI().h("DownloadInstallFragment")) == null) {
            String str = this.k.name;
            fiko fikoVar = this.n;
            String str2 = fikoVar.d;
            String str3 = fikoVar.i;
            int i = this.p;
            String y = y();
            int a = a();
            abvn abvnVar = new abvn();
            Bundle bundle = new Bundle();
            bundle.putString("account_name", str);
            bundle.putString("package_display_name", str2);
            bundle.putString("package_icon_url", str3);
            bundle.putInt("package_install_state", i);
            bundle.putString("theme", y);
            bundle.putInt("variant_index", a);
            abvnVar.setArguments(bundle);
            bp bpVar = new bp(gI());
            bpVar.z(R.id.content, abvnVar, "DownloadInstallFragment");
            bpVar.b();
        }
    }

    public final void q() {
        int i = this.p;
        if (((arjs) gI().h("FailedDialogFragment")) == null) {
            arjs x = arjs.x(getText(z(com.google.android.gms.R.array.auth_device_management_download_failed_title)), getText(z(i == 2 ? com.google.android.gms.R.array.auth_device_management_download_not_updated_message : com.google.android.gms.R.array.auth_device_management_download_failed_message)), getText(com.google.android.gms.R.string.common_retry), getText(com.google.android.gms.R.string.common_dismiss), null, true);
            bp bpVar = new bp(gI());
            bpVar.v(x, "FailedDialogFragment");
            bpVar.b();
            this.l.d = "FailedDialogFragment";
        }
    }

    final void r() {
        if (((abyh) gI().h("ProgressDialogFragment")) == null) {
            String str = this.n.d;
            String string = getString(com.google.android.gms.R.string.auth_common_downloading);
            String string2 = getString(com.google.android.gms.R.string.auth_device_management_download_paused);
            long j = this.o;
            String str2 = this.A;
            byte[] bArr = this.m;
            abyh abyhVar = new abyh();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("title", str);
            bundle.putCharSequence("message", string);
            bundle.putCharSequence("pausedMessage", string2);
            bundle.putString("downloadFileDestinationUri", str2);
            bundle.putLong("downloadRequestId", j);
            bundle.putByteArray("packageInformationBytes", bArr);
            abyhVar.setArguments(bundle);
            bp bpVar = new bp(gI());
            bpVar.v(abyhVar, "ProgressDialogFragment");
            bpVar.b();
            this.l.d = "ProgressDialogFragment";
        }
    }

    public final void s() {
        if (((arjs) gI().h("SkipDialogFragment")) == null) {
            arjs y = arjs.y(getText(z(com.google.android.gms.R.array.auth_device_management_download_skip_message)), getText(z(com.google.android.gms.R.array.auth_device_management_download_skip_confirm)), getText(com.google.android.gms.R.string.auth_common_go_back), false);
            bp bpVar = new bp(gI());
            bpVar.v(y, "SkipDialogFragment");
            bpVar.b();
            this.l.d = "SkipDialogFragment";
        }
    }

    final void t() {
        if (fkzn.f()) {
            Pattern pattern = dxbo.a;
            dxbn dxbnVar = new dxbn(this);
            dxbnVar.j();
            dxbnVar.e("auth_managed");
            dxbnVar.f("ManagingAppFileId");
            String uri = dxbnVar.a().toString();
            this.A = uri;
            this.l.b = uri;
        } else {
            fiko fikoVar = this.n;
            arwm.s(fikoVar);
            DownloadManager.Request visibleInDownloadsUi = new DownloadManager.Request(Uri.parse(fikoVar.j)).setNotificationVisibility(2).setVisibleInDownloadsUi(false);
            if (!fikoVar.k.isEmpty() && !fikoVar.l.isEmpty()) {
                visibleInDownloadsUi.addRequestHeader("Cookie", fikoVar.k + "=" + fikoVar.l);
            }
            long enqueue = ((DownloadManager) getSystemService("download")).enqueue(visibleInDownloadsUi);
            this.o = enqueue;
            this.l.c = enqueue;
        }
        r();
    }

    public final void u(int i) {
        Intent intent;
        if (fkzo.h()) {
            this.q.i(this, this.k, true);
        }
        Intent intent2 = getIntent();
        fiko fikoVar = this.n;
        Account account = this.k;
        boolean booleanExtra = intent2.getBooleanExtra("is_setup_wizard", false);
        Bundle bundle = this.t;
        arwm.s(fikoVar);
        arwm.s(account);
        abzk d = abzm.d(this, fikoVar.c, fikoVar, account, bundle, Boolean.valueOf(booleanExtra), false, null);
        if (d.a.i != Status.b.i || (intent = d.b) == null) {
            if (i == -1) {
                j(2, null);
                return;
            } else {
                j(i, null);
                return;
            }
        }
        if (flbn.f()) {
            Log.i("Auth", String.format(Locale.US, "[AuthManaged, EmmActivity] Launching managing app", new Object[0]));
            if (flbn.e()) {
                abzu.a(this).j(c(), 14);
            } else {
                abzu.a(this).l(14, this.n);
            }
        }
        if (this.x != null) {
            bqqa.a(aseu.AUTH_MANAGED_MANAGING_APP_LAUNCHED);
        }
        if (fkzo.d()) {
            edgl.a(getIntent(), intent);
        }
        if (this.w) {
            this.j.b(intent);
        } else {
            startActivityForResult(intent, 2);
        }
    }

    public final boolean v() {
        boolean booleanExtra;
        if (fkzo.a.a().g()) {
            booleanExtra = true;
            if (!getIntent().getBooleanExtra("is_setup_wizard", false) && edgl.d(this)) {
                booleanExtra = false;
            }
        } else {
            booleanExtra = getIntent().getBooleanExtra("is_setup_wizard", false);
        }
        Log.i("Auth", String.format(Locale.US, a.Z(booleanExtra, "[AuthManaged, EmmActivity] isSetupWizard: "), new Object[0]));
        return booleanExtra;
    }
}
