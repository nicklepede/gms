package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.android.settingslib.widget.TopIntroPreference;
import com.google.android.gms.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class TopIntroPreferenceWithLearnMore extends TopIntroPreference {
    public LinearProgressIndicator a;
    public boolean b;
    private final CharSequence c;
    private final LearnMoreSpan d;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    final class LearnMoreSpan extends URLSpan {
        public View.OnClickListener a;

        public LearnMoreSpan() {
            super("");
            this.a = null;
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            View.OnClickListener onClickListener = this.a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public TopIntroPreferenceWithLearnMore(Context context, CharSequence charSequence) {
        super(context);
        this.b = false;
        this.c = charSequence;
        this.d = new LearnMoreSpan();
        this.B = R.layout.top_intro_with_learn_more;
    }

    @Override // com.android.settingslib.widget.TopIntroPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) mfaVar.D(R.id.progress_horizontal);
        this.a = linearProgressIndicator;
        if (linearProgressIndicator != null) {
            linearProgressIndicator.setAccessibilityLiveRegion(1);
            this.a.setVisibility(true != this.b ? 8 : 0);
        }
        TextView textView = (TextView) mfaVar.a.findViewById(R.id.top_intro_learn_more);
        if (textView == null) {
            return;
        }
        LearnMoreSpan learnMoreSpan = this.d;
        if (learnMoreSpan.a == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        SpannableString spannableString = new SpannableString(this.c);
        spannableString.setSpan(learnMoreSpan, 0, spannableString.length(), 0);
        textView.setText(spannableString);
    }

    public final void o(View.OnClickListener onClickListener) {
        LearnMoreSpan learnMoreSpan = this.d;
        if (onClickListener == learnMoreSpan.a) {
            return;
        }
        learnMoreSpan.a = onClickListener;
        d();
    }
}
