package com.google.android.gms.smartdevice.quickstart.ui;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.quickstart.ui.QuickStartHalfSheetChimeraActivity;
import defpackage.atmo;
import defpackage.dgyt;
import defpackage.dpsn;
import defpackage.fmya;
import defpackage.fvak;
import defpackage.ryb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class QuickStartHalfSheetChimeraActivity extends ryb {
    private static final dgyt i = new dgyt(new String[]{"QuickStartHalfSheetChimeraActivity"});
    public dpsn h;

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fvak.a.lK().H()) {
            i.m("Activity is not enabled", new Object[0]);
            finish();
            return;
        }
        if (fmya.c()) {
            atmo.a(this);
        }
        setContentView(R.layout.smartdevice_fast_pair_two_button_half_sheet);
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID");
        i.d("Showing QuickStart half-sheet dialog for %s", stringExtra);
        this.h = dpsn.b(getContainerActivity(), this.f, stringExtra, false);
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_NAME");
        String string = stringExtra2 == null ? getString(R.string.smartdevice_half_sheet_default_title) : getString(R.string.smartdevice_half_sheet_title, new Object[]{stringExtra2});
        ((TextView) findViewById(R.id.half_sheet_title_textview)).setText(string);
        setTitle(string);
        ((TextView) findViewById(R.id.half_sheet_subtitle_textview)).setText(R.string.smartdevice_half_sheet_subtitle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_IMAGE");
        if (byteArrayExtra != null) {
            try {
                ((ImageView) findViewById(R.id.half_sheet_device_imageview)).setImageBitmap(BitmapFactory.decodeByteArray(byteArrayExtra, 0, byteArrayExtra.length));
            } catch (OutOfMemoryError e) {
                i.n("Failed to decode device image", e, new Object[0]);
            }
        }
        Button button = (Button) findViewById(R.id.half_sheet_button);
        button.setText(R.string.smartdevice_half_sheet_button_text_short);
        button.setOnClickListener(new View.OnClickListener() { // from class: dglt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickStartHalfSheetChimeraActivity quickStartHalfSheetChimeraActivity = QuickStartHalfSheetChimeraActivity.this;
                dpsn dpsnVar = quickStartHalfSheetChimeraActivity.h;
                if (dpsnVar != null) {
                    dpsnVar.a();
                }
                quickStartHalfSheetChimeraActivity.finish();
                Intent intent = new Intent("com.google.android.gms.smartdevice.quickstart.SOURCE_DEVICE_SETUP");
                intent.setPackage("com.google.android.gms");
                intent.putExtras(quickStartHalfSheetChimeraActivity.getIntent());
                intent.putExtra("trigger_flow_type", 1);
                quickStartHalfSheetChimeraActivity.startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.half_sheet_button_secondary);
        button2.setText(R.string.common_dismiss);
        button2.setOnClickListener(new View.OnClickListener() { // from class: dglu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickStartHalfSheetChimeraActivity.this.finish();
            }
        });
    }
}
