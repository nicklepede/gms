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
import defpackage.detc;
import defpackage.fuvk;
import defpackage.fxxm;
import defpackage.ip;
import defpackage.iq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ConfirmPlaceChimeraActivity extends detc {
    public final double j = fuvk.b();
    private final int k = R.style.ConfirmMaterialDialogTheme;

    @Override // defpackage.detc
    public final int a() {
        return this.k;
    }

    @Override // defpackage.detc
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
                ip view = ipVar.setView(inflate);
                view.setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: detg
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        fxxm.f(dialogInterface, "<unused var>");
                        int i3 = dete.a;
                        dete.b(ConfirmPlaceChimeraActivity.this);
                    }
                });
                final String str = string4;
                final String str2 = string5;
                final int i2 = i;
                view.setPositiveButton(R.string.common_add, new DialogInterface.OnClickListener() { // from class: deth
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        fxxm.f(dialogInterface, "<unused var>");
                        ConfirmPlaceChimeraActivity confirmPlaceChimeraActivity = ConfirmPlaceChimeraActivity.this;
                        fycr.b(jvd.a(confirmPlaceChimeraActivity), null, null, new detl(str, confirmPlaceChimeraActivity, i2, string, editText, string2, str2, doubleValue, doubleValue2, null), 3);
                    }
                });
                final iq create = view.create();
                fxxm.e(create, "create(...)");
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: deti
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
                        mapView.a(new ceis() { // from class: detf
                            @Override // defpackage.ceis
                            public final void a(ceio ceioVar) {
                                double d3 = d2;
                                double d4 = d;
                                ceioVar.i(ceii.b(new LatLng(d3, d4), 16.0f));
                                try {
                                    ceioVar.c().a.c();
                                    ConfirmPlaceChimeraActivity confirmPlaceChimeraActivity2 = confirmPlaceChimeraActivity;
                                    CircleOptions circleOptions = new CircleOptions();
                                    circleOptions.a(new LatLng(d3, d4));
                                    circleOptions.b = confirmPlaceChimeraActivity2.j;
                                    circleOptions.c();
                                    circleOptions.b();
                                    circleOptions.d();
                                    ceioVar.e(circleOptions);
                                } catch (RemoteException e) {
                                    throw new cenh(e);
                                }
                            }
                        });
                    }
                });
                create.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: detj
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        int i3 = dete.a;
                        dete.b(ConfirmPlaceChimeraActivity.this);
                    }
                });
                return create;
            }
        }
        return null;
    }

    @Override // defpackage.detc
    public final boolean c() {
        return false;
    }
}
