package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.setupdesign.GlifLayout;
import defpackage.aand;
import defpackage.aane;
import defpackage.aanh;
import defpackage.adkl;
import defpackage.edfz;
import defpackage.fkdo;
import defpackage.fkhr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GlifAuthAccountLayoutV2 extends LinearLayout implements aane, aanh {
    private final GlifLayout a;
    private final View b;

    public GlifAuthAccountLayoutV2(Context context) {
        this(context, null);
    }

    @Override // defpackage.aane
    public final void b(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    @Override // defpackage.aane
    public final void c(int i) {
        if (i == -1) {
            if (fkdo.n()) {
                adkl.b(getContext(), this.a);
                return;
            }
            i = -1;
        }
        adkl.a(getContext(), this.a, i);
    }

    @Override // defpackage.aane
    public final void e(CharSequence charSequence) {
        this.a.G(charSequence);
    }

    @Override // defpackage.aane
    public final void g() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // defpackage.aanh
    public final void h(Window window, Context context) {
        if (fkhr.c()) {
            return;
        }
        ((edfz) this.a.q(edfz.class)).b(window, context);
    }

    @Override // defpackage.aanh
    public final void i(Window window) {
        if (fkhr.c()) {
            return;
        }
        edfz.c(window);
    }

    @Override // defpackage.aanh
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
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GlifAuthAccountLayoutV2(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            boolean r7 = defpackage.asqy.a(r5)
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L34
            boolean r7 = r5 instanceof defpackage.qfn
            if (r7 == 0) goto L17
            r7 = r5
            qfn r7 = (defpackage.qfn) r7
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
            boolean r7 = defpackage.edgl.b(r7)
            if (r7 == 0) goto L2b
            goto L34
        L2b:
            boolean r7 = defpackage.asoe.l(r5)
            if (r7 == 0) goto L32
            goto L34
        L32:
            r7 = r0
            goto L35
        L34:
            r7 = r1
        L35:
            eppd r2 = defpackage.fkdk.b()
            boolean r2 = defpackage.asop.c(r2)
            if (r2 == 0) goto L57
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int[] r3 = defpackage.rpq.f
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
            arjx r2 = new arjx
            r2.<init>()
            r6.setFactory2(r2)
            if (r1 == r7) goto L6d
            r7 = 2131624192(0x7f0e0100, float:1.8875557E38)
            goto L70
        L6d:
            r7 = 2131624193(0x7f0e0101, float:1.8875559E38)
        L70:
            r6.inflate(r7, r4)
            r6 = 2131430278(0x7f0b0b86, float:1.8482252E38)
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
            r7 = 2131432968(0x7f0b1608, float:1.8487708E38)
            android.view.View r7 = r6.findViewById(r7)
            if (r7 != 0) goto L9d
            r7 = 2131432972(0x7f0b160c, float:1.8487717E38)
            android.view.View r7 = r6.findViewById(r7)
        L9d:
            r4.b = r7
            goto La9
        La0:
            r7 = 2131431948(0x7f0b120c, float:1.848564E38)
            android.view.View r7 = r6.findViewById(r7)
            r4.b = r7
        La9:
            android.view.View r7 = r4.b
            if (r7 == 0) goto Lb2
            r0 = 8
            r7.setVisibility(r0)
        Lb2:
            boolean r7 = defpackage.fkdo.n()
            if (r7 == 0) goto Lbb
            defpackage.adkl.b(r5, r6)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.common.GlifAuthAccountLayoutV2.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // defpackage.aane
    public final void f() {
    }

    @Override // defpackage.aane
    public final void a(boolean z) {
    }

    @Override // defpackage.aane
    public final void d(aand aandVar) {
    }
}
