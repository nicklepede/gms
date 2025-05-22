package com.google.android.gms.backup.settings.devicedata.storagemeter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.devicedata.storagemeter.StorageMeterPreference;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.ajwo;
import defpackage.ajwp;
import defpackage.ajwq;
import defpackage.ajws;
import defpackage.alpi;
import defpackage.alpm;
import defpackage.alxn;
import defpackage.fxqx;
import defpackage.fxwo;
import defpackage.fxxm;
import defpackage.fxyj;
import defpackage.ivb;
import defpackage.mfa;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class StorageMeterPreference extends Preference {
    public ajws a;
    public fxwo b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorageMeterPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        fxxm.f(context, "context");
    }

    private final void k(LinearProgressIndicator linearProgressIndicator, int i) {
        linearProgressIndicator.f(this.j.getColor(i));
    }

    private static final void l(MaterialButton materialButton, LinearLayout linearLayout) {
        ivb.b(materialButton, new alpm(materialButton, linearLayout));
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        fxxm.f(mfaVar, "holder");
        super.a(mfaVar);
        View D = mfaVar.D(R.id.backup_settings_devicedata_storagemeter_progress);
        fxxm.d(D, "null cannot be cast to non-null type com.google.android.material.progressindicator.LinearProgressIndicator");
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) D;
        View D2 = mfaVar.D(R.id.backup_settings_devicedata_storagemeter_button_container);
        fxxm.d(D2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) D2;
        View D3 = mfaVar.D(R.id.backup_settings_devicedata_storagemeter_summary);
        fxxm.d(D3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) D3;
        View D4 = mfaVar.D(R.id.backup_settings_devicedata_storagemeter_button_clean_up_space);
        fxxm.d(D4, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
        MaterialButton materialButton = (MaterialButton) D4;
        View D5 = mfaVar.D(R.id.backup_settings_devicedata_storagemeter_button_get_storage);
        fxxm.d(D5, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
        MaterialButton materialButton2 = (MaterialButton) D5;
        linearProgressIndicator.setVisibility(0);
        materialButton.setEnabled(false);
        materialButton2.setEnabled(false);
        ajws ajwsVar = this.a;
        if ((ajwsVar instanceof ajwp) || (ajwsVar instanceof ajwo)) {
            linearProgressIndicator.setProgress(0, true);
            textView.setText("");
        } else {
            if (!(ajwsVar instanceof ajwq)) {
                throw new fxqx();
            }
            materialButton.setEnabled(true);
            materialButton2.setEnabled(true);
            alpi alpiVar = (alpi) ((ajwq) ajwsVar).a;
            long j = alpiVar.b;
            long j2 = alpiVar.c;
            Context context = this.j;
            int a = fxyj.a((j / j2) * 100.0f);
            String a2 = alxn.a(context, j);
            String a3 = alxn.a(context, j2);
            if (j2 <= 0) {
                linearProgressIndicator.setVisibility(8);
                textView.setText(context.getString(R.string.storage_meter_summary_unlimited_quota, a2));
            } else {
                textView.setText(j >= j2 ? context.getString(R.string.storage_meter_summary_storage_full, a2, a3) : context.getString(R.string.storage_meter_summary, a2, a3, String.valueOf(a)));
                if (a >= 90) {
                    k(linearProgressIndicator, R.color.settingslib_colorBackgroundLevel_high);
                } else if (a >= 80) {
                    k(linearProgressIndicator, R.color.settingslib_colorBackgroundLevel_medium);
                } else {
                    k(linearProgressIndicator, R.color.settingslib_materialColorPrimary);
                }
                linearProgressIndicator.setProgress(a, true);
            }
        }
        l(materialButton, linearLayout);
        l(materialButton2, linearLayout);
        alpi alpiVar2 = (alpi) this.a.b();
        final String str = alpiVar2 != null ? alpiVar2.a : null;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: alpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fxwo fxwoVar = StorageMeterPreference.this.b;
                if (fxwoVar != null) {
                    String str2 = str;
                    String a4 = fofn.a.lK().a();
                    fxxm.e(a4, "storageMeterCleanUpSpaceUrl(...)");
                    fxwoVar.a(alpj.a(a4, str2));
                }
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: alpl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fxwo fxwoVar = StorageMeterPreference.this.b;
                if (fxwoVar != null) {
                    String str2 = str;
                    String b = fofn.a.lK().b();
                    fxxm.e(b, "storageMeterGetStorageUrl(...)");
                    fxwoVar.a(alpj.a(b, str2));
                }
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorageMeterPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorageMeterPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageMeterPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fxxm.f(context, "context");
        this.B = R.layout.backup_settings_devicedata_storagemeter_preference;
        N(false);
        this.a = ajwp.a;
    }

    public /* synthetic */ StorageMeterPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
