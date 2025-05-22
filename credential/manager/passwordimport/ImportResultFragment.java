package com.google.android.gms.credential.manager.passwordimport;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.passwordimport.ImportResultFragment;
import defpackage.axrd;
import defpackage.axvi;
import defpackage.axvn;
import defpackage.axvo;
import defpackage.axvp;
import defpackage.axvq;
import defpackage.axvr;
import defpackage.axxa;
import defpackage.axxo;
import defpackage.azdk;
import defpackage.dg;
import defpackage.fxqu;
import defpackage.fxqv;
import defpackage.fxqw;
import defpackage.fxwo;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.jxm;
import defpackage.ryt;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ImportResultFragment extends axxo {
    public axrd a;

    public static final axxa y(fxqu fxquVar) {
        return (axxa) fxquVar.a();
    }

    public static final azdk z(final String str) {
        return new azdk(R.layout.pwm_import_result_header, new fxwo() { // from class: axvh
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                View view = (View) obj;
                fxxm.f(view, "$this$SingleViewAdapter");
                ((TextView) view.findViewById(R.id.pwm_import_status_file_hint)).setText(view.getResources().getString(R.string.pwm_import_result_file_hint, str));
                return fxrq.a;
            }
        });
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fxxm.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.pwm_import_result, viewGroup, false);
        dg h = ((ryt) requireContext()).getSupportFragmentManager().h("PWMImportScreenFragment");
        fxxm.c(h);
        fxqu a = fxqv.a(fxqw.c, new axvn(new axvi(h)));
        int i = fxya.a;
        final jxm jxmVar = new jxm(new fxxg(axxa.class), new axvo(a), new axvq(this, a), new axvp(a));
        final RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.pwm_import_result_recycler_view);
        y(jxmVar).r.g(getViewLifecycleOwner(), new axvr(new fxwo() { // from class: axvj
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                axwt axwtVar = (axwt) obj;
                final String b = ImportResultFragment.y(jxmVar).b();
                boolean z = axwtVar instanceof axwq;
                RecyclerView recyclerView2 = RecyclerView.this;
                if (z) {
                    fxxm.c(recyclerView2);
                    final axwq axwqVar = (axwq) axwtVar;
                    recyclerView2.ah(new qx(ImportResultFragment.z(b), new azdk(R.layout.pwm_import_status, new fxwo() { // from class: axvg
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            Resources resources = textView.getResources();
                            int i2 = axwqVar.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_result_imported_passwords_count, i2, Integer.valueOf(i2)));
                            textView.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_ok_icon).setVisibility(0);
                            return fxrq.a;
                        }
                    })));
                } else if (axwtVar instanceof axws) {
                    fxxm.c(recyclerView2);
                    final axws axwsVar = (axws) axwtVar;
                    recyclerView2.ah(new qx(ImportResultFragment.z(b), new azdk(R.layout.pwm_import_status, new fxwo() { // from class: axvb
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            Resources resources = textView.getResources();
                            axws axwsVar2 = axwsVar;
                            List list = axwsVar2.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_result_imported_passwords_count, list.size(), Integer.valueOf(list.size())));
                            textView.setVisibility(0);
                            TextView textView2 = (TextView) view.findViewById(R.id.pwm_import_status_invalid_passwords_count);
                            Resources resources2 = textView2.getResources();
                            List list2 = axwsVar2.b;
                            textView2.setText(resources2.getQuantityString(R.plurals.pwm_import_result_not_imported_passwords_count, list2.size(), Integer.valueOf(list2.size())));
                            textView2.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_warning_icon).setVisibility(0);
                            return fxrq.a;
                        }
                    }), new azdk(R.layout.pwm_import_password_list_header, new fxwo() { // from class: axvc
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_password_list_header)).setText(view.getResources().getString(R.string.pwm_import_result_not_imported_passwords_header));
                            return fxrq.a;
                        }
                    }), new axxl(axwsVar.b), new azdk(), new azdk(R.layout.pwm_import_password_list_header, new fxwo() { // from class: axvd
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_password_list_header)).setText(view.getResources().getString(R.string.pwm_import_result_imported_passwords_header));
                            return fxrq.a;
                        }
                    }), new axxl(axwsVar.a)));
                } else {
                    if (!(axwtVar instanceof axwr)) {
                        throw new fxqx();
                    }
                    fxxm.c(recyclerView2);
                    final axwr axwrVar = (axwr) axwtVar;
                    recyclerView2.ah(new qx(ImportResultFragment.z(b), new azdk(R.layout.pwm_import_status, new fxwo() { // from class: axvf
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_invalid_passwords_count);
                            Resources resources = textView.getResources();
                            int i2 = axwrVar.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_result_not_imported_passwords_count, i2, Integer.valueOf(i2)));
                            textView.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                            return fxrq.a;
                        }
                    })));
                }
                return fxrq.a;
            }
        }));
        final Button button = (Button) inflate.findViewById(R.id.pwm_import_result_delete_file);
        y(jxmVar).t.g(getViewLifecycleOwner(), new axvr(new fxwo() { // from class: axvk
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                button.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
                return fxrq.a;
            }
        }));
        button.setOnClickListener(new View.OnClickListener() { // from class: axvl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImportResultFragment.y(fxqu.this).u.l(true);
            }
        });
        y(jxmVar).v.g(getViewLifecycleOwner(), new axvr(new fxwo() { // from class: axvm
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    fxqu fxquVar = jxmVar;
                    final Button button2 = button;
                    final ImportResultFragment importResultFragment = ImportResultFragment.this;
                    final axxa y = ImportResultFragment.y(fxquVar);
                    fxxm.c(button2);
                    String string = importResultFragment.getResources().getString(R.string.pwm_import_result_delete_file_confirmation, y.b());
                    fxxm.e(string, "getString(...)");
                    edzp edzpVar = new edzp(importResultFragment.requireContext(), R.style.PwmAlertDialogThemeOverlay);
                    edzpVar.C(string);
                    edzpVar.K(R.string.pwm_import_result_delete_file, new DialogInterface.OnClickListener() { // from class: axuz
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            axxa axxaVar = axxa.this;
                            Uri uri = axxaVar.e;
                            if (uri == null) {
                                fxxm.j("importFileUri");
                                uri = null;
                            }
                            ImportResultFragment importResultFragment2 = importResultFragment;
                            axxv axxvVar = axxaVar.b;
                            fxxm.f(uri, "fileUri");
                            boolean deleteDocument = DocumentsContract.deleteDocument(((axxs) axxvVar).b.getContentResolver(), uri);
                            axxaVar.u.l(false);
                            axxaVar.s.l(Boolean.valueOf(!deleteDocument));
                            String string2 = deleteDocument ? importResultFragment2.getResources().getString(R.string.pwm_import_result_file_deleted, axxaVar.b()) : importResultFragment2.getResources().getString(R.string.common_something_went_wrong);
                            Button button3 = button2;
                            fxxm.c(string2);
                            eelx t = eelx.t(button3, string2, -1);
                            t.q(button3);
                            t.i();
                        }
                    });
                    edzpVar.E(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: axve
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            axxa.this.u.l(false);
                        }
                    });
                    edzpVar.a();
                }
                return fxrq.a;
            }
        }));
        if (y(jxmVar).r.ii() == null) {
            x().a();
        }
        ((Button) inflate.findViewById(R.id.pwm_import_result_done)).setOnClickListener(new View.OnClickListener() { // from class: axva
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImportResultFragment.this.x().a();
            }
        });
        fxxm.c(inflate);
        return inflate;
    }

    public final axrd x() {
        axrd axrdVar = this.a;
        if (axrdVar != null) {
            return axrdVar;
        }
        fxxm.j("navigationController");
        return null;
    }
}
