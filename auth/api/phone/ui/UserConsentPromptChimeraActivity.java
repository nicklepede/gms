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
import com.google.android.gms.common.api.Status;
import defpackage.abls;
import defpackage.abmg;
import defpackage.abnh;
import defpackage.abni;
import defpackage.abnr;
import defpackage.abns;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.atzs;
import defpackage.auad;
import defpackage.aura;
import defpackage.auwr;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.edwd;
import defpackage.ekvl;
import defpackage.emty;
import defpackage.rxx;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UserConsentPromptChimeraActivity extends rxx {
    public abns k;
    public edwd n;
    private abmg o;
    public final auad j = new auad("UserConsentPromptChimeraActivity");
    public RequestResult l = null;
    public int m = 0;

    public final void a(String str, String str2) {
        if (this.o == null) {
            this.o = new abmg(getApplicationContext());
        }
        abmg abmgVar = this.o;
        final ConsentPromptUserResponse consentPromptUserResponse = new ConsentPromptUserResponse();
        consentPromptUserResponse.b = str;
        consentPromptUserResponse.c = str2;
        consentPromptUserResponse.a = this.m;
        atfn atfnVar = new atfn();
        atfnVar.a = new atfd() { // from class: abme
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                abmh abmhVar = (abmh) obj;
                int i = abmg.a;
                ((abkd) abmhVar.H()).c(ConsentPromptUserResponse.this, bsxa.a(abmhVar.r));
                atfp.a(Status.b, (dhma) obj2);
            }
        };
        abmgVar.ji(atfnVar.a());
        RequestResult requestResult = this.l;
        ekvl.y(requestResult);
        long j = requestResult.d;
        abns abnsVar = this.k;
        Context applicationContext = getApplicationContext();
        emty emtyVar = this.m == 1 ? emty.CLICK_AGREE : emty.CLICK_CANCEL;
        auad auadVar = abns.a;
        SmsRetrieverEvent smsRetrieverEvent = new SmsRetrieverEvent();
        abls.d(10, smsRetrieverEvent);
        abls.h((int) TimeUnit.MILLISECONDS.toSeconds(j), smsRetrieverEvent);
        abls.b(emtyVar.d, smsRetrieverEvent);
        if (str != null) {
            abls.a(str, smsRetrieverEvent);
        }
        abnsVar.k(applicationContext, new abnr(smsRetrieverEvent, true));
        if (isFinishing()) {
            return;
        }
        finish();
    }

    public final void k(String str, RequestResult requestResult, String str2) {
        CharSequence charSequence;
        edwd edwdVar = new edwd(this, R.style.BottomSheetDialogTheme);
        this.n = edwdVar;
        edwdVar.setCanceledOnTouchOutside(false);
        edwd edwdVar2 = this.n;
        View inflate = getLayoutInflater().inflate(R.layout.sms_user_consent_fragment, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.matched_sms)).setText(requestResult.b);
        TextView textView = (TextView) inflate.findViewById(R.id.consent_description);
        SpannableString spannableString = new SpannableString(str);
        try {
            charSequence = auwr.b(this).h(str);
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
        ((Button) inflate.findViewById(R.id.negative_button)).setOnClickListener(new View.OnClickListener() { // from class: abng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edwd edwdVar3 = UserConsentPromptChimeraActivity.this.n;
                if (edwdVar3 != null) {
                    edwdVar3.cancel();
                }
            }
        });
        ((Button) inflate.findViewById(R.id.positive_button)).setOnClickListener(new abni(this, requestResult, str, str2));
        edwdVar2.setContentView(inflate);
        this.n.setOnCancelListener(new abnh(this, str, str2));
        this.n.show();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getApplicationContext();
        this.k = new abns();
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("com.google.android.gms.auth.api.phone.extra.verification_token")) {
            this.j.f("Illegal intent.", new Object[0]);
            finish();
            return;
        }
        if (bundle != null) {
            this.l = (RequestResult) bundle.getParcelable("saved_request_result");
        }
        final String q = aura.q(this);
        if (TextUtils.isEmpty(q)) {
            this.j.f("Activity was not launched via startActivityForResult().", new Object[0]);
            finish();
            return;
        }
        final VerificationToken verificationToken = (VerificationToken) atzs.b(intent, "com.google.android.gms.auth.api.phone.extra.verification_token", VerificationToken.CREATOR);
        ekvl.y(verificationToken);
        RequestResult requestResult = this.l;
        if (requestResult != null) {
            k(q, requestResult, verificationToken.b);
            return;
        }
        abmg abmgVar = new abmg(getApplicationContext());
        this.o = abmgVar;
        atfn atfnVar = new atfn();
        atfnVar.a = new atfd() { // from class: abmd
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                abmh abmhVar = (abmh) obj;
                int i = abmg.a;
                ((dhma) obj2).b(((abkd) abmhVar.H()).a(q, verificationToken, bsxa.a(abmhVar.r)));
            }
        };
        dhlw jd = abmgVar.jd(atfnVar.a());
        jd.z(new dhlq() { // from class: abne
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                RequestResult requestResult2 = (RequestResult) obj;
                int i = requestResult2.a;
                UserConsentPromptChimeraActivity userConsentPromptChimeraActivity = UserConsentPromptChimeraActivity.this;
                String str = q;
                if (i != 1) {
                    if (i == 2) {
                        userConsentPromptChimeraActivity.k.k(userConsentPromptChimeraActivity, abns.u(str, 9));
                        userConsentPromptChimeraActivity.finish();
                        return;
                    } else if (i != 3) {
                        userConsentPromptChimeraActivity.j.f("Result canceled: %s", requestResult2);
                        userConsentPromptChimeraActivity.finish();
                        return;
                    } else {
                        userConsentPromptChimeraActivity.k.k(userConsentPromptChimeraActivity, abns.u(str, 7));
                        userConsentPromptChimeraActivity.finish();
                        return;
                    }
                }
                VerificationToken verificationToken2 = verificationToken;
                userConsentPromptChimeraActivity.l = requestResult2;
                abns abnsVar = userConsentPromptChimeraActivity.k;
                long currentTimeMillis = System.currentTimeMillis() - verificationToken2.a;
                auad auadVar = abns.a;
                SmsRetrieverEvent smsRetrieverEvent = new SmsRetrieverEvent();
                abls.d(9, smsRetrieverEvent);
                int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis);
                smsRetrieverEvent.n |= 128;
                smsRetrieverEvent.h = seconds;
                if (str != null) {
                    abls.a(str, smsRetrieverEvent);
                }
                abnsVar.k(userConsentPromptChimeraActivity, new abnr(smsRetrieverEvent, true));
                userConsentPromptChimeraActivity.k(str, requestResult2, verificationToken2.b);
            }
        });
        jd.y(new dhln() { // from class: abnf
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                UserConsentPromptChimeraActivity userConsentPromptChimeraActivity = UserConsentPromptChimeraActivity.this;
                userConsentPromptChimeraActivity.j.g("Internal service failed: %s", exc, new Object[0]);
                userConsentPromptChimeraActivity.finish();
            }
        });
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        edwd edwdVar = this.n;
        if (edwdVar != null && edwdVar.isShowing()) {
            this.n.dismiss();
        }
        this.o = null;
        super.onDestroy();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("saved_request_result", this.l);
    }
}
