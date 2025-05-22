package com.google.android.gms.wearable.backup.wear.lskfui.pin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.dmkf;
import defpackage.dmkm;
import defpackage.dmkn;
import defpackage.tiy;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PinPadViewV2 extends LinearLayout implements View.OnClickListener {
    public final ArrayList a;
    private final int b;
    private final int[] c;
    private final int[] d;

    public PinPadViewV2(Context context) {
        this(context, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            int length = iArr.length;
            if (i >= 12) {
                i = -1;
                break;
            } else if (iArr[i] == id) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        performHapticFeedback(3);
        int[] iArr2 = this.d;
        ArrayList arrayList = this.a;
        int i2 = iArr2[i];
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public PinPadViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinPadViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LocaleList locales;
        Locale locale;
        this.c = new int[]{R.id.button_0, R.id.button_1, R.id.button_2, R.id.button_3, R.id.button_4, R.id.button_5, R.id.button_6, R.id.button_7, R.id.button_8, R.id.button_9, R.id.button_enter, R.id.button_del};
        this.d = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 66, 67};
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tiy.m, R.attr.wearableLockPinPadStyle, 0);
        this.b = obtainStyledAttributes.getColor(1, obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        setLayoutDirection(0);
        inflate(context, R.layout.pin_pad_new, this);
        this.a = new ArrayList();
        locales = getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        NumberFormat decimalFormat = DecimalFormat.getInstance(locale);
        while (true) {
            int[] iArr = this.c;
            int length = iArr.length;
            if (i2 >= 12) {
                return;
            }
            View findViewById = findViewById(iArr[i2]);
            if (findViewById != null) {
                int i3 = this.c[i2];
                if (i3 != R.id.button_enter && i3 != R.id.button_del) {
                    ((TextView) findViewById).setText(decimalFormat.format(i2));
                    findViewById.setOnHoverListener(new dmkf(getContext()));
                }
                findViewById.setOnClickListener(this);
                dmkm dmkmVar = new dmkm(getContext(), this.b);
                dmkmVar.e = new dmkn(findViewById);
                findViewById.setBackground(new InsetDrawable((Drawable) dmkmVar, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom()));
            }
            i2++;
        }
    }
}
