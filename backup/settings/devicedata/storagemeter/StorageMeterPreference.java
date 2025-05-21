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
import defpackage.ahvy;
import defpackage.ahvz;
import defpackage.ahwa;
import defpackage.ahwc;
import defpackage.ajop;
import defpackage.ajot;
import defpackage.ajwp;
import defpackage.fuuz;
import defpackage.fvaq;
import defpackage.fvbo;
import defpackage.fvcl;
import defpackage.itl;
import defpackage.kmp;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class StorageMeterPreference extends Preference {
    public ahwc a;
    public fvaq b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorageMeterPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        fvbo.f(context, "context");
    }

    private final void k(LinearProgressIndicator linearProgressIndicator, int i) {
        linearProgressIndicator.f(this.j.getColor(i));
    }

    private static final void l(MaterialButton materialButton, LinearLayout linearLayout) {
        itl.b(materialButton, new ajot(materialButton, linearLayout));
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        fvbo.f(kmpVar, "holder");
        super.a(kmpVar);
        View D = kmpVar.D(R.id.backup_settings_devicedata_storagemeter_progress);
        fvbo.d(D, "null cannot be cast to non-null type com.google.android.material.progressindicator.LinearProgressIndicator");
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) D;
        View D2 = kmpVar.D(R.id.backup_settings_devicedata_storagemeter_button_container);
        fvbo.d(D2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) D2;
        View D3 = kmpVar.D(R.id.backup_settings_devicedata_storagemeter_summary);
        fvbo.d(D3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) D3;
        View D4 = kmpVar.D(R.id.backup_settings_devicedata_storagemeter_button_clean_up_space);
        fvbo.d(D4, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
        MaterialButton materialButton = (MaterialButton) D4;
        View D5 = kmpVar.D(R.id.backup_settings_devicedata_storagemeter_button_get_storage);
        fvbo.d(D5, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
        MaterialButton materialButton2 = (MaterialButton) D5;
        linearProgressIndicator.setVisibility(0);
        materialButton.setEnabled(false);
        materialButton2.setEnabled(false);
        ahwc ahwcVar = this.a;
        if ((ahwcVar instanceof ahvz) || (ahwcVar instanceof ahvy)) {
            linearProgressIndicator.setProgress(0, true);
            textView.setText("");
        } else {
            if (!(ahwcVar instanceof ahwa)) {
                throw new fuuz();
            }
            materialButton.setEnabled(true);
            materialButton2.setEnabled(true);
            ajop ajopVar = (ajop) ((ahwa) ahwcVar).a;
            long j = ajopVar.b;
            long j2 = ajopVar.c;
            Context context = this.j;
            int a = fvcl.a((j / j2) * 100.0f);
            String a2 = ajwp.a(context, j);
            String a3 = ajwp.a(context, j2);
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
        ajop ajopVar2 = (ajop) this.a.b();
        final String str = ajopVar2 != null ? ajopVar2.a : null;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: ajor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fvaq fvaqVar = StorageMeterPreference.this.b;
                if (fvaqVar != null) {
                    String str2 = str;
                    String a4 = flod.a.a().a();
                    fvbo.e(a4, "storageMeterCleanUpSpaceUrl(...)");
                    fvaqVar.a(ajoq.a(a4, str2));
                }
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: ajos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fvaq fvaqVar = StorageMeterPreference.this.b;
                if (fvaqVar != null) {
                    String str2 = str;
                    String b = flod.a.a().b();
                    fvbo.e(b, "storageMeterGetStorageUrl(...)");
                    fvaqVar.a(ajoq.a(b, str2));
                }
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorageMeterPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorageMeterPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageMeterPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fvbo.f(context, "context");
        this.B = R.layout.backup_settings_devicedata_storagemeter_preference;
        N(false);
        this.a = ahvz.a;
    }

    public /* synthetic */ StorageMeterPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
