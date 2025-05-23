package com.google.android.gms.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import defpackage.dkwm;
import defpackage.dkwn;
import defpackage.dkyr;
import defpackage.dlpz;
import defpackage.dlqk;
import defpackage.eicm;
import defpackage.ekbn;
import defpackage.ekmu;
import defpackage.fvts;
import defpackage.iwe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FingerprintButton extends LinearLayout implements dkwm {
    ImageWithCaptionView a;
    TextView b;
    FingerprintManager c;
    public CancellationSignal d;
    public int e;
    public ekbn f;
    public LogContext g;
    public String h;
    public boolean i;
    FingerprintManager.AuthenticationCallback j;
    public FingerprintManager.CryptoObject k;
    public dlpz l;
    private Runnable m;
    private boolean n;

    public FingerprintButton(Context context) {
        super(context);
        this.i = true;
        this.n = false;
        g(context);
    }

    private final void g(Context context) {
        if (eicm.h(getContext())) {
            this.j = new dlqk(this);
            inflate(context, R.layout.wallet_view_fingerprint_button, this);
            this.b = (TextView) findViewById(R.id.help_text);
            this.a = (ImageWithCaptionView) findViewById(R.id.fingerprint_icon);
            this.c = (FingerprintManager) context.getSystemService(FingerprintManager.class);
            a();
        }
    }

    private final boolean h() {
        return this.f != null;
    }

    public final void a() {
        this.h = null;
        e(0);
        d();
    }

    @Override // defpackage.dkwm
    public final void aq(Bundle bundle) {
        if (!"completeFingerprintAuthentication".equals(dkwn.b(bundle)) || this.l == null || getContext() == null || getVisibility() != 0) {
            return;
        }
        dlpz dlpzVar = this.l;
        FingerprintManager.CryptoObject cryptoObject = this.k;
        dlpzVar.A(1, cryptoObject != null ? cryptoObject.getSignature() : null);
    }

    public final void b(String str) {
        requestFocus();
        this.h = str;
        e(3);
    }

    public final void c(boolean z) {
        if (this.n != z) {
            this.n = z;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
            if (this.n) {
                setOrientation(1);
                TextView textView = this.b;
                int[] iArr = iwe.a;
                this.b.setPadding(0, textView.getPaddingStart(), 0, 0);
                layoutParams.gravity = 1;
            } else {
                setOrientation(0);
                this.b.setPadding(this.b.getPaddingTop(), 0, 0, 0);
                layoutParams.gravity = 8388611;
            }
            setLayoutParams(layoutParams);
        }
    }

    public final void d() {
        if (h()) {
            boolean z = false;
            if (this.l != null && this.i && isEnabled() && getVisibility() == 0) {
                z = true;
            }
            CancellationSignal cancellationSignal = this.d;
            if (cancellationSignal == null || cancellationSignal.isCanceled()) {
                if (z) {
                    if (this.c != null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        this.d = cancellationSignal2;
                        this.c.authenticate(this.k, cancellationSignal2, 0, this.j, null);
                        return;
                    }
                    return;
                }
            } else if (z) {
                return;
            }
            CancellationSignal cancellationSignal3 = this.d;
            if (cancellationSignal3 != null) {
                cancellationSignal3.cancel();
                this.d = null;
            }
        }
    }

    public final void e(int i) {
        this.e = i;
        if (h()) {
            if (!eicm.h(getContext())) {
                throw new IllegalStateException("Fingerprint auth not supported on this device.");
            }
            this.a.clearColorFilter();
            this.b.setTextAppearance(R.style.WalletInfoMessageText);
            int i2 = this.e;
            ekmu ekmuVar = null;
            if (i2 == 0) {
                TextView textView = this.b;
                ekbn ekbnVar = this.f;
                textView.setText((ekbnVar == null || (2 & ekbnVar.b) == 0) ? null : ekbnVar.d);
                ImageWithCaptionView imageWithCaptionView = this.a;
                ekbn ekbnVar2 = this.f;
                if (ekbnVar2 != null && (ekmuVar = ekbnVar2.e) == null) {
                    ekmuVar = ekmu.a;
                }
                imageWithCaptionView.o(ekmuVar, dkyr.o(getContext()));
                return;
            }
            if (i2 == 1) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.colorAccent});
                int color = obtainStyledAttributes.getColor(0, -16777216);
                obtainStyledAttributes.recycle();
                this.b.setTextColor(color);
                TextView textView2 = this.b;
                ekbn ekbnVar3 = this.f;
                textView2.setText((ekbnVar3 == null || (ekbnVar3.b & 8) == 0) ? null : ekbnVar3.f);
                ImageWithCaptionView imageWithCaptionView2 = this.a;
                ekbn ekbnVar4 = this.f;
                if (ekbnVar4 != null && (ekmuVar = ekbnVar4.g) == null) {
                    ekmuVar = ekmu.a;
                }
                imageWithCaptionView2.o(ekmuVar, dkyr.o(getContext()));
                this.a.setColorFilter(color);
                removeCallbacks(this.m);
                dkwn a = dkwn.a(this, "completeFingerprintAuthentication");
                this.m = a;
                postDelayed(a, fvts.a.lK().b());
                return;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("Invalid state for FingerprintButton");
                }
                this.b.setTextColor(getResources().getColor(R.color.wallet_uic_error_text_color_light));
                this.b.setText(this.h);
                ImageWithCaptionView imageWithCaptionView3 = this.a;
                ekbn ekbnVar5 = this.f;
                if (ekbnVar5 != null && (ekmuVar = ekbnVar5.i) == null) {
                    ekmuVar = ekmu.a;
                }
                imageWithCaptionView3.o(ekmuVar, dkyr.o(getContext()));
                return;
            }
            this.b.setTextColor(getResources().getColor(R.color.wallet_uic_error_text_color_light));
            TextView textView3 = this.b;
            ekbn ekbnVar6 = this.f;
            textView3.setText((ekbnVar6 == null || (ekbnVar6.b & 32) == 0) ? null : ekbnVar6.h);
            ImageWithCaptionView imageWithCaptionView4 = this.a;
            ekbn ekbnVar7 = this.f;
            if (ekbnVar7 != null && (ekmuVar = ekbnVar7.i) == null) {
                ekmuVar = ekmu.a;
            }
            imageWithCaptionView4.o(ekmuVar, dkyr.o(getContext()));
        }
    }

    public final void f(dlpz dlpzVar) {
        this.l = dlpzVar;
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstance"));
        this.h = bundle.getString("error");
        e(bundle.getInt("state"));
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        removeCallbacks(this.m);
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstance", super.onSaveInstanceState());
        bundle.putInt("state", this.e);
        bundle.putString("error", this.h);
        return bundle;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        boolean isEnabled = isEnabled();
        super.setEnabled(z);
        if (isEnabled || !z) {
            d();
        } else {
            a();
        }
        this.a.setEnabled(z);
        this.b.setEnabled(z);
        this.b.setAlpha(true != z ? 0.3f : 1.0f);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (visibility == 0 || i != 0) {
            d();
        } else {
            a();
        }
    }

    public FingerprintButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = true;
        this.n = false;
        g(context);
    }

    public FingerprintButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
        this.n = false;
        g(context);
    }

    public FingerprintButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = true;
        this.n = false;
        g(context);
    }
}
