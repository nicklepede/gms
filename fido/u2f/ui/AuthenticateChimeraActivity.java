package com.google.android.gms.fido.u2f.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RequestParams;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import defpackage.arwm;
import defpackage.bayu;
import defpackage.bayv;
import defpackage.bbkb;
import defpackage.bcnj;
import defpackage.bcnk;
import defpackage.bcnl;
import defpackage.bcnt;
import defpackage.bcnu;
import defpackage.bcpm;
import defpackage.bcps;
import defpackage.bcpx;
import defpackage.bcqc;
import defpackage.bcqe;
import defpackage.bcqx;
import defpackage.bctg;
import defpackage.bcth;
import defpackage.bctl;
import defpackage.eble;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticateChimeraActivity extends bbkb {
    private static final bcnj l = new bcnj("U2fAuthChimeraActivity");
    private bcpm m;
    private bcqc n;
    private String o;
    private RequestParams p;
    private bcnu q;
    private bcnl r;

    public static Intent s(Context context, bcnk bcnkVar, RequestParams requestParams) {
        arwm.s(context);
        arwm.s(requestParams);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.fido.u2f.ui.AuthenticateActivity");
        intent.putExtra("RequestExtra", requestParams);
        intent.putExtra("SessionContextSourceExtra", bcnkVar);
        return intent;
    }

    @Override // defpackage.bbkb
    public final void j() {
        throw new RuntimeException("Embedded Security Key option is not available for U2F request!");
    }

    @Override // defpackage.bbkb
    protected final void n(ViewOptions viewOptions) {
        bcpm bcpmVar = this.m;
        if (bcpmVar != null) {
            bcpmVar.b(new StateUpdate(StateUpdate.Type.UPDATE_CURRENT_VIEW, viewOptions.a()));
            return;
        }
        bcqc bcqcVar = this.n;
        if (bcqcVar != null) {
            bcqcVar.b(new StateUpdate(StateUpdate.Type.UPDATE_CURRENT_VIEW, viewOptions.a()));
        } else {
            l.f("No FIDO API helper to update the current view", new Object[0]);
        }
    }

    @Override // defpackage.bbkb
    protected final void o(StateUpdate stateUpdate) {
        try {
            bcpm bcpmVar = this.m;
            if (bcpmVar != null) {
                bcpmVar.b(stateUpdate);
                return;
            }
            bcqc bcqcVar = this.n;
            if (bcqcVar != null) {
                bcqcVar.b(stateUpdate);
            } else {
                l.f("No FIDO API to update", new Object[0]);
            }
        } catch (SecurityException e) {
            this.q.a(this.r, e);
            t(new ErrorResponseData(ErrorCode.BAD_REQUEST, "SecurityException"));
        } catch (Exception e2) {
            this.q.a(this.r, e2);
            t(new ErrorResponseData(ErrorCode.OTHER_ERROR));
        }
    }

    @Override // defpackage.bbkb, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bcnk bcnkVar = (bcnk) getIntent().getSerializableExtra("SessionContextSourceExtra");
        RequestParams requestParams = this.p;
        this.r = bcnl.b(bcnkVar, requestParams == null ? null : requestParams.d());
        this.q = bcnt.a(getApplicationContext());
        if (getCallingActivity() == null) {
            l.f("Calling activity is null. No FIDO2 operation is processed", new Object[0]);
            finish();
            return;
        }
        String packageName = getCallingActivity().getPackageName();
        this.o = packageName;
        l.h("U2f operation is requested from ".concat(String.valueOf(packageName)), new Object[0]);
        setTheme(R.style.Theme_Fido_Transparent_DayNight);
        getContainerActivity();
        int i = eble.a;
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        ApplicationInfo applicationInfo;
        bcnj bcnjVar = l;
        bcnjVar.d("onResume", new Object[0]);
        super.onResume();
        try {
            bcpm bcpmVar = this.m;
            if (bcpmVar != null) {
                bcpmVar.b(StateUpdate.c);
                return;
            }
            bcqc bcqcVar = this.n;
            if (bcqcVar != null) {
                bcqcVar.b(StateUpdate.c);
                return;
            }
            bcnjVar.f("No FIDO API call to resume, and a new request is being processed.", new Object[0]);
            RequestParams requestParams = (RequestParams) getIntent().getParcelableExtra("RequestExtra");
            this.p = requestParams;
            String str = this.o;
            if (requestParams instanceof BrowserRequestParams) {
                str = ((BrowserRequestParams) requestParams).a().getAuthority();
            } else {
                PackageManager packageManager = getApplicationContext().getPackageManager();
                try {
                    applicationInfo = packageManager.getApplicationInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    l.f("Application info cannot be retrieved", new Object[0]);
                    applicationInfo = null;
                }
                if (applicationInfo == null || packageManager.getApplicationLabel(applicationInfo) == null) {
                    l.f("Cannot retrieve application name and package name is used instead", new Object[0]);
                } else {
                    str = packageManager.getApplicationLabel(applicationInfo).toString();
                }
            }
            arwm.m(!str.trim().isEmpty(), "App name or authority from request params cannot be empty after trimming.");
            this.j = new bctl(this, str, false, this.r.a);
            bctg bctgVar = new bctg(this);
            bcth bcthVar = new bcth(this);
            Context applicationContext = getApplicationContext();
            try {
                if (this.p instanceof BrowserRequestParams) {
                    bcpm bcpmVar2 = new bcpm(this.q);
                    this.m = bcpmVar2;
                    RequestParams requestParams2 = this.p;
                    if (requestParams2 instanceof BrowserRegisterRequestParams) {
                        bcnl bcnlVar = this.r;
                        BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) requestParams2;
                        int i = bayv.a;
                        String str2 = this.o;
                        bcpm.a.h("headfulRegister is called by ".concat(String.valueOf(str2)), new Object[0]);
                        bcpmVar2.c = true;
                        if (bayv.b(browserRegisterRequestParams.b.toString(), str2, applicationContext) == null) {
                            throw new SecurityException("Calling app is not a legitimate browser!");
                        }
                        bcpmVar2.b.d(applicationContext, bcnlVar, browserRegisterRequestParams, bcthVar, bcpmVar2.a(applicationContext), str2);
                        return;
                    }
                    if (!(requestParams2 instanceof BrowserSignRequestParams)) {
                        l.f("Unsupported BrowserRequestParams type!", new Object[0]);
                        return;
                    }
                    bcnl bcnlVar2 = this.r;
                    BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) requestParams2;
                    int i2 = bayv.a;
                    String str3 = this.o;
                    bcpm.a.h("headfulSign is called by ".concat(String.valueOf(str3)), new Object[0]);
                    bcpmVar2.c = true;
                    if (bayv.b(browserSignRequestParams.b.toString(), str3, applicationContext) == null) {
                        throw new SecurityException("Calling app is not a legitimate browser!");
                    }
                    bcpmVar2.b.e(applicationContext, bcnlVar2, browserSignRequestParams, bctgVar, bcpmVar2.a(applicationContext), str3);
                    return;
                }
                bcqc bcqcVar2 = new bcqc(this.q);
                this.n = bcqcVar2;
                RequestParams requestParams3 = this.p;
                if (requestParams3 instanceof RegisterRequestParams) {
                    bcnl bcnlVar3 = this.r;
                    RegisterRequestParams registerRequestParams = (RegisterRequestParams) requestParams3;
                    int i3 = bayv.a;
                    String str4 = this.o;
                    bcqc.a.h("headfulRegister is called by ".concat(String.valueOf(str4)), new Object[0]);
                    bayu a = bayv.a(str4);
                    if (a == null) {
                        throw new SecurityException("Calling app is unknown; facetId should not be null!");
                    }
                    bcqcVar2.c = true;
                    bcqe bcqeVar = bcqcVar2.b;
                    bcqx a2 = bcqcVar2.a(applicationContext);
                    bcnj bcnjVar2 = bcqe.b;
                    bcnjVar2.h("doRegister for apps is called", new Object[0]);
                    bcqeVar.c = applicationContext;
                    bcqeVar.d = bcthVar;
                    bcqeVar.e = a2;
                    bcqeVar.f = new bcps(registerRequestParams);
                    bcqeVar.g.k(bcnlVar3, str4, registerRequestParams, a2.a());
                    if (!a2.a().isEmpty()) {
                        bcqeVar.h(bcnlVar3, a);
                        return;
                    } else {
                        bcnjVar2.f("No enabled transport found on the platform", new Object[0]);
                        bcqeVar.g(bcnlVar3, ErrorCode.CONFIGURATION_UNSUPPORTED);
                        return;
                    }
                }
                if (!(requestParams3 instanceof SignRequestParams)) {
                    l.f("Unsupported RequestParams type!", new Object[0]);
                    return;
                }
                bcnl bcnlVar4 = this.r;
                SignRequestParams signRequestParams = (SignRequestParams) requestParams3;
                int i4 = bayv.a;
                String str5 = this.o;
                bcqc.a.h("headfulSign is called by ".concat(String.valueOf(str5)), new Object[0]);
                bayu a3 = bayv.a(str5);
                if (a3 == null) {
                    throw new SecurityException("Calling app is unknown; facetId should not be null!");
                }
                bcqcVar2.c = true;
                bcqe bcqeVar2 = bcqcVar2.b;
                bcqx a4 = bcqcVar2.a(applicationContext);
                bcnj bcnjVar3 = bcqe.b;
                bcnjVar3.h("doSign for apps is called", new Object[0]);
                bcqeVar2.c = applicationContext;
                bcqeVar2.d = bctgVar;
                bcqeVar2.e = a4;
                bcqeVar2.f = new bcpx(signRequestParams);
                bcqeVar2.g.n(bcnlVar4, str5, signRequestParams, bcqeVar2.e.a());
                if (!a4.a().isEmpty()) {
                    bcqeVar2.h(bcnlVar4, a3);
                } else {
                    bcnjVar3.f("No enabled transport found on the platform", new Object[0]);
                    bcqeVar2.g(bcnlVar4, ErrorCode.CONFIGURATION_UNSUPPORTED);
                }
            } catch (SecurityException e) {
                this.q.a(this.r, e);
                t(new ErrorResponseData(ErrorCode.BAD_REQUEST, "SecurityException"));
            } catch (Exception e2) {
                this.q.a(this.r, e2);
                t(new ErrorResponseData(ErrorCode.OTHER_ERROR));
            }
        } catch (SecurityException e3) {
            this.q.a(this.r, e3);
            t(new ErrorResponseData(ErrorCode.BAD_REQUEST, "SecurityException"));
        } catch (Exception e4) {
            this.q.a(this.r, e4);
            t(new ErrorResponseData(ErrorCode.OTHER_ERROR));
        }
    }

    public final void t(ResponseData responseData) {
        l.d("setActivityResult ".concat(responseData.a().toString()), new Object[0]);
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_EXTRA", responseData);
        setResult(-1, intent);
        finish();
    }
}
