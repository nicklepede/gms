package com.google.android.gms.fido.fido2.ui;

import android.app.KeyguardManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import defpackage.aca;
import defpackage.atyq;
import defpackage.atzs;
import defpackage.ausn;
import defpackage.bcwb;
import defpackage.bdfi;
import defpackage.bdfv;
import defpackage.bdgb;
import defpackage.bdgm;
import defpackage.bdgq;
import defpackage.bdlr;
import defpackage.bdni;
import defpackage.bdny;
import defpackage.bdup;
import defpackage.bduq;
import defpackage.bdvi;
import defpackage.bdvz;
import defpackage.bdwe;
import defpackage.bdxf;
import defpackage.bedt;
import defpackage.bedv;
import defpackage.befm;
import defpackage.bejt;
import defpackage.bekl;
import defpackage.belh;
import defpackage.beou;
import defpackage.beov;
import defpackage.beoy;
import defpackage.bepc;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.eqhc;
import defpackage.ew;
import defpackage.fqqb;
import defpackage.fqqe;
import defpackage.fqqw;
import defpackage.fqrs;
import defpackage.iic;
import defpackage.iif;
import java.util.Set;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticateChimeraActivity extends bdny {
    public static final ausn l = beov.a("AuthenticateChimeraActivity");
    private UUID A;
    private belh B;
    private bdgq E;
    private beou I;
    private bekl J;
    public beoy m;
    public String n;
    public bepc o;
    public bdup p;
    public RequestOptions q;
    public bejt r;
    public befm s;
    public aca t;
    public aca u;
    public aca v;
    public ActivityResult w;
    public String x;
    public eqhc y;
    private bdgb z;
    private Boolean C = false;
    private boolean D = false;
    private ekvi F = ektg.a;
    private boolean G = false;
    private boolean H = true;

    public static void t(ResultReceiver resultReceiver, PublicKeyCredential publicKeyCredential) {
        if (resultReceiver == null || !fqrs.o()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("FIDO2_CREDENTIAL_EXTRA", atzs.n(publicKeyCredential));
        resultReceiver.send(-1, bundle);
    }

    public static final ActivityResult x(PublicKeyCredential publicKeyCredential) {
        Intent intent = new Intent();
        intent.putExtra("FIDO2_CREDENTIAL_EXTRA", atzs.n(publicKeyCredential));
        intent.putExtra("FIDO2_CREDENTIAL_JSON_EXTRA", publicKeyCredential.c());
        AuthenticatorResponse a = publicKeyCredential.a();
        if (a instanceof AuthenticatorErrorResponse) {
            intent.putExtra("FIDO2_ERROR_EXTRA", a.h());
        } else {
            intent.putExtra("FIDO2_RESPONSE_EXTRA", a.h());
        }
        return new ActivityResult(-1, intent);
    }

    private final String y(beoy beoyVar, RequestOptions requestOptions, String str) {
        ApplicationInfo applicationInfo;
        Object obj = str;
        if (atyq.b(this.C, true)) {
            obj = str;
            if (this.F.h()) {
                obj = str;
                if (!bdlr.k(requestOptions)) {
                    obj = this.F.c();
                }
            }
        }
        if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
            return ((BrowserPublicKeyCredentialCreationOptions) requestOptions).a.a.a;
        }
        if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
            return ((BrowserPublicKeyCredentialRequestOptions) requestOptions).a.c;
        }
        if (fqqw.a.lK().a() && atyq.b(obj, "com.google.android.gms")) {
            return getString(R.string.common_google);
        }
        PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo((String) obj, 0);
        } catch (PackageManager.NameNotFoundException e) {
            ((eluo) ((eluo) l.j()).s(e)).x("Application info cannot be retrieved");
            this.o.a(beoyVar, e);
            applicationInfo = null;
        }
        if (applicationInfo != null && packageManager.getApplicationLabel(applicationInfo) != null) {
            return packageManager.getApplicationLabel(applicationInfo).toString();
        }
        ((eluo) l.j()).x("Cannot retrieve application name and package name is used instead");
        return (String) obj;
    }

    @Override // defpackage.bdny
    public final void j() {
        if (this.p == null) {
            ((eluo) l.j()).x("No FIDO API ongoing to startEmbeddedSecurityKey");
            return;
        }
        setTheme(R.style.Theme_Fido_Transparent_DayNight);
        l();
        bdup bdupVar = this.p;
        if (bdupVar.a == null) {
            bdupVar.g();
        }
        bdni bdniVar = bdupVar.a;
        if (bdniVar != null) {
            bdniVar.i();
        } else {
            bdup.b.f("startEmbeddedSecurityKey should not be called for null securityKeyRequestController.", new Object[0]);
        }
    }

    @Override // defpackage.bdny
    protected final void n(ViewOptions viewOptions) {
        bdup bdupVar = this.p;
        if (bdupVar != null) {
            bdupVar.c(new StateUpdate(StateUpdate.Type.UPDATE_CURRENT_VIEW, viewOptions.a()));
        } else {
            ((eluo) l.j()).x("No FIDO API helper to update the current view");
        }
    }

    @Override // defpackage.bdny
    protected final void o(StateUpdate stateUpdate) {
        PublicKeyCredential a;
        bdup bdupVar = this.p;
        if (bdupVar == null) {
            ((eluo) l.j()).x("No FIDO API to update");
            return;
        }
        bdupVar.c(stateUpdate);
        if (atyq.b(stateUpdate, StateUpdate.a)) {
            if (fqqb.j()) {
                bdxf bdxfVar = new bdxf();
                bdvz bdvzVar = new bdvz();
                bdvzVar.b(ErrorCode.NOT_ALLOWED_ERR);
                bdvzVar.a = "User canceled the request";
                bdxfVar.c = bdvzVar.a();
                a = bdxfVar.a();
            } else {
                bdxf bdxfVar2 = new bdxf();
                bdvz bdvzVar2 = new bdvz();
                bdvzVar2.b(ErrorCode.ABORT_ERR);
                bdvzVar2.a = "User canceled the request";
                bdxfVar2.c = bdvzVar2.a();
                a = bdxfVar2.a();
            }
            this.o.a(this.m, new IllegalArgumentException("User canceled the request"));
            t(this.q.b(), a);
            v(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0463  */
    @Override // defpackage.bdny, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (this.G) {
            this.G = false;
            ((eluo) l.h()).x("Flow to background");
            this.r.l(bcwb.TYPE_PASSKEYS_APP_FOREGROUND);
        }
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        ((eluo) l.h()).x("Flow to foreground");
        this.G = true;
        this.r.l(bcwb.TYPE_PASSKEYS_APP_BACKGROUND);
    }

    public final Set s() {
        return this.p.d.a();
    }

    public final void u(ekvi ekviVar) {
        boolean z;
        if (ekviVar.h() && ((Boolean) ekviVar.c()).booleanValue()) {
            ((eluo) l.h()).x("Using SilentOrStrongBoxUserVerifier.");
            this.E = new bdgm(gY());
        } else {
            ((eluo) l.h()).x("Using default UserVerifier.");
            ew gY = gY();
            RequestOptions requestOptions = this.q;
            this.E = new bdfv(this, gY, requestOptions, y(this.m, requestOptions, this.n));
        }
        if (this.k.d.n()) {
            Boolean bool = (Boolean) this.k.d.ii();
            z = bool.booleanValue();
            ((eluo) l.h()).B("Result for hasPasskeyOrDeviceBoundKeys = %s", bool);
        } else {
            z = false;
        }
        beoy beoyVar = this.m;
        RequestOptions requestOptions2 = this.q;
        bdgq bdgqVar = this.E;
        bdgb bdgbVar = this.z;
        final bdfi bdfiVar = new bdfi(this, gY());
        bdfiVar.g = iif.a(new iic() { // from class: bdev
            @Override // defpackage.iic
            public final Object a(final iia iiaVar) {
                bdfi.this.c.b.g(this, new jvs() { // from class: bdeu
                    @Override // defpackage.jvs
                    public final void a(Object obj) {
                        bejs bejsVar = (bejs) obj;
                        Status status = bejsVar.a;
                        ausn ausnVar = bdfi.a;
                        if (!status.equals(Status.b)) {
                            status.b();
                        }
                        iia.this.b(bejsVar);
                    }
                });
                return "credentialController observe callback for secure transaction page.";
            }
        });
        bdfiVar.f = iif.a(new iic() { // from class: bdew
            @Override // defpackage.iic
            public final Object a(final iia iiaVar) {
                bdfi.this.c.c.g(this, new jvs() { // from class: bdet
                    @Override // defpackage.jvs
                    public final void a(Object obj) {
                        bejr bejrVar = (bejr) obj;
                        Status status = bejrVar.a;
                        ausn ausnVar = bdfi.a;
                        if (!status.equals(Status.b)) {
                            status.b();
                        }
                        iia.this.b(bejrVar);
                    }
                });
                return "credentialController observe callback";
            }
        });
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        bdfiVar.d = keyguardManager != null && keyguardManager.isDeviceSecure();
        bepc bepcVar = this.o;
        String str = this.n;
        bedt bedtVar = new bedt(this, requestOptions2);
        boolean z2 = z;
        UUID uuid = this.A;
        runOnUiThread(new Runnable() { // from class: bedn
            @Override // java.lang.Runnable
            public final void run() {
                AuthenticateChimeraActivity authenticateChimeraActivity = AuthenticateChimeraActivity.this;
                authenticateChimeraActivity.s.a.g(authenticateChimeraActivity, new bedu(authenticateChimeraActivity));
            }
        });
        bduq bduqVar = new bduq(uuid, this, beoyVar, requestOptions2, bdgqVar, bdfiVar, bdgbVar, bedtVar, bepcVar, str, new bedv(this), Boolean.valueOf(z2), this.H, fqqe.c() ? this.D : false);
        this.p = ((requestOptions2 instanceof PublicKeyCredentialRequestOptions) || (requestOptions2 instanceof BrowserPublicKeyCredentialRequestOptions)) ? bdup.e(bduqVar) : bdup.d(bduqVar);
        Boolean bool2 = this.C;
        if (bool2 != null && bool2.booleanValue()) {
            ((eluo) l.h()).x("Starting security key only flow");
            this.p.j();
            return;
        }
        ((eluo) l.h()).x("Starting generic processRequest flow");
        bdup bdupVar = this.p;
        if (bdupVar.a == null) {
            bdupVar.g();
        }
        bdni bdniVar = bdupVar.a;
        if (bdniVar != null) {
            bdniVar.g();
        } else {
            bdup.b.f("start should not be called for null securityKeyRequestController.", new Object[0]);
        }
        o(StateUpdate.c);
    }

    public final void v(PublicKeyCredential publicKeyCredential) {
        ActivityResult x = x(publicKeyCredential);
        setResult(x.a, x.b);
        finish();
    }

    public final void w(AuthenticatorResponse authenticatorResponse, bdwe bdweVar, boolean z, bdvi bdviVar, ekvi ekviVar) {
        this.p.h(authenticatorResponse, bdweVar, z, bdviVar, ekviVar);
    }
}
