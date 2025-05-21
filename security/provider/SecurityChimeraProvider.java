package com.google.android.gms.security.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.R;
import defpackage.a;
import defpackage.ccuc;
import defpackage.ccxq;
import defpackage.cvpj;
import defpackage.cxzr;
import defpackage.cyry;
import defpackage.cysb;
import defpackage.cyse;
import defpackage.eitj;
import defpackage.fegu;
import defpackage.fmzv;
import defpackage.frtv;
import defpackage.fruc;
import j$.time.Instant;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SecurityChimeraProvider extends ContentProvider {
    private Context a;
    private ccxq b;
    private cxzr c;

    public static Date c(String str) {
        try {
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance();
            simpleDateFormat.applyPattern("yyyy-MM-dd");
            return simpleDateFormat.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    private final cysb d() {
        return new cyse(this.a).b(false, 10L, TimeUnit.SECONDS);
    }

    final int a() {
        int i = 1;
        if (!this.c.k(this.a) && !this.c.c()) {
            i = -1;
        }
        Settings.Secure.putInt(this.a.getContentResolver(), "package_verifier_state", i);
        return i;
    }

    final int b(String str, String str2) {
        try {
            return this.a.getPackageManager().getResourcesForApplication(str).getIdentifier(str2, "drawable", str);
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        Uri parse;
        List<String> pathSegments;
        Date c;
        String a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (parse = Uri.parse(str2)) != null && "content".equals(parse.getScheme()) && "com.google.android.gms.security.provider".equals(parse.getAuthority()) && parse.getPort() == -1 && (pathSegments = parse.getPathSegments()) != null && pathSegments.size() == 2) {
            if (!str.equals(pathSegments.get(0))) {
                return null;
            }
            String str3 = pathSegments.get(1);
            if ("getText".equals(str)) {
                Bundle bundle2 = new Bundle();
                if ("PackageVerifierSummary".equals(str3)) {
                    if (a() != 1) {
                        a = this.a.getString(R.string.security_status_verify_apps_disabled);
                    } else {
                        cysb d = d();
                        a = d == null ? null : d.a(this.a);
                    }
                    bundle2.putString("com.android.settings.summary", a);
                } else if ("FindDeviceSummary".equals(str3)) {
                    int a2 = this.b.a();
                    bundle2.putString("com.android.settings.summary", a2 == -4 ? this.a.getString(R.string.security_status_no_google_account_summary) : (a2 == -2 || a2 == -3) ? this.a.getString(R.string.security_status_find_device_location_off_summary) : a2 == -1 ? this.a.getString(R.string.common_off) : a2 == 1 ? this.a.getString(R.string.common_on) : null);
                } else if ("SecurityPatchLevelSummary".equals(str3)) {
                    String str4 = Build.VERSION.SECURITY_PATCH;
                    if (TextUtils.isEmpty(str4)) {
                        str4 = null;
                    } else {
                        Date c2 = c(str4);
                        if (c2 != null) {
                            String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), "dMMMMyyyy");
                            str4 = !frtv.a.a().c() ? new SimpleDateFormat(bestDateTimePattern, Locale.getDefault()).format(c2) : DateFormat.format(bestDateTimePattern, c2).toString();
                        }
                    }
                    bundle2.putString("com.android.settings.summary", str4);
                }
                if (bundle2.isEmpty()) {
                    return null;
                }
                return bundle2;
            }
            if ("getIcon".equals(str)) {
                List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(new Intent("android.settings.SETTINGS"), 1114112);
                if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                    ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                    String str5 = activityInfo != null ? activityInfo.packageName : null;
                    if (!TextUtils.isEmpty(str5)) {
                        if ("PackageVerifierIcon".equals(str3)) {
                            cysb d2 = d();
                            r8 = (a() == 1 && (d2 != null ? d2.b : 0) == 0) ? b(str5, "ic_package_verifier_enabled") : b(str5, "ic_package_verifier_disabled");
                        } else if ("FindDeviceIcon".equals(str3)) {
                            r8 = this.b.a() == 1 ? b(str5, "ic_find_device_enabled") : b(str5, "ic_find_device_disabled");
                        } else if ("SecurityPatchLevelIcon".equals(str3)) {
                            String str6 = Build.VERSION.SECURITY_PATCH;
                            if (!TextUtils.isEmpty(str6) && (c = c(str6)) != null) {
                                long j = cyry.a;
                                long time = new Date().getTime() - c.getTime();
                                r8 = time <= 0 ? b(str5, "ic_ota_update_current") : TimeUnit.DAYS.convert(time, TimeUnit.MILLISECONDS) > 90 ? b(str5, "ic_ota_update_none") : b(str5, "ic_ota_update_current");
                            }
                        }
                        if (r8 != 0) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("com.android.settings.icon", r8);
                            bundle3.putString("com.android.settings.icon_package", str5);
                            return bundle3;
                        }
                    }
                }
                return null;
            }
            if ("getState".equals(str)) {
                Bundle bundle4 = new Bundle();
                if (str3.equals("FindMyDeviceState")) {
                    bundle4.putInt("com.google.android.apps.security.securityhub.state", this.b.a());
                    return bundle4;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("FMD state: " + this.b.a());
        printWriter.println("QRL supported: " + ccxq.f(getContext()));
        printWriter.println("QRL enabled: " + ccxq.e(getContext()));
        printWriter.println(a.Z(fruc.j(), "FLAG enableQuickLockAction: "));
        printWriter.println("FLAG quickLockSettingsToggleDefault: " + fruc.s());
        printWriter.println("FLAG quickLockRateLimitDuration: ".concat(String.valueOf(String.valueOf(fegu.c(fruc.c())))));
        printWriter.println("FLAG quickLockRateLimitCount: " + fruc.b());
        printWriter.println("Recent QRL events (within rate limit): ");
        eitj b = ccuc.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            printWriter.println(" - ".concat(String.valueOf(((Instant) b.get(i)).toString())));
        }
        printWriter.println("FLAG enableSecurityQuestion: " + fruc.k());
        printWriter.println("FLAG quickLockAllowsBiometrics: " + fruc.n());
        printWriter.println("FLAG quickLockDisablesNfc: " + fruc.o());
        printWriter.println("FLAG quickLockHidesPrivateNotifications: " + fruc.p());
        printWriter.println("FLAG quickLockNotifiesUser: " + fruc.q());
        printWriter.println("FLAG quickLockRequiresAccount: " + fruc.r());
        printWriter.println("FLAG quickLockAddSearchEntry: " + fruc.m());
        printWriter.println("FLAG enableMandatoryBiometricsQrlToggle: " + fruc.i());
        printWriter.println("FLAG enableSettingsIconForQrlToggleBiometric: " + fruc.a.a().k());
        printWriter.println("FLAG enableFeedback: " + fruc.h());
        printWriter.println("FLAG feedbackCategoryTag: ".concat(String.valueOf(fruc.e())));
        printWriter.println("FLAG enableSettingsSecure: " + fruc.l());
        printWriter.println("FLAG restrictSettingsSecureToReadOnlyForOems: " + fruc.u());
        printWriter.println("FLAG requireTelephonySubscriptionFeature: " + fruc.t());
        printWriter.println(a.Z(fmzv.f(), "FLAG checkTheftProtectionSupportInCode: "));
        printWriter.println("Theft protection supported: " + cvpj.a(getContext()));
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        this.a = context;
        this.b = new ccxq(context);
        this.c = new cxzr(this.a);
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
