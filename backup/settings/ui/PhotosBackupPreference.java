package com.google.android.gms.backup.settings.ui;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.ui.PhotosBackupPreference;
import defpackage.ahtf;
import defpackage.ahwd;
import defpackage.ahxo;
import defpackage.ahyj;
import defpackage.aiaa;
import defpackage.aiab;
import defpackage.ajwx;
import defpackage.ajza;
import defpackage.ajzb;
import defpackage.ajzc;
import defpackage.ajzd;
import defpackage.ajzf;
import defpackage.arxo;
import defpackage.asmd;
import defpackage.byhr;
import defpackage.dvvv;
import defpackage.qfp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhotosBackupPreference extends PhotosPreference {
    public String G;
    public boolean H;
    public String I;
    public ahtf J;
    public final aiab K;
    private boolean L;
    public final dvvv b;
    public final ahxo c;
    public ahyj d;
    public final Handler e;
    public boolean f;
    public boolean g;
    public final qfp h;
    public String i;
    public static final arxo a = ahwd.a("PhotosBackupPreference");
    private static final int M = 2;

    public PhotosBackupPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ahxo.b(context), ahyj.a(context), new ahtf(context));
    }

    @Override // androidx.preference.Preference
    protected final void E() {
        super.V();
        if (this.H) {
            new asmd(10, new Runnable() { // from class: ajyx
                @Override // java.lang.Runnable
                public final void run() {
                    PhotosBackupPreference photosBackupPreference = PhotosBackupPreference.this;
                    photosBackupPreference.d.d(photosBackupPreference.b, photosBackupPreference.K);
                }
            }).start();
        }
    }

    @Override // com.google.android.gms.backup.settings.ui.PhotosPreference
    public final String af() {
        return this.G;
    }

    public final void ag() {
        I(R.drawable.quantum_gm_ic_photos_vd_theme_24);
        q().setColorFilter(this.j.getColor(R.color.backup_error_tint), PorterDuff.Mode.SRC_IN);
    }

    public final void ah() {
        if (this.f || this.g) {
            return;
        }
        String str = this.G;
        if (str == null) {
            l(ajwx.g);
            return;
        }
        if (str.equals(this.i)) {
            n(this.I);
            return;
        }
        n(this.I + "\n" + this.G);
    }

    public final void ai() {
        if (this.f || this.g) {
            return;
        }
        I(R.drawable.quantum_gm_ic_photos_vd_theme_24);
    }

    public final /* synthetic */ void aj(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            Toast.makeText(this.j, R.string.backup_launch_photos_settings_error, 0).show();
            a.e("Failed to send intent", e, new Object[0]);
        }
    }

    @Override // com.google.android.gms.backup.settings.ui.BackupPreference
    public final List k(Account account) {
        String str = account == null ? null : account.name;
        String str2 = this.L ? str : this.i;
        this.L = false;
        return new ArrayList(Arrays.asList(new ajzb(this, str2, str), new ajzc(this), new ajzd(this), new ajzf(this)));
    }

    public PhotosBackupPreference(Context context, AttributeSet attributeSet, ahxo ahxoVar, ahyj ahyjVar, ahtf ahtfVar) {
        super(context, attributeSet);
        this.b = new ajza(this);
        this.f = false;
        this.g = false;
        this.L = true;
        this.i = null;
        this.G = null;
        this.H = false;
        this.c = ahxoVar;
        this.d = ahyjVar;
        H(false);
        this.e = new byhr(context.getMainLooper());
        this.I = ajwx.h.a(context);
        this.J = ahtfVar;
        aiaa a2 = aiab.a();
        a2.c(M);
        this.K = a2.a();
        this.h = (qfp) context;
    }

    @Override // com.google.android.gms.backup.settings.ui.BackupPreference
    public final void o() {
    }
}
