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
import defpackage.arjz;
import defpackage.denq;
import defpackage.dnie;
import defpackage.fkhl;
import defpackage.fsfn;
import defpackage.qex;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class QuickStartHalfSheetChimeraActivity extends qex {
    private static final denq i = new denq(new String[]{"QuickStartHalfSheetChimeraActivity"});
    public dnie h;

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fsfn.a.a().H()) {
            i.m("Activity is not enabled", new Object[0]);
            finish();
            return;
        }
        if (fkhl.c()) {
            arjz.a(this);
        }
        setContentView(R.layout.smartdevice_fast_pair_two_button_half_sheet);
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID");
        i.d("Showing QuickStart half-sheet dialog for %s", stringExtra);
        this.h = dnie.b(getContainerActivity(), this.f, stringExtra, false);
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
        button.setOnClickListener(new View.OnClickListener() { // from class: deap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickStartHalfSheetChimeraActivity quickStartHalfSheetChimeraActivity = QuickStartHalfSheetChimeraActivity.this;
                dnie dnieVar = quickStartHalfSheetChimeraActivity.h;
                if (dnieVar != null) {
                    dnieVar.a();
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
        button2.setOnClickListener(new View.OnClickListener() { // from class: deaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickStartHalfSheetChimeraActivity.this.finish();
            }
        });
    }
}
