package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.setupdesign.GlifLayout;
import defpackage.acnd;
import defpackage.acne;
import defpackage.acnh;
import defpackage.afks;
import defpackage.efsu;
import defpackage.fmyg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GlifAuthAccountLayoutV2 extends LinearLayout implements acne, acnh {
    private final GlifLayout a;
    private final View b;

    public GlifAuthAccountLayoutV2(Context context) {
        this(context, null);
    }

    @Override // defpackage.acne
    public final void b(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    @Override // defpackage.acne
    public final void c(int i) {
        if (i == -1) {
            afks.b(getContext(), this.a);
        } else {
            afks.a(getContext(), this.a, i);
        }
    }

    @Override // defpackage.acne
    public final void e(CharSequence charSequence) {
        this.a.G(charSequence);
    }

    @Override // defpackage.acne
    public final void g() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // defpackage.acnh
    public final void h(Window window, Context context) {
        if (fmyg.c()) {
            return;
        }
        ((efsu) this.a.q(efsu.class)).b(window, context);
    }

    @Override // defpackage.acnh
    public final void i(Window window) {
        if (fmyg.c()) {
            return;
        }
        efsu.c(window);
    }

    @Override // defpackage.acnh
    public final void j(Window window) {
        i(window);
    }

    public GlifAuthAccountLayoutV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GlifAuthAccountLayoutV2(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            boolean r7 = defpackage.auus.a(r5)
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L34
            boolean r7 = r5 instanceof defpackage.ryr
            if (r7 == 0) goto L17
            r7 = r5
            ryr r7 = (defpackage.ryr) r7
            android.content.Intent r7 = r7.getIntent()
            goto L24
        L17:
            boolean r7 = r5 instanceof android.app.Activity
            if (r7 == 0) goto L23
            r7 = r5
            android.app.Activity r7 = (android.app.Activity) r7
            android.content.Intent r7 = r7.getIntent()
            goto L24
        L23:
            r7 = 0
        L24:
            boolean r7 = defpackage.eftg.b(r7)
            if (r7 == 0) goto L2b
            goto L34
        L2b:
            boolean r7 = defpackage.aury.l(r5)
            if (r7 == 0) goto L32
            goto L34
        L32:
            r7 = r0
            goto L35
        L34:
            r7 = r1
        L35:
            esdc r2 = defpackage.fmtw.b()
            boolean r2 = defpackage.ausj.c(r2)
            if (r2 == 0) goto L57
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int[] r3 = defpackage.tiy.f
            android.content.res.TypedArray r6 = r2.obtainStyledAttributes(r6, r3, r0, r0)
            boolean r2 = r6.getBoolean(r0, r1)     // Catch: java.lang.Throwable -> L52
            r7 = r7 & r2
            r6.recycle()
            goto L57
        L52:
            r5 = move-exception
            r6.recycle()
            throw r5
        L57:
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r5)
            android.view.LayoutInflater r6 = r6.cloneInContext(r5)
            atmm r2 = new atmm
            r2.<init>()
            r6.setFactory2(r2)
            if (r1 == r7) goto L6d
            r7 = 2131624193(0x7f0e0101, float:1.8875559E38)
            goto L70
        L6d:
            r7 = 2131624194(0x7f0e0102, float:1.887556E38)
        L70:
            r6.inflate(r7, r4)
            r6 = 2131430288(0x7f0b0b90, float:1.8482273E38)
            android.view.View r6 = r4.findViewById(r6)
            com.google.android.setupdesign.GlifLayout r6 = (com.google.android.setupdesign.GlifLayout) r6
            r4.a = r6
            r6.K(r0)
            boolean r7 = r6 instanceof com.google.android.setupdesign.GlifLoadingLayout
            if (r7 == 0) goto La0
            r7 = r6
            com.google.android.setupdesign.GlifLoadingLayout r7 = (com.google.android.setupdesign.GlifLoadingLayout) r7
            java.lang.String r0 = "account"
            r7.e(r0)
            r7 = 2131433007(0x7f0b162f, float:1.8487788E38)
            android.view.View r7 = r6.findViewById(r7)
            if (r7 != 0) goto L9d
            r7 = 2131433011(0x7f0b1633, float:1.8487796E38)
            android.view.View r7 = r6.findViewById(r7)
        L9d:
            r4.b = r7
            goto La9
        La0:
            r7 = 2131431976(0x7f0b1228, float:1.8485696E38)
            android.view.View r7 = r6.findViewById(r7)
            r4.b = r7
        La9:
            android.view.View r7 = r4.b
            if (r7 == 0) goto Lb2
            r0 = 8
            r7.setVisibility(r0)
        Lb2:
            defpackage.afks.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.common.GlifAuthAccountLayoutV2.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // defpackage.acne
    public final void f() {
    }

    @Override // defpackage.acne
    public final void a(boolean z) {
    }

    @Override // defpackage.acne
    public final void d(acnd acndVar) {
    }
}
