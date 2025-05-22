package com.google.android.gms.octarine.ui.actionbar;

import android.content.Context;
import android.content.res.Resources;
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
import defpackage.bsur;
import defpackage.bsux;
import defpackage.bsuy;
import defpackage.cvhg;
import defpackage.cvhh;
import defpackage.euwq;
import defpackage.euwr;
import defpackage.ioj;
import defpackage.ulh;
import defpackage.wu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AccountSwitchingToolbar extends MaterialToolbar {
    public final TextView A;
    public final TextView B;
    public final ProductLockupView C;
    public CharSequence D;
    public euwr E;
    public boolean F;
    public int G;
    private final View J;
    private final ViewGroup K;
    private CharSequence L;
    private bsux M;

    public AccountSwitchingToolbar(Context context) {
        this(context, null);
    }

    public static Typeface N(Context context, int i, boolean z) {
        int i2;
        if (i == 2) {
            i2 = R.font.youtube_sans;
        } else {
            i2 = R.font.google_sans;
            if (z && Build.VERSION.SDK_INT >= 29) {
                i2 = R.font.google_sans_flex;
            }
        }
        try {
            return ioj.a(context, i2);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final void P(int i) {
        View view = this.J;
        wu wuVar = (wu) view.getLayoutParams();
        wuVar.a = i;
        view.setLayoutParams(wuVar);
    }

    private final void Q(int i, boolean z) {
        ProductLockupView productLockupView = this.C;
        productLockupView.c(productLockupView.getContext().getString(i));
        if (this.F) {
            if (bsur.d()) {
                productLockupView.setVisibility(true != z ? 8 : 0);
                productLockupView.a(2);
                return;
            } else {
                productLockupView.a(1);
                productLockupView.d(bsuy.a(getContext(), R.attr.colorOnSurface, R.color.google_grey700));
                return;
            }
        }
        this.K.setVisibility(8);
        productLockupView.setVisibility(0);
        if (bsur.d()) {
            productLockupView.a(2);
        } else {
            this.M = new bsux(productLockupView, bsuy.a(getContext(), R.attr.actionBarProductNameColor, R.color.google_grey700), bsuy.a(getContext(), R.attr.colorOnSurface, R.color.google_grey700));
        }
        productLockupView.d(bsuy.a(productLockupView.getContext(), R.attr.actionBarProductNameColor, R.color.google_grey700));
    }

    @Override // android.support.v7.widget.Toolbar
    public final void B(CharSequence charSequence) {
        this.D = charSequence;
        if (this.F) {
            TextView textView = this.A;
            textView.setVisibility(0);
            textView.setText(charSequence);
        } else {
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView2 = this.A;
                if (textView2.getVisibility() == 0) {
                    textView2.animate().alpha(0.0f).setDuration(300L).setListener(new cvhg(this));
                    return;
                } else {
                    textView2.setVisibility(8);
                    return;
                }
            }
            TextView textView3 = this.A;
            textView3.setText(charSequence);
            if (textView3.getVisibility() != 8) {
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(0);
                textView3.animate().alpha(1.0f).setDuration(300L).setListener(null);
            }
        }
    }

    public final void K(euwr euwrVar) {
        L(euwrVar, false);
    }

    public final void L(euwr euwrVar, boolean z) {
        this.E = euwrVar;
        int ordinal = euwrVar.ordinal();
        if (ordinal == 1) {
            this.C.setVisibility(8);
            this.K.setVisibility(0);
        } else if (ordinal == 2) {
            Q(R.string.common_google, z);
        } else {
            if (ordinal != 3) {
                return;
            }
            Q(R.string.common_asm_google_account_title, z);
        }
    }

    public final void M(boolean z) {
        bsux bsuxVar = this.M;
        if (bsuxVar != null) {
            bsuxVar.a(z, false);
        }
    }

    public final void O(int i) {
        this.G = i;
        Typeface N = N(getContext(), i, this.F);
        if (N != null) {
            TextView textView = this.A;
            textView.setTypeface(N);
            if (this.F) {
                textView.setTextAppearance(R.style.TextAppearance_Octarine_CollapsedTitle);
            } else {
                this.B.setTypeface(N);
            }
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final CharSequence j() {
        return this.L;
    }

    @Override // android.support.v7.widget.Toolbar
    public final CharSequence k() {
        if (this.F) {
            return null;
        }
        return this.D;
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
        savedState.e = this.E;
        savedState.f = this.G;
        return savedState;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void z(CharSequence charSequence) {
        if (this.F) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.B.setVisibility(8);
        } else {
            TextView textView = this.B;
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
        this.L = charSequence;
    }

    public AccountSwitchingToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.app_bar_custom_view, (ViewGroup) this, true);
        this.J = findViewById(R.id.app_bar_custom_view);
        this.K = (ViewGroup) findViewById(R.id.app_bar_title_container);
        this.B = (TextView) findViewById(R.id.action_bar_subtitle);
        this.A = (TextView) findViewById(R.id.action_bar_title);
        this.C = (ProductLockupView) findViewById(R.id.octarine_lockup);
        K(euwr.NORMAL);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_centered_logo_minimum_screen_width);
        if (ulh.b(context) || resources.getDisplayMetrics().widthPixels <= dimensionPixelSize) {
            P(8388627);
        } else {
            P(17);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class SavedState extends Toolbar.SavedState {
        public static final Parcelable.Creator CREATOR = new cvhh();
        euwr e;
        int f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.e = euwr.b(parcel.readInt());
            this.f = euwq.a(parcel.readInt());
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
