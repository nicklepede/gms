package com.google.android.gms.backup.settings.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.ajwt;
import defpackage.alep;
import defpackage.alxn;
import defpackage.auad;
import defpackage.fogc;
import defpackage.mfa;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class StorageMeterPreference extends Preference {
    public static final auad a = ajwt.a("StorageMeterPreference");
    private static final int d = R.color.backup_error_tint;
    private static final int e = R.color.backup_warning_tint;
    public String b;
    public alep c;
    private TextView f;
    private TextView g;
    private ProgressBar h;
    private boolean i;

    public StorageMeterPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        this.B = R.layout.storage_meter_preference;
    }

    private final int l(int i) {
        return this.j.getColor(i);
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        this.f = (TextView) mfaVar.D(R.id.storage_account_name);
        this.h = (ProgressBar) mfaVar.D(R.id.storage_progress_bar);
        this.g = (TextView) mfaVar.D(R.id.storage_account_info);
        this.i = true;
        k();
    }

    public final void k() {
        String str;
        if (!this.i || (str = this.b) == null) {
            return;
        }
        this.f.setText(str);
        if (fogc.d()) {
            this.h.setVisibility(0);
            this.g.setVisibility(0);
        } else {
            this.h.setVisibility(8);
            this.g.setVisibility(8);
        }
        if (this.c != null) {
            this.h.setIndeterminate(false);
            this.h.setMax(100);
            alep alepVar = this.c;
            double d2 = (alepVar.d * 100.0d) / alepVar.c;
            this.h.setProgress((int) d2);
            Context context = this.j;
            String a2 = alxn.a(context, this.c.d);
            long j = this.c.c;
            if (j <= 0) {
                this.h.setVisibility(8);
                this.g.setText(context.getString(R.string.storage_meter_summary_unlimited_quota, a2));
                return;
            }
            String a3 = alxn.a(context, j);
            this.g.setText(context.getString(R.string.storage_meter_summary, a2, a3, String.format(Locale.getDefault(), "%.0f", Double.valueOf(d2))));
            alep alepVar2 = this.c;
            if (alepVar2.d >= alepVar2.c) {
                ProgressBar progressBar = this.h;
                int i = d;
                progressBar.setProgressTintList(ColorStateList.valueOf(l(i)));
                this.g.setText(context.getString(R.string.storage_meter_summary_storage_full, a2, a3));
                this.g.setTextColor(l(i));
                return;
            }
            if (d2 < 90.0d) {
                if (d2 >= 80.0d) {
                    this.h.setProgressTintList(ColorStateList.valueOf(l(e)));
                }
            } else {
                ProgressBar progressBar2 = this.h;
                int i2 = d;
                progressBar2.setProgressTintList(ColorStateList.valueOf(l(i2)));
                this.g.setTextColor(l(i2));
            }
        }
    }
}
