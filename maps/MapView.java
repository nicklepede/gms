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
import defpackage.aqto;
import defpackage.artx;
import defpackage.arwm;
import defpackage.azhm;
import defpackage.azhn;
import defpackage.azho;
import defpackage.azhq;
import defpackage.cbzw;
import defpackage.cbzy;
import defpackage.ccdo;
import defpackage.ccen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MapView extends FrameLayout {
    private final azhq a;

    public MapView(Context context) {
        super(context);
        this.a = new azhq(this, context, null);
        h();
    }

    private final void h() {
        setClickable(true);
    }

    public final void a(cbzy cbzyVar) {
        arwm.h("getMapAsync() must be called on the main thread");
        azhq azhqVar = this.a;
        cbzw cbzwVar = azhqVar.c;
        if (cbzwVar != null) {
            cbzwVar.a(cbzyVar);
        } else {
            azhqVar.d.add(cbzyVar);
        }
    }

    public final void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            azhq azhqVar = this.a;
            azhqVar.b(bundle, new azhm(azhqVar, bundle));
            if (azhqVar.c == null) {
                aqto aqtoVar = aqto.a;
                Context context = getContext();
                int m = aqtoVar.m(context);
                String c = artx.c(context, m);
                String b = artx.b(context, m);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(c);
                linearLayout.addView(textView);
                Intent k = aqtoVar.k(context, m, null);
                if (k != null) {
                    Button button = new Button(context);
                    button.setId(R.id.button1);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(b);
                    linearLayout.addView(button);
                    button.setOnClickListener(new azhn(context, k));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void c() {
        azhq azhqVar = this.a;
        cbzw cbzwVar = azhqVar.c;
        if (cbzwVar == null) {
            azhqVar.a(1);
            return;
        }
        try {
            cbzwVar.b.c();
        } catch (RemoteException e) {
            throw new ccen(e);
        }
    }

    public final void d() {
        cbzw cbzwVar = this.a.c;
        if (cbzwVar != null) {
            try {
                cbzwVar.b.d();
            } catch (RemoteException e) {
                throw new ccen(e);
            }
        }
    }

    public final void e() {
        azhq azhqVar = this.a;
        cbzw cbzwVar = azhqVar.c;
        if (cbzwVar == null) {
            azhqVar.a(5);
            return;
        }
        try {
            cbzwVar.b.e();
        } catch (RemoteException e) {
            throw new ccen(e);
        }
    }

    public final void f() {
        azhq azhqVar = this.a;
        azhqVar.b(null, new azho(azhqVar));
    }

    public final void g(Bundle bundle) {
        azhq azhqVar = this.a;
        cbzw cbzwVar = azhqVar.c;
        if (cbzwVar == null) {
            Bundle bundle2 = azhqVar.a;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            ccdo.b(bundle, bundle3);
            cbzwVar.b.g(bundle3);
            ccdo.b(bundle3, bundle);
        } catch (RemoteException e) {
            throw new ccen(e);
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new azhq(this, context, GoogleMapOptions.a(context, attributeSet));
        h();
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new azhq(this, context, GoogleMapOptions.a(context, attributeSet));
        h();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.a = new azhq(this, context, googleMapOptions);
        h();
    }
}
