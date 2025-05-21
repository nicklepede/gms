package com.google.android.gms.findmydevice.spot.locationreporting.taptoid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.findmydevice.spot.locationreporting.taptoid.TapToIdHalfSheetChimeraActivity;
import com.google.android.material.chip.Chip;
import defpackage.bdak;
import defpackage.bebh;
import defpackage.eble;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.iru;
import defpackage.nln;
import defpackage.nmh;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class TapToIdHalfSheetChimeraActivity extends qet {
    private bdak j = null;

    public final void a(final int i) {
        bdak bdakVar = this.j;
        if (bdakVar != null) {
            bdakVar.a(new iru() { // from class: bevx
                @Override // defpackage.iru
                public final void a(Object obj) {
                    ((apud) obj).d(bdam.a(i)).a(0L, 1L, apud.b);
                }
            });
        } else {
            Log.w("TapToIdActivity", "counters unavailable.");
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        super.onCreate(bundle);
        if (this.j == null) {
            this.j = (bdak) new bebh().g.a();
        }
        setTheme(R.style.Theme_TapToIdHalfSheet);
        int i = eble.a;
        setContentView(R.layout.tap_to_id_half_sheet);
        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() { // from class: bevt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TapToIdHalfSheetChimeraActivity.this.finish();
            }
        });
        findViewById(R.id.card).setOnClickListener(new View.OnClickListener() { // from class: bevu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.device_icon);
        if (getIntent().hasExtra("DEVICE_ICON_URL")) {
            nmh d = nln.d(this);
            String stringExtra = getIntent().getStringExtra("DEVICE_ICON_URL");
            eiig.x(stringExtra);
            d.e(stringExtra).m(imageView);
        } else if (getIntent().hasExtra("DEVICE_ICON_BYTES")) {
            nmh d2 = nln.d(this);
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("DEVICE_ICON_BYTES");
            eiig.x(byteArrayExtra);
            d2.c().f(byteArrayExtra).m(imageView);
        }
        String stringExtra2 = getIntent().getStringExtra("DEVICE_MANUFACTURER");
        String stringExtra3 = getIntent().getStringExtra("DEVICE_MODEL");
        TextView textView = (TextView) findViewById(R.id.device_name);
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra3 = eiif.b(stringExtra2);
        }
        textView.setText(stringExtra3);
        String stringExtra4 = getIntent().getStringExtra("EID");
        if (!TextUtils.isEmpty(stringExtra4)) {
            ((TextView) findViewById(R.id.eid_text)).setText(stringExtra4);
        }
        String stringExtra5 = getIntent().getStringExtra("EMAIL_ADDRESS");
        boolean z3 = true;
        if (TextUtils.isEmpty(stringExtra5)) {
            z = false;
        } else {
            Chip chip = (Chip) findViewById(R.id.email_chip);
            chip.setVisibility(0);
            final Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{stringExtra5});
            if (intent.resolveActivity(getPackageManager()) != null) {
                chip.setEnabled(true);
                chip.setOnClickListener(new View.OnClickListener() { // from class: bevw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TapToIdHalfSheetChimeraActivity tapToIdHalfSheetChimeraActivity = TapToIdHalfSheetChimeraActivity.this;
                        tapToIdHalfSheetChimeraActivity.a(19);
                        tapToIdHalfSheetChimeraActivity.startActivity(intent);
                    }
                });
            } else {
                chip.setEnabled(false);
                chip.setText(stringExtra5);
            }
            z = true;
        }
        final String stringExtra6 = getIntent().getStringExtra("PHONE_NUMBER");
        if (TextUtils.isEmpty(stringExtra6)) {
            z2 = false;
        } else {
            Chip chip2 = (Chip) findViewById(R.id.call_chip);
            Chip chip3 = (Chip) findViewById(R.id.message_chip);
            chip2.setVisibility(0);
            chip3.setVisibility(0);
            chip2.setOnClickListener(new View.OnClickListener() { // from class: bevy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TapToIdHalfSheetChimeraActivity tapToIdHalfSheetChimeraActivity = TapToIdHalfSheetChimeraActivity.this;
                    tapToIdHalfSheetChimeraActivity.a(20);
                    Intent intent2 = new Intent("android.intent.action.DIAL");
                    intent2.setData(Uri.parse("tel:".concat(String.valueOf(stringExtra6))));
                    tapToIdHalfSheetChimeraActivity.startActivity(intent2);
                }
            });
            chip3.setOnClickListener(new View.OnClickListener() { // from class: bevz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TapToIdHalfSheetChimeraActivity tapToIdHalfSheetChimeraActivity = TapToIdHalfSheetChimeraActivity.this;
                    tapToIdHalfSheetChimeraActivity.a(21);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("sms:".concat(String.valueOf(stringExtra6))));
                    tapToIdHalfSheetChimeraActivity.startActivity(intent2);
                }
            });
            z2 = true;
        }
        boolean z4 = z | z2;
        String stringExtra7 = getIntent().getStringExtra("OWNER_MESSAGE");
        if (TextUtils.isEmpty(stringExtra7)) {
            z3 = false;
        } else {
            TextView textView2 = (TextView) findViewById(R.id.owner_message);
            textView2.setText(getString(R.string.quoted_text, new Object[]{stringExtra7}));
            textView2.setVisibility(0);
            findViewById(R.id.owner_message_title).setVisibility(0);
        }
        if (z4 || z3) {
            findViewById(R.id.contact_info_card).setVisibility(0);
            ((TextView) findViewById(R.id.p3_content_text_view)).setText(R.string.p3_content_contact_info_populated);
        } else {
            ((TextView) findViewById(R.id.p3_content_text_view)).setText(R.string.p3_content);
        }
        ((Button) findViewById(R.id.more_info_button)).setOnClickListener(new View.OnClickListener() { // from class: bevv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TapToIdHalfSheetChimeraActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(fobr.a.a().aE())));
            }
        });
    }
}
