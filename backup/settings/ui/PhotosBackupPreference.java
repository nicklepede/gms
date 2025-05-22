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
import defpackage.ajtv;
import defpackage.ajwt;
import defpackage.ajye;
import defpackage.ajyz;
import defpackage.akaq;
import defpackage.akar;
import defpackage.alxv;
import defpackage.alzy;
import defpackage.alzz;
import defpackage.amaa;
import defpackage.amab;
import defpackage.amad;
import defpackage.auad;
import defpackage.aupx;
import defpackage.caqj;
import defpackage.dyhw;
import defpackage.ryt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhotosBackupPreference extends PhotosPreference {
    public String G;
    public boolean H;
    public String I;
    public ajtv J;
    public final akar K;
    private boolean L;
    public final dyhw b;
    public final ajye c;
    public ajyz d;
    public final Handler e;
    public boolean f;
    public boolean g;
    public final ryt h;
    public String i;
    public static final auad a = ajwt.a("PhotosBackupPreference");
    private static final int M = 2;

    public PhotosBackupPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ajye.b(context), ajyz.a(context), new ajtv(context));
    }

    @Override // androidx.preference.Preference
    protected final void E() {
        super.V();
        if (this.H) {
            new aupx(10, new Runnable() { // from class: alzv
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
            l(alxv.g);
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
        return new ArrayList(Arrays.asList(new alzz(this, str2, str), new amaa(this), new amab(this), new amad(this)));
    }

    public PhotosBackupPreference(Context context, AttributeSet attributeSet, ajye ajyeVar, ajyz ajyzVar, ajtv ajtvVar) {
        super(context, attributeSet);
        this.b = new alzy(this);
        this.f = false;
        this.g = false;
        this.L = true;
        this.i = null;
        this.G = null;
        this.H = false;
        this.c = ajyeVar;
        this.d = ajyzVar;
        H(false);
        this.e = new caqj(context.getMainLooper());
        this.I = alxv.h.a(context);
        this.J = ajtvVar;
        akaq a2 = akar.a();
        a2.c(M);
        this.K = a2.a();
        this.h = (ryt) context;
    }

    @Override // com.google.android.gms.backup.settings.ui.BackupPreference
    public final void o() {
    }
}
