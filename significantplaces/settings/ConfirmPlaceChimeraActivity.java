package com.google.android.gms.significantplaces.settings;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.significantplaces.settings.ConfirmPlaceChimeraActivity;
import defpackage.dciw;
import defpackage.fsao;
import defpackage.fvbo;
import defpackage.ip;
import defpackage.iq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ConfirmPlaceChimeraActivity extends dciw {
    public final double j = fsao.b();
    private final int k = R.style.ConfirmMaterialDialogTheme;

    @Override // defpackage.dciw
    public final int a() {
        return this.k;
    }

    @Override // defpackage.dciw
    public final iq b(ip ipVar) {
        Bundle extras = getIntent().getExtras();
        final String string = extras != null ? extras.getString("place") : null;
        Bundle extras2 = getIntent().getExtras();
        Double valueOf = extras2 != null ? Double.valueOf(extras2.getDouble("latitude")) : null;
        Bundle extras3 = getIntent().getExtras();
        Double valueOf2 = extras3 != null ? Double.valueOf(extras3.getDouble("longitude")) : null;
        Bundle extras4 = getIntent().getExtras();
        final String string2 = extras4 != null ? extras4.getString("address") : null;
        Bundle extras5 = getIntent().getExtras();
        String string3 = extras5 != null ? extras5.getString("name") : null;
        Bundle extras6 = getIntent().getExtras();
        String string4 = extras6 != null ? extras6.getString("account_name") : null;
        Bundle extras7 = getIntent().getExtras();
        String string5 = extras7 != null ? extras7.getString("place_alias") : null;
        if (string != null && valueOf != null && valueOf2 != null && string2 != null && string3 != null) {
            Bundle extras8 = getIntent().getExtras();
            int i = extras8 != null ? extras8.getInt("add_method") : 0;
            if (string4 == null || string5 != null) {
                final double doubleValue = valueOf.doubleValue();
                final double doubleValue2 = valueOf2.doubleValue();
                View inflate = getLayoutInflater().inflate(R.layout.significant_places_confirm_dialog, (ViewGroup) null);
                final EditText editText = (EditText) inflate.findViewById(R.id.title_edittext);
                editText.setText(new SpannableStringBuilder(string3));
                editText.setEnabled(string4 == null);
                ((TextView) inflate.findViewById(R.id.subtitle_address)).setText(string2);
                ipVar.setView(inflate);
                ipVar.setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: dcja
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        fvbo.f(dialogInterface, "<unused var>");
                        int i3 = dciy.a;
                        dciy.b(ConfirmPlaceChimeraActivity.this);
                    }
                });
                final String str = string4;
                final String str2 = string5;
                final int i2 = i;
                final iq create = ipVar.setPositiveButton(R.string.common_add, new DialogInterface.OnClickListener() { // from class: dcjb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        fvbo.f(dialogInterface, "<unused var>");
                        ConfirmPlaceChimeraActivity confirmPlaceChimeraActivity = ConfirmPlaceChimeraActivity.this;
                        fvgt.b(joo.a(confirmPlaceChimeraActivity), null, null, new dcjf(str, confirmPlaceChimeraActivity, i2, string, editText, string2, str2, doubleValue, doubleValue2, null), 3);
                    }
                }).create();
                fvbo.e(create, "create(...)");
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: dcjc
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        View findViewById = iq.this.findViewById(R.id.map);
                        if (findViewById == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        final ConfirmPlaceChimeraActivity confirmPlaceChimeraActivity = this;
                        final double d = doubleValue2;
                        final double d2 = doubleValue;
                        MapView mapView = (MapView) findViewById;
                        mapView.b(null);
                        mapView.f();
                        mapView.a(new cbzy() { // from class: dciz
                            @Override // defpackage.cbzy
                            public final void a(cbzu cbzuVar) {
                                double d3 = d2;
                                double d4 = d;
                                cbzuVar.i(cbzq.b(new LatLng(d3, d4), 16.0f));
                                try {
                                    cbzuVar.c().a.c();
                                    ConfirmPlaceChimeraActivity confirmPlaceChimeraActivity2 = confirmPlaceChimeraActivity;
                                    CircleOptions circleOptions = new CircleOptions();
                                    circleOptions.a(new LatLng(d3, d4));
                                    circleOptions.b = confirmPlaceChimeraActivity2.j;
                                    circleOptions.c();
                                    circleOptions.b();
                                    circleOptions.d();
                                    cbzuVar.e(circleOptions);
                                } catch (RemoteException e) {
                                    throw new ccen(e);
                                }
                            }
                        });
                    }
                });
                create.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: dcjd
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        int i3 = dciy.a;
                        dciy.b(ConfirmPlaceChimeraActivity.this);
                    }
                });
                return create;
            }
        }
        return null;
    }

    @Override // defpackage.dciw
    public final boolean c() {
        return false;
    }
}
