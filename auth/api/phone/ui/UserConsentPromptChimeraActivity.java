package com.google.android.gms.auth.api.phone.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import com.google.android.gms.auth.api.phone.ui.UserConsentPromptChimeraActivity;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Status;
import defpackage.arco;
import defpackage.arcy;
import defpackage.arxd;
import defpackage.arxo;
import defpackage.asng;
import defpackage.assx;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.ebjq;
import defpackage.eiig;
import defpackage.ekgm;
import defpackage.qet;
import defpackage.zls;
import defpackage.zmg;
import defpackage.znh;
import defpackage.zni;
import defpackage.znr;
import defpackage.zns;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UserConsentPromptChimeraActivity extends qet {
    public zns k;
    public ebjq n;
    private zmg o;
    public final arxo j = new arxo("UserConsentPromptChimeraActivity");
    public RequestResult l = null;
    public int m = 0;

    public final void a(String str, String str2) {
        if (this.o == null) {
            this.o = new zmg(getApplicationContext());
        }
        zmg zmgVar = this.o;
        final ConsentPromptUserResponse consentPromptUserResponse = new ConsentPromptUserResponse();
        consentPromptUserResponse.b = str;
        consentPromptUserResponse.c = str2;
        consentPromptUserResponse.a = this.m;
        arcy arcyVar = new arcy();
        arcyVar.a = new arco() { // from class: zme
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                zmh zmhVar = (zmh) obj;
                int i = zmg.a;
                zkd zkdVar = (zkd) zmhVar.H();
                Context context = zmhVar.r;
                zkdVar.c(ConsentPromptUserResponse.this, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                arda.a(Status.b, (dfau) obj2);
            }
        };
        zmgVar.iT(arcyVar.a());
        RequestResult requestResult = this.l;
        eiig.x(requestResult);
        long j = requestResult.d;
        zns znsVar = this.k;
        Context applicationContext = getApplicationContext();
        ekgm ekgmVar = this.m == 1 ? ekgm.CLICK_AGREE : ekgm.CLICK_CANCEL;
        arxo arxoVar = zns.a;
        SmsRetrieverEvent smsRetrieverEvent = new SmsRetrieverEvent();
        zls.d(10, smsRetrieverEvent);
        zls.h((int) TimeUnit.MILLISECONDS.toSeconds(j), smsRetrieverEvent);
        zls.b(ekgmVar.d, smsRetrieverEvent);
        if (str != null) {
            zls.a(str, smsRetrieverEvent);
        }
        znsVar.k(applicationContext, new znr(smsRetrieverEvent, true));
        if (isFinishing()) {
            return;
        }
        finish();
    }

    public final void k(String str, RequestResult requestResult, String str2) {
        CharSequence charSequence;
        ebjq ebjqVar = new ebjq(this, R.style.BottomSheetDialogTheme);
        this.n = ebjqVar;
        ebjqVar.setCanceledOnTouchOutside(false);
        ebjq ebjqVar2 = this.n;
        View inflate = getLayoutInflater().inflate(R.layout.sms_user_consent_fragment, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.matched_sms)).setText(requestResult.b);
        TextView textView = (TextView) inflate.findViewById(R.id.consent_description);
        SpannableString spannableString = new SpannableString(str);
        try {
            charSequence = assx.b(this).h(str);
        } catch (PackageManager.NameNotFoundException unused) {
            this.j.m("Cannot find calling package: %s", str);
            charSequence = str;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            String string = getString(R.string.user_consent_description, new Object[]{charSequence});
            spannableString = new SpannableString(string);
            int indexOf = string.indexOf(charSequence.toString());
            spannableString.setSpan(new StyleSpan(1), indexOf, charSequence.length() + indexOf, 33);
        }
        textView.setText(spannableString);
        ((Button) inflate.findViewById(R.id.negative_button)).setOnClickListener(new View.OnClickListener() { // from class: zng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebjq ebjqVar3 = UserConsentPromptChimeraActivity.this.n;
                if (ebjqVar3 != null) {
                    ebjqVar3.cancel();
                }
            }
        });
        ((Button) inflate.findViewById(R.id.positive_button)).setOnClickListener(new zni(this, requestResult, str, str2));
        ebjqVar2.setContentView(inflate);
        this.n.setOnCancelListener(new znh(this, str, str2));
        this.n.show();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getApplicationContext();
        this.k = new zns();
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("com.google.android.gms.auth.api.phone.extra.verification_token")) {
            this.j.f("Illegal intent.", new Object[0]);
            finish();
            return;
        }
        if (bundle != null) {
            this.l = (RequestResult) bundle.getParcelable("saved_request_result");
        }
        final String q = asng.q(this);
        if (TextUtils.isEmpty(q)) {
            this.j.f("Activity was not launched via startActivityForResult().", new Object[0]);
            finish();
            return;
        }
        final VerificationToken verificationToken = (VerificationToken) arxd.b(intent, "com.google.android.gms.auth.api.phone.extra.verification_token", VerificationToken.CREATOR);
        eiig.x(verificationToken);
        RequestResult requestResult = this.l;
        if (requestResult != null) {
            k(q, requestResult, verificationToken.b);
            return;
        }
        zmg zmgVar = new zmg(getApplicationContext());
        this.o = zmgVar;
        arcy arcyVar = new arcy();
        arcyVar.a = new arco() { // from class: zmd
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                zmh zmhVar = (zmh) obj;
                int i = zmg.a;
                zkd zkdVar = (zkd) zmhVar.H();
                Context context = zmhVar.r;
                ((dfau) obj2).b(zkdVar.a(q, verificationToken, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true))));
            }
        };
        dfaq iO = zmgVar.iO(arcyVar.a());
        iO.z(new dfak() { // from class: zne
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                RequestResult requestResult2 = (RequestResult) obj;
                int i = requestResult2.a;
                UserConsentPromptChimeraActivity userConsentPromptChimeraActivity = UserConsentPromptChimeraActivity.this;
                String str = q;
                if (i != 1) {
                    if (i == 2) {
                        userConsentPromptChimeraActivity.k.k(userConsentPromptChimeraActivity, zns.u(str, 9));
                        userConsentPromptChimeraActivity.finish();
                        return;
                    } else if (i != 3) {
                        userConsentPromptChimeraActivity.j.f("Result canceled: %s", requestResult2);
                        userConsentPromptChimeraActivity.finish();
                        return;
                    } else {
                        userConsentPromptChimeraActivity.k.k(userConsentPromptChimeraActivity, zns.u(str, 7));
                        userConsentPromptChimeraActivity.finish();
                        return;
                    }
                }
                VerificationToken verificationToken2 = verificationToken;
                userConsentPromptChimeraActivity.l = requestResult2;
                zns znsVar = userConsentPromptChimeraActivity.k;
                long currentTimeMillis = System.currentTimeMillis() - verificationToken2.a;
                arxo arxoVar = zns.a;
                SmsRetrieverEvent smsRetrieverEvent = new SmsRetrieverEvent();
                zls.d(9, smsRetrieverEvent);
                int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis);
                smsRetrieverEvent.n |= 128;
                smsRetrieverEvent.h = seconds;
                if (str != null) {
                    zls.a(str, smsRetrieverEvent);
                }
                znsVar.k(userConsentPromptChimeraActivity, new znr(smsRetrieverEvent, true));
                userConsentPromptChimeraActivity.k(str, requestResult2, verificationToken2.b);
            }
        });
        iO.y(new dfah() { // from class: znf
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                UserConsentPromptChimeraActivity userConsentPromptChimeraActivity = UserConsentPromptChimeraActivity.this;
                userConsentPromptChimeraActivity.j.g("Internal service failed: %s", exc, new Object[0]);
                userConsentPromptChimeraActivity.finish();
            }
        });
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        ebjq ebjqVar = this.n;
        if (ebjqVar != null && ebjqVar.isShowing()) {
            this.n.dismiss();
        }
        this.o = null;
        super.onDestroy();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("saved_request_result", this.l);
    }
}
