package com.google.android.gms.octarine.ui.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.bqnc;
import defpackage.bqni;
import defpackage.bqnj;
import defpackage.csvm;
import defpackage.csye;
import defpackage.csyf;
import defpackage.eshb;
import defpackage.eshc;
import defpackage.fjul;
import defpackage.ims;
import defpackage.sqg;
import defpackage.wp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AccountSwitchingToolbar extends MaterialToolbar {
    public final TextView A;
    public final ProductLockupView B;
    public eshc C;
    public int D;
    private final View E;
    private ViewGroup H;
    private TextView I;
    private CharSequence J;
    private CharSequence K;
    private bqni L;

    public AccountSwitchingToolbar(Context context) {
        this(context, null);
    }

    public static Typeface N(Context context, int i) {
        try {
            return ims.a(context, i == 2 ? R.font.youtube_sans : (!fjul.i() || Build.VERSION.SDK_INT < 29) ? R.font.google_sans : R.font.google_sans_flex);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final void Q(int i) {
        if (fjul.i()) {
            return;
        }
        View view = this.E;
        wp wpVar = (wp) view.getLayoutParams();
        wpVar.a = i;
        view.setLayoutParams(wpVar);
    }

    private final void R(int i, boolean z) {
        ViewGroup viewGroup;
        if (!fjul.i() && (viewGroup = this.H) != null) {
            viewGroup.setVisibility(8);
        }
        ProductLockupView productLockupView = this.B;
        productLockupView.c(productLockupView.getContext().getString(i));
        if (fjul.i()) {
            if (!bqnc.d()) {
                productLockupView.a(1);
                return;
            } else {
                productLockupView.setVisibility(true == z ? 0 : 8);
                productLockupView.a(2);
                return;
            }
        }
        productLockupView.setVisibility(0);
        if (bqnc.d()) {
            productLockupView.a(2);
        } else {
            this.L = new bqni(productLockupView, bqnj.a(getContext(), R.attr.actionBarProductNameColor, R.color.google_grey700), bqnj.a(getContext(), R.attr.colorOnSurface, R.color.google_grey700));
        }
        productLockupView.d(bqnj.a(productLockupView.getContext(), R.attr.actionBarProductNameColor, R.color.google_grey700));
    }

    @Override // android.support.v7.widget.Toolbar
    public final void B(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.A;
            if (textView.getVisibility() == 0) {
                textView.animate().alpha(0.0f).setDuration(300L).setListener(new csye(this));
            } else {
                textView.setVisibility(8);
            }
        } else {
            TextView textView2 = this.A;
            textView2.setText(charSequence);
            if (textView2.getVisibility() == 8) {
                textView2.setVisibility(0);
                textView2.animate().alpha(1.0f).setDuration(300L).setListener(null);
            } else {
                textView2.setVisibility(0);
            }
        }
        this.J = charSequence;
    }

    public final void K(eshc eshcVar) {
        L(eshcVar, false);
    }

    public final void L(eshc eshcVar, boolean z) {
        ViewGroup viewGroup;
        this.C = eshcVar;
        int ordinal = eshcVar.ordinal();
        if (ordinal == 1) {
            this.B.setVisibility(8);
            if (fjul.i() || (viewGroup = this.H) == null) {
                return;
            }
            viewGroup.setVisibility(0);
            return;
        }
        if (ordinal == 2) {
            R(R.string.common_google, z);
        } else {
            if (ordinal != 3) {
                return;
            }
            R(R.string.common_asm_google_account_title, z);
        }
    }

    public final void M(boolean z) {
        bqni bqniVar = this.L;
        if (bqniVar != null) {
            bqniVar.a(z);
        }
    }

    public final void O(int i) {
        TextView textView;
        this.D = i;
        Typeface N = N(getContext(), i);
        if (N != null) {
            this.A.setTypeface(N);
            if (fjul.i() || (textView = this.I) == null) {
                return;
            }
            textView.setTypeface(N);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final CharSequence j() {
        return this.K;
    }

    @Override // android.support.v7.widget.Toolbar
    public final CharSequence k() {
        if (fjul.i()) {
            return null;
        }
        return this.J;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        K(savedState.e);
        O(savedState.f);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.e = this.C;
        savedState.f = this.D;
        return savedState;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void z(CharSequence charSequence) {
        if (fjul.i() || this.I == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.I.setVisibility(8);
        } else {
            this.I.setText(charSequence);
            this.I.setVisibility(0);
        }
        this.K = charSequence;
    }

    public AccountSwitchingToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(true != fjul.i() ? R.layout.app_bar_custom_view1 : R.layout.app_bar_custom_view, (ViewGroup) this, true);
        this.E = findViewById(R.id.app_bar_custom_view);
        TextView textView = (TextView) findViewById(R.id.action_bar_title);
        this.A = textView;
        this.B = (ProductLockupView) findViewById(R.id.octarine_lockup);
        if (!fjul.i()) {
            textView.setVisibility(8);
            textView.setTextAppearance(R.style.ActionBarTitleTextAppearance);
            textView.setTextColor(bqnj.a(context, R.attr.actionBarOnBackground, R.color.google_grey900));
            TextView textView2 = (TextView) findViewById(R.id.action_bar_subtitle);
            this.I = textView2;
            textView2.setTextAppearance(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
            this.I.setTextColor(bqnj.a(context, R.attr.actionBarOnBackground, R.color.google_grey900));
            this.H = (ViewGroup) findViewById(R.id.app_bar_title_container);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, csvm.a);
            K(eshc.b(obtainStyledAttributes.getInt(0, 1)));
            obtainStyledAttributes.recycle();
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_centered_logo_minimum_screen_width);
        if (sqg.b(context) || resources.getDisplayMetrics().widthPixels <= dimensionPixelSize) {
            Q(8388627);
        } else {
            Q(17);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class SavedState extends Toolbar.SavedState {
        public static final Parcelable.Creator CREATOR = new csyf();
        eshc e;
        int f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.e = eshc.b(parcel.readInt());
            this.f = eshb.a(parcel.readInt());
        }

        @Override // android.support.v7.widget.Toolbar.SavedState, androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.e.e);
            int i2 = this.f;
            parcel.writeInt(i2 != 0 ? i2 - 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
