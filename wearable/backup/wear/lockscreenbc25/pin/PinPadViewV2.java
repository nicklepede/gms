package com.google.android.gms.wearable.backup.wear.lockscreenbc25.pin;

import android.content.Context;
import android.graphics.Rect;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.lockscreenbc25.pin.PinPadViewV2;
import defpackage.djxe;
import defpackage.djxf;
import defpackage.djxg;
import defpackage.djxq;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PinPadViewV2 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    private static final int[] d = {R.id.row_1, R.id.row_2, R.id.row_3, R.id.row_4};
    public final ArrayList a;
    public final int[] b;
    private Consumer e;
    private final NumberFormat f;
    private Function g;
    private final Rect h;

    public PinPadViewV2(Context context) {
        this(context, null);
    }

    private static float b(Context context, int i, int i2) {
        return context.getResources().getFraction(i, i2, i2);
    }

    private final djxg c(final int i) {
        return new djxe(this.f.format(i), new Runnable() { // from class: djxy
            @Override // java.lang.Runnable
            public final void run() {
                PinPadViewV2 pinPadViewV2 = PinPadViewV2.this;
                int i2 = pinPadViewV2.b[i];
                pinPadViewV2.a();
            }
        });
    }

    public final void a() {
        ArrayList arrayList = this.a;
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.h;
        rect.set(i, i2, i3, i4);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Objects.requireNonNull(new Object[]{rect}[0]));
        setSystemGestureExclusionRects(DesugarCollections.unmodifiableList(arrayList));
    }

    public PinPadViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinPadViewV2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new Function() { // from class: djxu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new djxq((djxg[]) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    private PinPadViewV2(Context context, AttributeSet attributeSet, int i, Function function) {
        super(context, attributeSet, i);
        LocaleList locales;
        Locale locale;
        Object apply;
        Object apply2;
        this.h = new Rect();
        this.b = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 66, 67};
        locales = getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        this.f = DecimalFormat.getInstance(locale);
        this.g = function;
        setLayoutDirection(0);
        inflate(context, R.layout.pin_pad_m3, this);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int round = Math.round(b(context, R.fraction.pin_pad_m3_horizontal_padding_percent, displayMetrics.widthPixels));
        setPadding(round, Math.round(b(context, R.fraction.pin_pad_m3_top_padding_percent, displayMetrics.heightPixels)), round, Math.round(b(context, R.fraction.pin_pad_m3_bottom_padding_percent, displayMetrics.heightPixels)));
        this.a = new ArrayList();
        for (int i2 = 0; i2 < 3; i2++) {
            ComposeView composeView = (ComposeView) findViewById(d[i2]);
            djxg[] djxgVarArr = new djxg[3];
            for (int i3 = 0; i3 < 3; i3++) {
                djxgVarArr[i3] = c((i2 * 3) + i3 + 1);
            }
            apply2 = this.g.apply(djxgVarArr);
            ((djxq) apply2).a(composeView);
        }
        djxg[] djxgVarArr2 = {new djxf(getContext().getString(R.string.keyguard_accessibility_delete_button), R.drawable.ic_backspace_new, new Runnable() { // from class: djxv
            @Override // java.lang.Runnable
            public final void run() {
                PinPadViewV2.this.a();
            }
        }), c(0), new djxf(getContext().getString(R.string.keyguard_accessibility_enter_button), R.drawable.ic_check_new, new Runnable() { // from class: djxw
            @Override // java.lang.Runnable
            public final void run() {
                PinPadViewV2.this.a();
            }
        })};
        ComposeView composeView2 = (ComposeView) findViewById(d[3]);
        apply = this.g.apply(djxgVarArr2);
        final djxq djxqVar = (djxq) apply;
        djxqVar.a(composeView2);
        Consumer consumer = new Consumer() { // from class: djxx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void q(Object obj) {
                Boolean bool = (Boolean) obj;
                int i4 = PinPadViewV2.c;
                bool.booleanValue();
                djxq.this.b[2].b(bool);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        this.e = consumer;
        consumer.q(false);
    }
}
