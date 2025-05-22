package com.google.android.gms.wallet.ui.verifypin;

import android.content.Context;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.R;
import defpackage.dlud;
import defpackage.nvc;
import defpackage.nvl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PinDotsView extends LinearLayout {
    public static final /* synthetic */ int a = 0;
    private final LottieAnimationView[] b;
    private int c;

    public PinDotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.wallet_view_pin_dots, (ViewGroup) this, true);
        LottieAnimationView[] lottieAnimationViewArr = {(LottieAnimationView) findViewById(R.id.pin_entry_1), (LottieAnimationView) findViewById(R.id.pin_entry_2), (LottieAnimationView) findViewById(R.id.pin_entry_3), (LottieAnimationView) findViewById(R.id.pin_entry_4)};
        this.b = lottieAnimationViewArr;
        for (int i = 0; i < 4; i++) {
            lottieAnimationViewArr[i].setTag(false);
        }
    }

    static final String d(int i, int i2) {
        int i3 = i2 + 1;
        return i != 0 ? i != 1 ? i != 2 ? String.format("verifypin/fail_%02d.json", Integer.valueOf(i3)) : String.format("verifypin/success_%02d.json", Integer.valueOf(i3)) : String.format("verifypin/load_%02d.json", Integer.valueOf(i3)) : String.format("verifypin/dot_%02d.json", Integer.valueOf(i3));
    }

    private final float e() {
        try {
            return Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale");
        } catch (Settings.SettingNotFoundException unused) {
            return 1.0f;
        }
    }

    public final long a() {
        LottieAnimationView[] lottieAnimationViewArr = this.b;
        int length = lottieAnimationViewArr.length;
        return (long) ((lottieAnimationViewArr[3].g != null ? (long) r0.a() : 0L) * e());
    }

    public final void b(int i) {
        int i2 = 0;
        while (true) {
            LottieAnimationView[] lottieAnimationViewArr = this.b;
            int length = lottieAnimationViewArr.length;
            if (i2 >= 4) {
                return;
            }
            LottieAnimationView lottieAnimationView = lottieAnimationViewArr[i2];
            Context context = getContext();
            String d = d(i, i2);
            nvl.g(context, d).e(new nvc(new dlud(lottieAnimationView, i)));
            i2++;
        }
    }

    public final void c(int i) {
        if (i >= 0) {
            LottieAnimationView[] lottieAnimationViewArr = this.b;
            int length = lottieAnimationViewArr.length;
            if (i <= 4) {
                this.c = i;
                int i2 = 0;
                while (true) {
                    int length2 = lottieAnimationViewArr.length;
                    if (i2 >= 4) {
                        return;
                    }
                    LottieAnimationView lottieAnimationView = lottieAnimationViewArr[i2];
                    lottieAnimationView.k(d(0, i2));
                    boolean booleanValue = ((Boolean) lottieAnimationView.getTag()).booleanValue();
                    if (i2 < this.c && !booleanValue) {
                        lottieAnimationView.p(0.0f);
                        lottieAnimationView.hL();
                        lottieAnimationView.setTag(true);
                        lottieAnimationView.setContentDescription(getResources().getString(R.string.wallet_dot_active));
                    }
                    if (i2 >= this.c && booleanValue) {
                        lottieAnimationView.s(-1.0f);
                        lottieAnimationView.hL();
                        lottieAnimationView.setContentDescription(getResources().getString(R.string.wallet_dot_inactive));
                        lottieAnimationView.setTag(false);
                    }
                    i2++;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
