package com.google.android.gms.mdm.settings;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.settingslib.widget.RadioButtonPreference;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.mdm.settings.RadioButtonPreferenceWithDropdown;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import defpackage.arwm;
import defpackage.cczh;
import defpackage.cczi;
import defpackage.iuo;
import defpackage.iwl;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class RadioButtonPreferenceWithDropdown extends RadioButtonPreference {
    public boolean c;
    public View d;
    public CircularProgressIndicator e;
    private final int f;
    private ImageView g;

    public RadioButtonPreferenceWithDropdown(Context context, int i) {
        super(context, null);
        this.f = i;
    }

    private final ValueAnimator ak(int i, int i2) {
        arwm.s(this.d);
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cczf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = RadioButtonPreferenceWithDropdown.this.d;
                if (view == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                arwm.s(layoutParams);
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        });
        return ofInt;
    }

    @Override // com.android.settingslib.widget.RadioButtonPreference, androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        this.d = kmpVar.D(R.id.summary_container);
        TextView textView = (TextView) kmpVar.D(android.R.id.summary);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.g = (ImageView) kmpVar.D(R.id.radio_extra_widget);
        this.e = (CircularProgressIndicator) kmpVar.D(R.id.progress_indicator);
        View D = kmpVar.D(R.id.radio_preference_frame);
        if (D != null) {
            int i = this.f;
            D.setBackgroundResource(i != 0 ? i != 1 ? R.drawable.fmd_radio_bottom_rounded_background : R.drawable.fmd_radio_top_rounded_background : R.drawable.fmd_radio_middle_rounded_background);
        }
        aj(false);
    }

    public final void ai() {
        this.c = true;
        aj(false);
    }

    public final void aj(boolean z) {
        View view = this.d;
        if (view != null) {
            if (!z) {
                view.setVisibility(true != this.c ? 8 : 0);
                ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                }
            } else if (this.c) {
                view.measure(View.MeasureSpec.makeMeasureSpec(((View) view.getParent()).getWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = view.getMeasuredHeight();
                view.measure(-1, -2);
                ValueAnimator ak = ak(1, measuredHeight);
                ak.setInterpolator(new DecelerateInterpolator());
                ak.addListener(new cczh(this));
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                arwm.s(layoutParams2);
                layoutParams2.height = 1;
                view.setVisibility(0);
                ak.start();
            } else {
                ValueAnimator ak2 = ak(view.getMeasuredHeight(), 0);
                ak2.setInterpolator(new DecelerateInterpolator());
                ak2.addListener(new cczi(this));
                ak2.start();
            }
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setImageResource(true != this.c ? R.drawable.expand_icon : R.drawable.collapse_icon);
            iuo.o(this.g, iwl.e, this.j.getString(true != this.c ? R.string.expand : R.string.collapse), null);
            this.g.setContentDescription(this.r);
        }
    }
}
