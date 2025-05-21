package com.google.android.gms.smartdevice.quickstart.ui;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.quickstart.ui.RestoreAnytimeHalfSheetChimeraActivity;
import defpackage.denq;
import defpackage.dnie;
import defpackage.eigd;
import defpackage.fsfy;
import defpackage.qex;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RestoreAnytimeHalfSheetChimeraActivity extends qex {
    private static final denq i = new denq(new String[]{"RestoreAnytimeHalfSheetChimeraActivity"});
    public dnie h;

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fsfy.a.a().d()) {
            i.m("Activity is not enabled", new Object[0]);
            finish();
            return;
        }
        setContentView(R.layout.fast_pair_basic_half_sheet);
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID");
        this.h = dnie.b(getContainerActivity(), this.f, stringExtra, true);
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_NAME");
        String string = (stringExtra2 == null || stringExtra == null || eigd.e(stringExtra, "0300e089dbf71048")) ? getString(R.string.smartdevice_restore_anytime_default_half_sheet_title) : getString(R.string.smartdevice_restore_anytime_half_sheet_title, new Object[]{stringExtra2});
        ((TextView) findViewById(R.id.half_sheet_title_textview)).setText(string);
        setTitle(string);
        ((TextView) findViewById(R.id.half_sheet_subtitle_textview)).setText(R.string.smartdevice_restore_anytime_half_sheet_subtitle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_IMAGE");
        if (byteArrayExtra != null) {
            try {
                ((ImageView) findViewById(R.id.half_sheet_device_imageview)).setImageBitmap(BitmapFactory.decodeByteArray(byteArrayExtra, 0, byteArrayExtra.length));
            } catch (OutOfMemoryError e) {
                i.n("Failed to decode device image", e, new Object[0]);
            }
        }
        Button button = (Button) findViewById(R.id.half_sheet_button);
        button.setText(R.string.smartdevice_common_start);
        button.setOnClickListener(new View.OnClickListener() { // from class: dear
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RestoreAnytimeHalfSheetChimeraActivity restoreAnytimeHalfSheetChimeraActivity = RestoreAnytimeHalfSheetChimeraActivity.this;
                dnie dnieVar = restoreAnytimeHalfSheetChimeraActivity.h;
                if (dnieVar != null) {
                    dnieVar.a();
                }
                restoreAnytimeHalfSheetChimeraActivity.finish();
                Intent intent = new Intent("com.google.android.gms.smartdevice.quickstart.SOURCE_DEVICE_SETUP");
                intent.setPackage("com.google.android.gms");
                intent.putExtras(restoreAnytimeHalfSheetChimeraActivity.getIntent());
                intent.putExtra("trigger_flow_type", 2);
                restoreAnytimeHalfSheetChimeraActivity.startActivity(intent);
            }
        });
    }
}
