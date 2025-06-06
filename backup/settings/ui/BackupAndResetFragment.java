package com.google.android.gms.backup.settings.ui;

import android.os.Bundle;
import androidx.preference.PreferenceScreen;
import com.google.android.gms.R;
import defpackage.ajwt;
import defpackage.alyt;
import defpackage.auad;
import defpackage.emyt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupAndResetFragment extends alyt {
    private static final auad ag = ajwt.a("BackupAndResetFragment");
    private PreferenceScreen ah;
    public PreferenceScreen d;

    @Override // defpackage.mem
    public final void C(Bundle bundle, String str) {
        A(R.xml.backup_and_reset);
        PreferenceScreen z = z();
        this.d = (PreferenceScreen) z.l("drive_backup");
        this.ah = (PreferenceScreen) z.l("factory_reset");
    }

    @Override // defpackage.alzt
    public final emyt J() {
        return emyt.BACKUP_AND_RESET;
    }

    @Override // defpackage.alzt
    public final String K() {
        return "https://support.google.com/mobile/?p=pixel_backup";
    }

    @Override // defpackage.alzt
    public final String L() {
        return "pixel_backup_reset";
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r0 == 0) goto L10;
     */
    @Override // defpackage.dg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() {
        /*
            r6 = this;
            super.onResume()
            boolean r0 = r6.ab()
            if (r0 == 0) goto L12
            alxy r0 = new alxy
            r0.<init>()
            r6.Y(r0)
            goto L1a
        L12:
            androidx.preference.PreferenceScreen r0 = r6.d
            r1 = 2132084768(0x7f150820, float:1.9809716E38)
            r0.P(r1)
        L1a:
            android.content.Context r0 = r6.getContext()
            int r1 = android.os.UserHandle.myUserId()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r4 = 1
            r5 = 0
            if (r2 < r3) goto L56
            java.lang.String r2 = "device_policy"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.app.admin.DevicePolicyManager r2 = (android.app.admin.DevicePolicyManager) r2
            if (r2 != 0) goto L36
        L34:
            r4 = r5
            goto L5f
        L36:
            java.lang.String r2 = "user"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.os.UserManager r0 = (android.os.UserManager) r0
            android.os.UserHandle r1 = android.os.UserHandle.of(r1)
            java.lang.String r2 = "no_factory_reset"
            int r0 = r0.getUserRestrictionSource(r2, r1)
            if (r0 == 0) goto L34
            if (r0 != r4) goto L4d
            goto L34
        L4d:
            r1 = r0 & 4
            r0 = r0 & 2
            if (r1 != 0) goto L5f
            if (r0 == 0) goto L34
            goto L5f
        L56:
            auad r0 = com.google.android.gms.backup.settings.ui.BackupAndResetFragment.ag
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "Executed in pre-N OS"
            r0.d(r2, r1)
        L5f:
            androidx.preference.PreferenceScreen r0 = r6.ah
            r1 = r4 ^ 1
            r0.H(r1)
            if (r4 == 0) goto L71
            androidx.preference.PreferenceScreen r0 = r6.ah
            r1 = 2132085959(0x7f150cc7, float:1.9812132E38)
            r0.P(r1)
            return
        L71:
            androidx.preference.PreferenceScreen r0 = r6.ah
            r1 = 0
            r0.n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.ui.BackupAndResetFragment.onResume():void");
    }
}
