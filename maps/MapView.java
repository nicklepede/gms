package com.google.android.gms.maps;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.aswd;
import defpackage.atwm;
import defpackage.atzb;
import defpackage.bbli;
import defpackage.bblj;
import defpackage.bblk;
import defpackage.bblm;
import defpackage.ceiq;
import defpackage.ceis;
import defpackage.cemi;
import defpackage.cenh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MapView extends FrameLayout {
    private final bblm a;

    public MapView(Context context) {
        super(context);
        this.a = new bblm(this, context, null);
        h();
    }

    private final void h() {
        setClickable(true);
    }

    public final void a(ceis ceisVar) {
        atzb.h("getMapAsync() must be called on the main thread");
        bblm bblmVar = this.a;
        ceiq ceiqVar = bblmVar.c;
        if (ceiqVar != null) {
            ceiqVar.a(ceisVar);
        } else {
            bblmVar.d.add(ceisVar);
        }
    }

    public final void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            bblm bblmVar = this.a;
            bblmVar.b(bundle, new bbli(bblmVar, bundle));
            if (bblmVar.c == null) {
                aswd aswdVar = aswd.a;
                Context context = getContext();
                int m = aswdVar.m(context);
                String c = atwm.c(context, m);
                String b = atwm.b(context, m);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(c);
                linearLayout.addView(textView);
                Intent k = aswdVar.k(context, m, null);
                if (k != null) {
                    Button button = new Button(context);
                    button.setId(R.id.button1);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(b);
                    linearLayout.addView(button);
                    button.setOnClickListener(new bblj(context, k));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void c() {
        bblm bblmVar = this.a;
        ceiq ceiqVar = bblmVar.c;
        if (ceiqVar == null) {
            bblmVar.a(1);
            return;
        }
        try {
            ceiqVar.b.c();
        } catch (RemoteException e) {
            throw new cenh(e);
        }
    }

    public final void d() {
        ceiq ceiqVar = this.a.c;
        if (ceiqVar != null) {
            try {
                ceiqVar.b.d();
            } catch (RemoteException e) {
                throw new cenh(e);
            }
        }
    }

    public final void e() {
        bblm bblmVar = this.a;
        ceiq ceiqVar = bblmVar.c;
        if (ceiqVar == null) {
            bblmVar.a(5);
            return;
        }
        try {
            ceiqVar.b.e();
        } catch (RemoteException e) {
            throw new cenh(e);
        }
    }

    public final void f() {
        bblm bblmVar = this.a;
        bblmVar.b(null, new bblk(bblmVar));
    }

    public final void g(Bundle bundle) {
        bblm bblmVar = this.a;
        ceiq ceiqVar = bblmVar.c;
        if (ceiqVar == null) {
            Bundle bundle2 = bblmVar.a;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            cemi.b(bundle, bundle3);
            ceiqVar.b.g(bundle3);
            cemi.b(bundle3, bundle);
        } catch (RemoteException e) {
            throw new cenh(e);
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new bblm(this, context, GoogleMapOptions.a(context, attributeSet));
        h();
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new bblm(this, context, GoogleMapOptions.a(context, attributeSet));
        h();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.a = new bblm(this, context, googleMapOptions);
        h();
    }
}
