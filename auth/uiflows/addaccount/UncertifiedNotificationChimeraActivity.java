package com.google.android.gms.auth.uiflows.addaccount;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationChimeraActivity;
import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;
import defpackage.afgc;
import defpackage.atmr;
import defpackage.iri;
import defpackage.ryb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UncertifiedNotificationChimeraActivity extends ryb {
    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        atmr.f(this, "glif_v3_light");
        atmr.d(this, false, this);
        setContentView(R.layout.auth_uncertified_activity_v2);
        int i = iri.a;
        TextView textView = (TextView) findViewById(R.id.play_protect_body_text);
        if (textView != null) {
            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
            boolean isClickable = textView.isClickable();
            boolean isLongClickable = textView.isLongClickable();
            textView.setMovementMethod(linkMovementMethod);
            textView.setClickable(isClickable);
            textView.setLongClickable(isLongClickable);
        }
        Button button = (Button) findViewById(R.id.finishButton);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: afgb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UncertifiedNotificationChimeraActivity.this.finish();
                }
            });
            return;
        }
        GlifMinuteMaidLayout glifMinuteMaidLayout = (GlifMinuteMaidLayout) findViewById(R.id.setup_wizard_layout);
        glifMinuteMaidLayout.a(true);
        glifMinuteMaidLayout.c(getResources().getString(R.string.common_ok), 5, new afgc(this));
    }
}
